package com.example.demo22222.hj.entity;


public class Order {

  private long oid;
  private double amount;
  private double freight;
  private java.sql.Date transporttime;
  private String state;
  private java.sql.Date placeordertime;
  private String orderclasses;
  private long uid;


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
