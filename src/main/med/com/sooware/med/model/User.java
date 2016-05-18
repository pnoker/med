package com.sooware.med.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_pw
     *
     * @mbggenerated
     */
    private String userPw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.pay_id
     *
     * @mbggenerated
     */
    private String payId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.pay_pw
     *
     * @mbggenerated
     */
    private String payPw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.marry
     *
     * @mbggenerated
     */
    private Integer marry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbggenerated
     */
    private Date birthday;
    private String age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mail
     *
     * @mbggenerated
     */
    private String mail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.qq
     *
     * @mbggenerated
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.country
     *
     * @mbggenerated
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.district
     *
     * @mbggenerated
     */
    private String district;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.w_code
     *
     * @mbggenerated
     */
    private String wCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.w_name
     *
     * @mbggenerated
     */
    private String wName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.w_logo
     *
     * @mbggenerated
     */
    private String wLogo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ywgm
     *
     * @mbggenerated
     */
    private String ywgm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.hys
     *
     * @mbggenerated
     */
    private String hys;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.jzbs
     *
     * @mbggenerated
     */
    private String jzbs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.jwbs
     *
     * @mbggenerated
     */
    private String jwbs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.at_time
     *
     * @mbggenerated
     */
    private Date atTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_pw
     *
     * @return the value of user.user_pw
     *
     * @mbggenerated
     */
    public String getUserPw() {
        return userPw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_pw
     *
     * @param userPw the value for user.user_pw
     *
     * @mbggenerated
     */
    public void setUserPw(String userPw) {
        this.userPw = userPw == null ? null : userPw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.pay_id
     *
     * @return the value of user.pay_id
     *
     * @mbggenerated
     */
    public String getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.pay_id
     *
     * @param payId the value for user.pay_id
     *
     * @mbggenerated
     */
    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.pay_pw
     *
     * @return the value of user.pay_pw
     *
     * @mbggenerated
     */
    public String getPayPw() {
        return payPw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.pay_pw
     *
     * @param payPw the value for user.pay_pw
     *
     * @mbggenerated
     */
    public void setPayPw(String payPw) {
        this.payPw = payPw == null ? null : payPw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.marry
     *
     * @return the value of user.marry
     *
     * @mbggenerated
     */
    public Integer getMarry() {
        return marry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.marry
     *
     * @param marry the value for user.marry
     *
     * @mbggenerated
     */
    public void setMarry(Integer marry) {
        this.marry = marry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbggenerated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbggenerated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mobile
     *
     * @return the value of user.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mobile
     *
     * @param mobile the value for user.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mail
     *
     * @return the value of user.mail
     *
     * @mbggenerated
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mail
     *
     * @param mail the value for user.mail
     *
     * @mbggenerated
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.qq
     *
     * @return the value of user.qq
     *
     * @mbggenerated
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.qq
     *
     * @param qq the value for user.qq
     *
     * @mbggenerated
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.country
     *
     * @return the value of user.country
     *
     * @mbggenerated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.country
     *
     * @param country the value for user.country
     *
     * @mbggenerated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.province
     *
     * @return the value of user.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.province
     *
     * @param province the value for user.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.city
     *
     * @return the value of user.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.city
     *
     * @param city the value for user.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.district
     *
     * @return the value of user.district
     *
     * @mbggenerated
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.district
     *
     * @param district the value for user.district
     *
     * @mbggenerated
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.address
     *
     * @param address the value for user.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.w_code
     *
     * @return the value of user.w_code
     *
     * @mbggenerated
     */
    public String getwCode() {
        return wCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.w_code
     *
     * @param wCode the value for user.w_code
     *
     * @mbggenerated
     */
    public void setwCode(String wCode) {
        this.wCode = wCode == null ? null : wCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.w_name
     *
     * @return the value of user.w_name
     *
     * @mbggenerated
     */
    public String getwName() {
        return wName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.w_name
     *
     * @param wName the value for user.w_name
     *
     * @mbggenerated
     */
    public void setwName(String wName) {
        this.wName = wName == null ? null : wName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.w_logo
     *
     * @return the value of user.w_logo
     *
     * @mbggenerated
     */
    public String getwLogo() {
        return wLogo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.w_logo
     *
     * @param wLogo the value for user.w_logo
     *
     * @mbggenerated
     */
    public void setwLogo(String wLogo) {
        this.wLogo = wLogo == null ? null : wLogo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.memo
     *
     * @return the value of user.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.memo
     *
     * @param memo the value for user.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ywgm
     *
     * @return the value of user.ywgm
     *
     * @mbggenerated
     */
    public String getYwgm() {
        return ywgm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ywgm
     *
     * @param ywgm the value for user.ywgm
     *
     * @mbggenerated
     */
    public void setYwgm(String ywgm) {
        this.ywgm = ywgm == null ? null : ywgm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.hys
     *
     * @return the value of user.hys
     *
     * @mbggenerated
     */
    public String getHys() {
        return hys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.hys
     *
     * @param hys the value for user.hys
     *
     * @mbggenerated
     */
    public void setHys(String hys) {
        this.hys = hys == null ? null : hys.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.jzbs
     *
     * @return the value of user.jzbs
     *
     * @mbggenerated
     */
    
    public String getJzbs() {
        return jzbs;
    }

    public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.jzbs
     *
     * @param jzbs the value for user.jzbs
     *
     * @mbggenerated
     */
    public void setJzbs(String jzbs) {
        this.jzbs = jzbs == null ? null : jzbs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.jwbs
     *
     * @return the value of user.jwbs
     *
     * @mbggenerated
     */
    public String getJwbs() {
        return jwbs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.jwbs
     *
     * @param jwbs the value for user.jwbs
     *
     * @mbggenerated
     */
    public void setJwbs(String jwbs) {
        this.jwbs = jwbs == null ? null : jwbs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.at_time
     *
     * @return the value of user.at_time
     *
     * @mbggenerated
     */
    public Date getAtTime() {
        return atTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.at_time
     *
     * @param atTime the value for user.at_time
     *
     * @mbggenerated
     */
    public void setAtTime(Date atTime) {
        this.atTime = atTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserPw() == null ? other.getUserPw() == null : this.getUserPw().equals(other.getUserPw()))
            && (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
            && (this.getPayPw() == null ? other.getPayPw() == null : this.getPayPw().equals(other.getPayPw()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getMarry() == null ? other.getMarry() == null : this.getMarry().equals(other.getMarry()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getwCode() == null ? other.getwCode() == null : this.getwCode().equals(other.getwCode()))
            && (this.getwName() == null ? other.getwName() == null : this.getwName().equals(other.getwName()))
            && (this.getwLogo() == null ? other.getwLogo() == null : this.getwLogo().equals(other.getwLogo()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getYwgm() == null ? other.getYwgm() == null : this.getYwgm().equals(other.getYwgm()))
            && (this.getHys() == null ? other.getHys() == null : this.getHys().equals(other.getHys()))
            && (this.getJzbs() == null ? other.getJzbs() == null : this.getJzbs().equals(other.getJzbs()))
            && (this.getJwbs() == null ? other.getJwbs() == null : this.getJwbs().equals(other.getJwbs()))
            && (this.getAtTime() == null ? other.getAtTime() == null : this.getAtTime().equals(other.getAtTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserPw() == null) ? 0 : getUserPw().hashCode());
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getPayPw() == null) ? 0 : getPayPw().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getMarry() == null) ? 0 : getMarry().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getwCode() == null) ? 0 : getwCode().hashCode());
        result = prime * result + ((getwName() == null) ? 0 : getwName().hashCode());
        result = prime * result + ((getwLogo() == null) ? 0 : getwLogo().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getYwgm() == null) ? 0 : getYwgm().hashCode());
        result = prime * result + ((getHys() == null) ? 0 : getHys().hashCode());
        result = prime * result + ((getJzbs() == null) ? 0 : getJzbs().hashCode());
        result = prime * result + ((getJwbs() == null) ? 0 : getJwbs().hashCode());
        result = prime * result + ((getAtTime() == null) ? 0 : getAtTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userPw=").append(userPw);
        sb.append(", payId=").append(payId);
        sb.append(", payPw=").append(payPw);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", marry=").append(marry);
        sb.append(", birthday=").append(birthday);
        sb.append(", mobile=").append(mobile);
        sb.append(", mail=").append(mail);
        sb.append(", qq=").append(qq);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", wCode=").append(wCode);
        sb.append(", wName=").append(wName);
        sb.append(", wLogo=").append(wLogo);
        sb.append(", memo=").append(memo);
        sb.append(", ywgm=").append(ywgm);
        sb.append(", hys=").append(hys);
        sb.append(", jzbs=").append(jzbs);
        sb.append(", jwbs=").append(jwbs);
        sb.append(", atTime=").append(atTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}