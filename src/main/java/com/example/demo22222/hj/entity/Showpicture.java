package com.example.demo22222.hj.entity;


public class Showpicture {

  private long pid;      //图片ID
  private String path;   //路径
  private long gid;      //外键：商品ID


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }

}
