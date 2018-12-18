package com.sample;


public class Cards {

  private long cid;
  private String cardnumber;
  private String cardpassword;
  private String cardclasses;
  private double money;
  private java.sql.Date starttime;
  private java.sql.Date endtime;
  private String cardstate;
  private long uid;


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
