package com.example.demo22222.hj.entity;


public class Bigclasses {

  private long bigid;           //大类别ID
  private String bigclasses;    //大类别名称
  private long firstlyid;       //外键：首页类ID

  public long getFirstlyid() {
    return firstlyid;
  }

  public void setFirstlyid(long firstlyid) {
    this.firstlyid = firstlyid;
  }

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

}
