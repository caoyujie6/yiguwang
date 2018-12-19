package com.example.demo22222.hj.entity;

public class Activities {

  private long activityid;      //活动
  private String activity;      //活动类别
  private double originalprice; //特价

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
}
