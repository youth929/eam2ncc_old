package com.ssx.eam2ncc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 系统用户信息表(Xtyhxx)实体类
 *
 * @author youth
 * @since 2022-03-25 09:02:48
 */
public class Xtyhxx implements Serializable {
    private static final long serialVersionUID = 667661698635819109L;
    /**
     * 操作员管理单位，系统自动将操作员管理单位置为所有者单位；
     * 共享库管理员可以利用设置操作员管理单位功能修改任意普通操作员的管理单位，操作员的管理单位决定了操作员可登录单位，操作员的可登陆单位只能是其管理单位自身或其关联单位的下级
     */
    private String dwdm;
    /**
     * 用户代码
     */
    private Long yhdm;
    /**
     * 登入名称
     */
    private String yhmc;
    /**
     * 显示名称
     */
    private String xsmc;
    /**
     * 用户密码(已作废)
     */
    private String yhmm;
    /**
     * 网页密码
     */
    private String javamm;
    /**
     * 用户操作类型:0-普通用户、1-管理用户、2-审批用户、3-审计用户
     */
    private Long czlx;
    /**
     * 普通用户标志
     */
    private Long yhbz;
    /**
     * 是否不做权限检测。0：检测，1：不检测
     */
    private Long jcqx;
    /**
     * 用户安全认证信息
     */
    private String autheninfo;
    /**
     * 分类ID
     */
    private Long flid;
    /**
     * 登入时间标志。0：永久有效；1：开始时间和终止时间时间段里有效；2：永久无效。
     */
    private Long sjbz;
    /**
     * 功能审批标志。0：已审批，1：待审批。
     */
    private Long gnbz;
    /**
     * 停用标志。0或null：未被停用；1：已停用。
     */
    private Long stoped;
    /**
     * IC卡。null：待分配；0：待审批；1：已审批。
     */
    private Long ick;
    /**
     * IC卡数据
     */
    private String icksj;
    /**
     * 开始日期
     */
    private Date ksrq;
    /**
     * 结束日期
     */
    private Date zzrq;
    /**
     * 对应职工对象代码
     */
    private Long xtdxid;
    /**
     * 手机号
     */
    private String movetel;
    /**
     * IP地址
     */
    private String ipaddr;
    /**
     * 网卡
     */
    private String netcard;
    /**
     * CPU号
     */
    private String cpucode;
    /**
     * 用户类型。0或null：fmis用户；1：LDAP用户；2：第三方认证用户。
     */
    private Long usertype;
    /**
     * 非fmis用户的认证信息
     */
    private String userident;
    /**
     * 操作员的来源单位
     */
    private String dh;
    /**
     * 是否需要修改密码
     */
    private INTEGER isneedchgpwd;
    /**
     * 密码使用周期
     */
    private INTEGER pwdusefullife;
    /**
     * 上次修改密码时间
     */
    private Date chgpwdlasttime;
    /**
     * 历史密码信息MODIFYBYRTC407439长度168调整1024
     */
    private String historypwdinfo;
    /**
     * 用户外部编码
     */
    private String yhbm;
    /**
     * 对象单位
     */
    private String dxdw;
    /**
     * 用户邮箱地址
     */
    private String email;
    /**
     * 单位编码
     */
    private String compid;
    /**
     * 是否共享为集团统一数据。0，否；1，是。
     */
    private Double isshare;
    /**
     * 密集，与原WJCUSTS（用户表）中密集处理方式一致
     */
    private Long securgrd;
    /**
     * 默认打印机标志 默认标志 0或者空 表示选择打印不用默认 1表示打印用默认的设置
     */
    private String enabledefaultprint;
    /**
     * 抽取标志 0不抽取 1抽取
     */
    private String enableupdown;
    /**
     * 用户所属类别:0-普通、1-系统审计、2-系统管理、3-业务配置、4-系统审批
     */
    private String usersslb;
    /**
     * 组织ID
     */
    private String vpdCompid;
    /**
     * 用户认证类型，0表示普通用户名密码认证，1表示证书认证
     */
    private INTEGER authtype;
    /**
     * 设置下级管理员不可见，0-可见；1-不可见，默认0
     */
    private String lowermaninvisible;
    /**
     * 租户ID
     */
    private String ownerid;
    /**
     * 应用ID
     */
    private String appid;
    /**
     * GID
     */
    private String gid;
    /**
     * 性别
     */
    private String sex;


    public String getDwdm() {
        return dwdm;
    }

    public void setDwdm(String dwdm) {
        this.dwdm = dwdm;
    }

    public Long getYhdm() {
        return yhdm;
    }

    public void setYhdm(Long yhdm) {
        this.yhdm = yhdm;
    }

    public String getYhmc() {
        return yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
    }

    public String getXsmc() {
        return xsmc;
    }

    public void setXsmc(String xsmc) {
        this.xsmc = xsmc;
    }

    public String getYhmm() {
        return yhmm;
    }

    public void setYhmm(String yhmm) {
        this.yhmm = yhmm;
    }

