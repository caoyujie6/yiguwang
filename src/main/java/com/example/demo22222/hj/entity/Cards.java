package com.example.demo22222.hj.entity;


//卡卷
public class Cards {

  private long cid;                 //卡id
  private String cardnumber;        //卡号
  private String cardpassword;      //卡密码
  private String cardclasses;       //卡类别
  private double money;             //金额
  private java.sql.Date starttime;  //开始时间
  private java.sql.Date endtime;    //结束时间
  private String cardstate;         //卡状态
  private long uid;                 //用户id


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
  }


  public String getCardpassword() {
    return cardpassword;
  }

  public void setCardpassword(String cardpassword) {
    this.cardpassword = cardpassword;
  }


  public String getCardclasses() {
    return cardclasses;
  }

  public void setCardclasses(String cardclasses) {
    this.cardclasses = cardclasses;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public java.sql.Date getStarttime() {
    return starttime;
  }

  public void setStarttime(java.sql.Date starttime) {
    this.starttime = starttime;
  }


  public java.sql.Date getEndtime() {
    return endtime;
  }

  public void setEndtime(java.sql.Date endtime) {
    this.endtime = endtime;
  }


  public String getCardstate() {
    return cardstate;
  }

  public void setCardstate(String cardstate) {
    this.cardstate = cardstate;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

}
