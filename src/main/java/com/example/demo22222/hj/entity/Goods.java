package com.example.demo22222.hj.entity;


public class Goods {

  private long gid;             //商品ID
  private String commodity;     //商品名称
  private double marketprice;   //市场价
  private double price;         //商城价
  private String area;          //配送范围
  private String specification; //规格
  private long countryid;       //外键：进口国ID
  private long pid;             //外键：产地ID
  private long smallid;         //外键：小类别ID
  private long bigid;           //外键：大类别ID
  private long activityid;      //外键：活动ID

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

  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }


  public String getCommodity() {
    return commodity;
  }

  public void setCommodity(String commodity) {
    this.commodity = commodity;
  }


  public double getMarketprice() {
    return marketprice;
  }

  public void setMarketprice(double marketprice) {
    this.marketprice = marketprice;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public String getSpecification() {
    return specification;
  }

  public void setSpecification(String specification) {
    this.specification = specification;
  }


  public long getCountryid() {
    return countryid;
  }

  public void setCountryid(long countryid) {
    this.countryid = countryid;
  }


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }

  public long getActivityid() {
    return activityid;
  }

  public void setActivityid(long activityid) {
    this.activityid = activityid;
  }

}
