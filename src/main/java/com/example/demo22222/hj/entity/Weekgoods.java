package com.example.demo22222.hj.entity;


public class Weekgoods {

  private long weekgoodsid; //本周爆品ID
  private long gid;         //外键：商品ID


  public long getWeekgoodsid() {
    return weekgoodsid;
  }

  public void setWeekgoodsid(long weekgoodsid) {
    this.weekgoodsid = weekgoodsid;
  }


  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }

}
