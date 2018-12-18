package com.example.demo22222.hj.entity;


public class Order {

  private long oid;     //订单ID
  private double amount;//订单总金额
  private double freight;//配送费用
  private java.sql.Date transporttime;//配送时间
  private String state;//订单状态
  private java.sql.Date placeordertime;//下单时间
  private String orderclasses;//订单类别
  private long uid;          //外键：用户ID


  public long getOid() {
    return oid;
  }

  public void setOid(long oid) {
    this.oid = oid;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public double getFreight() {
    return freight;
  }

  public void setFreight(double freight) {
    this.freight = freight;
  }


  public java.sql.Date getTransporttime() {
    return transporttime;
  }

  public void setTransporttime(java.sql.Date transporttime) {
    this.transporttime = transporttime;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public java.sql.Date getPlaceordertime() {
    return placeordertime;
  }

  public void setPlaceordertime(java.sql.Date placeordertime) {
    this.placeordertime = placeordertime;
  }


  public String getOrderclasses() {
    return orderclasses;
  }

  public void setOrderclasses(String orderclasses) {
    this.orderclasses = orderclasses;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

}
