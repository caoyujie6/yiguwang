package com.example.demo22222.hj.entity;


public class Foods {

  private long fid;             //食品id
  private String foodname;      //食品名称
  private String foodclasses;   //食品类别
  private long hits;            //点赞数
  private String material;      //用料
  private String ingredients;   //辅料
  private String kitchenware;   //厨具
  private String step;          //步骤

  public String getFoodclasses() {
    return foodclasses;
  } 

  public void setFoodclasses(String foodclasses) {
    this.foodclasses = foodclasses;
  }

  public long getFid() {
    return fid;
  }

  public void setFid(long fid) {
    this.fid = fid;
  }


  public String getFoodname() {
    return foodname;
  }

  public void setFoodname(String foodname) {
    this.foodname = foodname;
  }


  public long getHits() {
    return hits;
  }

  public void setHits(long hits) {
    this.hits = hits;
  }


  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }


  public String getIngredients() {
    return ingredients;
  }

  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }


  public String getKitchenware() {
    return kitchenware;
  }

  public void setKitchenware(String kitchenware) {
    this.kitchenware = kitchenware;
  }


  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }

}
