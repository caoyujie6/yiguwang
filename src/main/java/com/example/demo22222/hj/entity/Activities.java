package com.example.demo22222.hj.entity;

//000
public class Activities {

  private long activityid;   //活动
  private String activity;   //活动类别
  private double originalprice; //原价
  private double current_Price; //特价


  public long getActivityid() {
    return activityid;
  }

  public void setActivityid(long activityid) {
    this.activityid = activityid;
  }


  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }


  public double getOriginalprice() {
    return originalprice;
  }

  public void setOriginalprice(double originalprice) {
    this.originalprice = originalprice;
  }


  public double getCurrent_Price() {
    return current_Price;
  }

  public void setCurrent_Price(double current_Price) {
    this.current_Price = current_Price;
  }

}