    public String getJavamm() {
        return javamm;
    }

    public void setJavamm(String javamm) {
        this.javamm = javamm;
    }

    public Long getCzlx() {
        return czlx;
    }

    public void setCzlx(Long czlx) {
        this.czlx = czlx;
    }

    public Long getYhbz() {
        return yhbz;
    }

    public void setYhbz(Long yhbz) {
        this.yhbz = yhbz;
    }

    public Long getJcqx() {
        return jcqx;
    }

    public void setJcqx(Long jcqx) {
        this.jcqx = jcqx;
    }

    public String getAutheninfo() {
        return autheninfo;
    }

    public void setAutheninfo(String autheninfo) {
        this.autheninfo = autheninfo;
    }

    public Long getFlid() {
        return flid;
    }

    public void setFlid(Long flid) {
        this.flid = flid;
    }

    public Long getSjbz() {
        return sjbz;
    }

    public void setSjbz(Long sjbz) {
        this.sjbz = sjbz;
    }

    public Long getGnbz() {
        return gnbz;
    }

    public void setGnbz(Long gnbz) {
        this.gnbz = gnbz;
    }

    public Long getStoped() {
        return stoped;
    }

    public void setStoped(Long stoped) {
        this.stoped = stoped;
    }

    public Long getIck() {
        return ick;
    }

    public void setIck(Long ick) {
        this.ick = ick;
    }

    public String getIcksj() {
        return icksj;
    }

    public void setIcksj(String icksj) {
        this.icksj = icksj;
    }

    public Date getKsrq() {
        return ksrq;
    }

    public void setKsrq(Date ksrq) {
        this.ksrq = ksrq;
    }

    public Date getZzrq() {
        return zzrq;
    }

    public void setZzrq(Date zzrq) {
        this.zzrq = zzrq;
    }

    public Long getXtdxid() {
        return xtdxid;
    }

    public void setXtdxid(Long xtdxid) {
        this.xtdxid = xtdxid;
    }

    public String getMovetel() {
        return movetel;
    }

    public void setMovetel(String movetel) {
        this.movetel = movetel;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getNetcard() {
        return netcard;
    }

    public void setNetcard(String netcard) {
        this.netcard = netcard;
    }

    public String getCpucode() {
        return cpucode;
    }

    public void setCpucode(String cpucode) {
        this.cpucode = cpucode;
    }

    public Long getUsertype() {
        return usertype;
    }

    public void setUsertype(Long usertype) {
        this.usertype = usertype;
    }

    public String getUserident() {
        return userident;
    }

    public void setUserident(String userident) {
        this.userident = userident;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public INTEGER getIsneedchgpwd() {
        return isneedchgpwd;
    }

    public void setIsneedchgpwd(INTEGER isneedchgpwd) {
        this.isneedchgpwd = isneedchgpwd;
    }

    public INTEGER getPwdusefullife() {
        return pwdusefullife;
    }

    public void setPwdusefullife(INTEGER pwdusefullife) {
        this.pwdusefullife = pwdusefullife;
    }

    public Date getChgpwdlasttime() {
        return chgpwdlasttime;
    }

    public void setChgpwdlasttime(Date chgpwdlasttime) {
        this.chgpwdlasttime = chgpwdlasttime;
    }

    public String getHistorypwdinfo() {
        return historypwdinfo;
    }

    public void setHistorypwdinfo(String historypwdinfo) {
        this.historypwdinfo = historypwdinfo;
    }

    public String getYhbm() {
        return yhbm;
    }

    public void setYhbm(String yhbm) {
        this.yhbm = yhbm;
    }

    public String getDxdw() {
        return dxdw;
    }

    public void setDxdw(String dxdw) {
        this.dxdw = dxdw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
    }

    public Double getIsshare() {
        return isshare;
    }

    public void setIsshare(Double isshare) {
        this.isshare = isshare;
    }

    public Long getSecurgrd() {
        return securgrd;
    }

    public void setSecurgrd(Long securgrd) {
        this.securgrd = securgrd;
    }

    public String getEnabledefaultprint() {
        return enabledefaultprint;
    }

    public void setEnabledefaultprint(String enabledefaultprint) {
        this.enabledefaultprint = enabledefaultprint;
    }

    public String getEnableupdown() {
        return enableupdown;
    }

    public void setEnableupdown(String enableupdown) {
        this.enableupdown = enableupdown;
    }

    public String getUsersslb() {
        return usersslb;
    }

    public void setUsersslb(String usersslb) {
        this.usersslb = usersslb;
    }

    public String getVpdCompid() {
        return vpdCompid;
    }

    public void setVpdCompid(String vpdCompid) {
        this.vpdCompid = vpdCompid;
    }

    public INTEGER getAuthtype() {
        return authtype;
    }

    public void setAuthtype(INTEGER authtype) {
        this.authtype = authtype;
    }

    public String getLowermaninvisible() {
        return lowermaninvisible;
    }

    public void setLowermaninvisible(String lowermaninvisible) {
        this.lowermaninvisible = lowermaninvisible;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}

