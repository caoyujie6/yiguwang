package com.example.demo22222.hj.entity;


public class Smallclasses {

  private long smallid;         //小类别ID
  private String smallclasses;  //小类别名称
  private long bigid;           //大类别ID

  public long getBigid() {
    return bigid;
  }

  public void setBigid(long bigid) {
    this.bigid = bigid;
  }

  public long getSmallid() {
    return smallid;
  }

  public void setSmallid(long smallid) {
    this.smallid = smallid;
  }


  public String getSmallclasses() {
    return smallclasses;
  }

  public void setSmallclasses(String smallclasses) {
    this.smallclasses = smallclasses;
  }

}
