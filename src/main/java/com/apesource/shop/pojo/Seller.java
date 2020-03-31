package com.apesource.shop.pojo;

public class Seller {

    private  int sellerId; //用户ID
    private  String name; //公司名
    private  String nickName; //店铺名称
    private  String password; //密码
    private  String email;//EMAIL
    private  String mobile;//公司手机
    private  String telephone;//公司电话
    private  int status; //状态  0通过 1 未通过 2 关闭
    private  String addressDetail;//详细地址
    private  String linkmanName;//联系人姓名
    private  String linkmanQq;//联系人QQ
    private  String linkmanMobile; //联系人电话
    private  String linkmanEmail;//联系人EMAIL
    private  String licenseNumber;//营业执照号
    private  String taxNumber;//税务登记证号
    private  String orgNumber;//组织机构代码
    private  String address;//公司地址
    private  String logoPic;//公司LOGO图
    private  String brief;//简介
    private  String createTime;//创建日期
    private  String legalPerson;//法定代表人
    private  String legalPerson_card_id;//法定代表人身份证
    private  String bankUser;//开户行账号名称
    private  String  bankName;//开户行
    private  String bankName1;//开户行支行
    private int page;
    private int pagesize;

    public Seller(int sellerId, String name, String nickName, String password, String email, String mobile, String telephone, int status, String addressDetail, String linkmanName, String linkmanQq, String linkmanMobile, String linkmanEmail, String licenseNumber, String taxNumber, String orgNumber, String address, String logoPic, String brief, String createTime, String legalPerson, String legalPerson_card_id, String bankUser, String bankName, String bankName1, int page, int pagesize) {
        this.sellerId = sellerId;
        this.name = name;
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.telephone = telephone;
        this.status = status;
        this.addressDetail = addressDetail;
        this.linkmanName = linkmanName;
        this.linkmanQq = linkmanQq;
        this.linkmanMobile = linkmanMobile;
        this.linkmanEmail = linkmanEmail;
        this.licenseNumber = licenseNumber;
        this.taxNumber = taxNumber;
        this.orgNumber = orgNumber;
        this.address = address;
        this.logoPic = logoPic;
        this.brief = brief;
        this.createTime = createTime;
        this.legalPerson = legalPerson;
        this.legalPerson_card_id = legalPerson_card_id;
        this.bankUser = bankUser;
        this.bankName = bankName;
        this.bankName1 = bankName1;
        this.page = page;
        this.pagesize = pagesize;
    }

    public Seller() {
    }

    public int getPage() {
        return page;
    }



    public void setPage(int page) {
        this.page = page;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getLinkmanQq() {
        return linkmanQq;
    }

    public void setLinkmanQq(String linkmanQq) {
        this.linkmanQq = linkmanQq;
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile;
    }

    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogoPic() {
        return logoPic;
    }

    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPerson_card_id() {
        return legalPerson_card_id;
    }

    public void setLegalPerson_card_id(String legalPerson_card_id) {
        this.legalPerson_card_id = legalPerson_card_id;
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName1() {
        return bankName1;
    }

    public void setBankName1(String bankName1) {
        this.bankName1 = bankName1;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", telephone='" + telephone + '\'' +
                ", status=" + status +
                ", addressDetail='" + addressDetail + '\'' +
                ", linkmanName='" + linkmanName + '\'' +
                ", linkmanQq='" + linkmanQq + '\'' +
                ", linkmanMobile='" + linkmanMobile + '\'' +
                ", linkmanEmail='" + linkmanEmail + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", orgNumber='" + orgNumber + '\'' +
                ", address='" + address + '\'' +
                ", logoPic='" + logoPic + '\'' +
                ", brief='" + brief + '\'' +
                ", createTime='" + createTime + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                ", legalPerson_card_id='" + legalPerson_card_id + '\'' +
                ", bankUser='" + bankUser + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankName1='" + bankName1 + '\'' +
                ", page=" + page +
                ", pagesize=" + pagesize +
                '}';
    }
}
