package com.sample;


public class Foods {

  private long fid;
  private String foodname;
  private long hits;
  private String material;
  private String ingredients;
  private String kitchenware;
  private String step;


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