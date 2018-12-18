package com.example.demo22222.hj.config;

import com.alibaba.druid.support.http.StatViewFilter;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 开启监测功能：
 *   1.检查和分析数据库得运行情况
 *   2.优化数据库得访问性能
 * 步骤：
 *   1.一个监控的服务器
 *   2.过滤器 -白名单，黑名单
 *              即通过访问者得ip地址来控制访问得来源。增加数据库得安全设置
 * */
@Configuration
public class DruidConfig {
    //定义一个监控的服务器
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean servletRegistrationBean=
                new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        //ip白名单
        servletRegistrationBean.addInitParameter("allow","127.0.0.1");
        //ip黑名单(当两个共同存在时，黑名单优先于白名单)
  //      servletRegistrationBean.addInitParameter("deny","192.168.50.61");
        //控制台得用户名与密码
        servletRegistrationBean.addInitParameter("loginUsername","druid");
        servletRegistrationBean.addInitParameter("loginPassword","123456");
        //是否能够重置数据
        servletRegistrationBean.addInitParameter("resetEnable","false");
        return servletRegistrationBean;
    }
    //定义一个过滤器  -所有路径都经过过滤器，来监听sql语句
    public FilterRegistrationBean statFilter(){
        FilterRegistrationBean filterRegistrationBean=
                new FilterRegistrationBean(new StatViewFilter());
        //添加过滤规则 -允许谁进去过滤器
        filterRegistrationBean.addUrlPatterns("/*");
        //忽略过滤得格式
        filterRegistrationBean.addInitParameter
                ("exclusions","*.js,*.css,*.jpg,*.png,*.jif,/druid/*");
        return filterRegistrationBean;
    }
}
