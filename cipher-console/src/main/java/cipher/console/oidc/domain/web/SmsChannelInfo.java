package cipher.console.oidc.domain.web;

import java.util.Date;

public class SmsChannelInfo {
    private Integer id;

    private String name;

    private Integer state;

    private Integer companyId;

    private Integer type;

    private String parameter;

    private Integer limitTime;

    private Date createTime;

    private Date modifyTime;

    private RonglianSmsConfigInfo ronglianSmsConfigInfo;

    private AliyunSmsConfigInfo aliyunSmsConfigInfo;


    public RonglianSmsConfigInfo getRonglianSmsConfigInfo() {
        return ronglianSmsConfigInfo;
    }

    public void setRonglianSmsConfigInfo(RonglianSmsConfigInfo ronglianSmsConfigInfo) {
        this.ronglianSmsConfigInfo = ronglianSmsConfigInfo;
    }

    public AliyunSmsConfigInfo getAliyunSmsConfigInfo() {
        return aliyunSmsConfigInfo;
    }

    public void setAliyunSmsConfigInfo(AliyunSmsConfigInfo aliyunSmsConfigInfo) {
        this.aliyunSmsConfigInfo = aliyunSmsConfigInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public Integer getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}