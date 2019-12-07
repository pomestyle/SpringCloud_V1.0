/*
 *
 * JcJdchgz.java
 * Copyright(C) 2017-2020 fendo公司
 * @date 2019-08-07
 */
package com.example.zuui;

import java.math.BigDecimal;

/**
 * 机动车合格证
 * Created by Mybatis Generator on 2019/08/07
 *
 * @author wangl
 */

public class JcJdchgz {
    /**
     * 合格证编号
     */
    private String jdczccchgz;

    /**
     * 车辆序列号
     */
    private String clxlh;

    /**
     * 是否新能源,Y是新能源 N其他
     */
    private String sfxny;

    /**
     * 车辆类别代码
     */
    private String cllbDm;

    /**
     * 车辆厂牌型号
     */
    private String clcpxh;

    /**
     * 车辆型号
     */
    private String clxh;

    /**
     * 厂牌
     */
    private String clcp;

    /**
     * 吨位
     */
    private BigDecimal cldw;

    /**
     * 座位数
     */
    private int zws;

    /**
     * 排气量
     */
    private String pql;

    /**
     * 车辆购置税燃料能源种类代码
     */
    private String clgzsrlnyzlDm;

    /**
     * 产地属性
     */
    private String cdsx;

    /**
     * 车辆类型代码
     */
    private String cllxDm;

    /**
     * 产地
     */
    private String cd;

    /**
     * 车辆生产企业名称
     */
    private String clscqymc;

    /**
     * 最低计税价格
     */
    private BigDecimal zdjsjg;

    /**
     * 版本号
     */
    private String bbh;

    /**
     * 车辆识别代号
     */
    private String clsbdh;

    /**
     * 车辆名称
     */
    private String clmc;

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc;
    }

    public String getJdczccchgz() {
        return jdczccchgz;
    }

    public void setJdczccchgz(String jdczccchgz) {
        this.jdczccchgz = jdczccchgz;
    }

    public String getClxlh() {
        return clxlh;
    }

    public void setClxlh(String clxlh) {
        this.clxlh = clxlh;
    }

    public String getSfxny() {
        return sfxny;
    }

    public void setSfxny(String sfxny) {
        this.sfxny = sfxny;
    }

    public String getCllbDm() {
        return cllbDm;
    }

    public void setCllbDm(String cllbDm) {
        this.cllbDm = cllbDm;
    }

    public String getClcpxh() {
        return clcpxh;
    }

    public void setClcpxh(String clcpxh) {
        this.clcpxh = clcpxh;
    }

    public String getClxh() {
        return clxh;
    }

    public void setClxh(String clxh) {
        this.clxh = clxh;
    }

    public String getClcp() {
        return clcp;
    }

    public void setClcp(String clcp) {
        this.clcp = clcp;
    }

    public BigDecimal getCldw() {
        return cldw;
    }

    public void setCldw(BigDecimal cldw) {
        this.cldw = cldw;
    }

    public int getZws() {
        return zws;
    }

    public void setZws(int zws) {
        this.zws = zws;
    }

    public String getPql() {
        return pql;
    }

    public void setPql(String pql) {
        this.pql = pql;
    }

    public String getClgzsrlnyzlDm() {
        return clgzsrlnyzlDm;
    }

    public void setClgzsrlnyzlDm(String clgzsrlnyzlDm) {
        this.clgzsrlnyzlDm = clgzsrlnyzlDm;
    }

    public String getCdsx() {
        return cdsx;
    }

    public void setCdsx(String cdsx) {
        this.cdsx = cdsx;
    }

    public String getCllxDm() {
        return cllxDm;
    }

    public void setCllxDm(String cllxDm) {
        this.cllxDm = cllxDm;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getClscqymc() {
        return clscqymc;
    }

    public void setClscqymc(String clscqymc) {
        this.clscqymc = clscqymc;
    }

    public BigDecimal getZdjsjg() {
        return zdjsjg;
    }

    public void setZdjsjg(BigDecimal zdjsjg) {
        this.zdjsjg = zdjsjg;
    }

    public String getBbh() {
        return bbh;
    }

    public void setBbh(String bbh) {
        this.bbh = bbh;
    }

    public String getClsbdh() {
        return clsbdh;
    }

    public void setClsbdh(String clsbdh) {
        this.clsbdh = clsbdh;
    }


    @Override
    public String toString() {
        return "JcJdchgz{" +
                "jdczccchgz='" + jdczccchgz + '\'' +
                ", clxlh='" + clxlh + '\'' +
                ", sfxny='" + sfxny + '\'' +
                ", cllbDm='" + cllbDm + '\'' +
                ", clcpxh='" + clcpxh + '\'' +
                ", clxh='" + clxh + '\'' +
                ", clcp='" + clcp + '\'' +
                ", cldw=" + cldw +
                ", zws=" + zws +
                ", pql=" + pql +
                ", clgzsrlnyzlDm='" + clgzsrlnyzlDm + '\'' +
                ", cdsx='" + cdsx + '\'' +
                ", cllxDm='" + cllxDm + '\'' +
                ", cd='" + cd + '\'' +
                ", clscqymc='" + clscqymc + '\'' +
                ", zdjsjg=" + zdjsjg +
                ", bbh='" + bbh + '\'' +
                ", clsbdh='" + clsbdh + '\'' +
                '}';
    }
}