package com.example.demo22222.hj.entity;


public class Addresses {

  private long aid;         //地址id
  private long uid;         //地址
  private String address;   //外键：用户id


  public long getAid() {
    return aid;
  }

  public void setAid(long aid) {
    this.aid = aid;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
