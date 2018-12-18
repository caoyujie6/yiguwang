package com.example.demo22222.hj.comm;

public class JsonUilt {
    private static int zhuangtaima;//状态吗
    private static String zhuangtaixiaoxi;//状态信息
    private static Object object;//对象
    //构造参数私有化
    private JsonUilt(Object object,int zhuangtaima,String zhuangtaixiaoxi){
        this.object=object;
        this.zhuangtaima=zhuangtaima;
        this.zhuangtaixiaoxi=zhuangtaixiaoxi;
    }
    private JsonUilt(int zhuangtaima,String  zhuangtaixiaoxi){
        this.object=null;
        this.zhuangtaima=zhuangtaima;
        this.zhuangtaixiaoxi=zhuangtaixiaoxi;
    }
    private JsonUilt(){
    }

    public static JsonUilt getJson(Object object){
        try {
            if (object==null){
                JsonUilt json=new JsonUilt(2,JSONENUM.getxiaoxi(JsonUilt.zhuangtaima));
                json.object=null;
                return json;
            }else {
                return new JsonUilt(1,JSONENUM.getxiaoxi(JsonUilt.zhuangtaima));
            }
        }catch (Exception e){
            JsonUilt.object=null;
            return new JsonUilt(3,JSONENUM.getxiaoxi(JsonUilt.zhuangtaima));
        }
    }
}
