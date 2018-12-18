package com.example.demo22222.hj.entity;


public class User {

  private long uid;             //用户ID
  private String name;          //用户名
  private String password;      //密码
  private String sex;           //性别
  private java.sql.Date birth;  //出生日期
  private String telephone;     //手机号码
  private String phone;         //固定电话
  private String email;         //Email
  private String msn;           //MSN（聊天工具）
  private String qq;            //QQ号码
  private String workunit;      //工作单位
  private double balance;       //余额
  private long diyongjuan;      //抵用卷（张）
  private long lipinka;         //礼品卡（张）


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public java.sql.Date getBirth() {
    return birth;
  }

  public void setBirth(java.sql.Date birth) {
    this.birth = birth;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getMsn() {
    return msn;
  }

  public void setMsn(String msn) {
    this.msn = msn;
  }


  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }


  public String getWorkunit() {
    return workunit;
  }

  public void setWorkunit(String workunit) {
    this.workunit = workunit;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


  public long getDiyongjuan() {
    return diyongjuan;
  }

  public void setDiyongjuan(long diyongjuan) {
    this.diyongjuan = diyongjuan;
  }


  public long getLipinka() {
    return lipinka;
  }

  public void setLipinka(long lipinka) {
    this.lipinka = lipinka;
  }

}
