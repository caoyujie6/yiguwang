package com.example.demo22222.hj.entity;


//商品详情图
public class Detailspicture {

  private long tid;       //详情图ID
  private String path;    //图片路径
  private long gid;       //商品ID


  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
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
