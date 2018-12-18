package com.example.demo22222.hj.entity;


//进出口国
public class Country {

  private long countryid;            //进出口国id
  private String importingcountry;   //进出口国
  private String description;       //描述


  public long getCountryid() {
    return countryid;
  }

  public void setCountryid(long countryid) {
    this.countryid = countryid;
  }


  public String getImportingcountry() {
    return importingcountry;
  }

  public void setImportingcountry(String importingcountry) {
    this.importingcountry = importingcountry;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
