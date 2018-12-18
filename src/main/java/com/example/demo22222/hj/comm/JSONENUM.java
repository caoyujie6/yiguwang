package com.example.demo22222.hj.comm;

public enum JSONENUM {
    CHENGGONG(1,"成功"),SHIBAI(2,"参数异常:参数为空或者参数类型不符"),CANSHUYOUWU(3,"未知异常");

    private int zhuangtai;
    private String xiaoxi;

    public int getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(int zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getXiaoxi() {
        return xiaoxi;
    }

    public void setXiaoxi(String xiaoxi) {
        this.xiaoxi = xiaoxi;
    }
    private JSONENUM(int s, String zhuangtai) {
        this.zhuangtai=s;
        this.xiaoxi=zhuangtai;
    }
    public static String getxiaoxi(int zhuangtai){
        for (JSONENUM JSONENUM : JSONENUM.values()){
            if (JSONENUM.getZhuangtai()==zhuangtai){
                return JSONENUM.getXiaoxi();
            }
        }
        return null;
    }
}
