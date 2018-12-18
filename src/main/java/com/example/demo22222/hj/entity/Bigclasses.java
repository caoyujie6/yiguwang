package com.example.demo22222.hj.entity;


public class Bigclasses {

  private long bigid;        //小类别ID
  private String bigclasses;//大类别名称
  private long smallid;     //外键：小类别ID


  public long getBigid() {
    return bigid;
  }

  public void setBigid(long bigid) {
    this.bigid = bigid;
  }


  public String getBigclasses() {
    return bigclasses;
  }

  public void setBigclasses(String bigclasses) {
    this.bigclasses = bigclasses;
  }


  public long getSmallid() {
    return smallid;
  }

  public void setSmallid(long smallid) {
    this.smallid = smallid;
  }

}
