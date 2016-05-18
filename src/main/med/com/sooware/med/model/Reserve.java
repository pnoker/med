package com.sooware.med.model;

import java.io.Serializable;
import java.util.Date;

public class Reserve extends ReserveKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reserve.app_id
     *
     * @mbggenerated
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reserve.ap
     *
     * @mbggenerated
     */
    private Integer ap;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reserve.at_time
     *
     * @mbggenerated
     */
    private Date atTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reserve
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reserve.app_id
     *
     * @return the value of reserve.app_id
     *
     * @mbggenerated
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reserve.app_id
     *
     * @param appId the value for reserve.app_id
     *
     * @mbggenerated
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reserve.ap
     *
     * @return the value of reserve.ap
     *
     * @mbggenerated
     */
    public Integer getAp() {
        return ap;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reserve.ap
     *
     * @param ap the value for reserve.ap
     *
     * @mbggenerated
     */
    public void setAp(Integer ap) {
        this.ap = ap;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reserve.at_time
     *
     * @return the value of reserve.at_time
     *
     * @mbggenerated
     */
    public Date getAtTime() {
        return atTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reserve.at_time
     *
     * @param atTime the value for reserve.at_time
     *
     * @mbggenerated
     */
    public void setAtTime(Date atTime) {
        this.atTime = atTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
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
        Reserve other = (Reserve) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getAp() == null ? other.getAp() == null : this.getAp().equals(other.getAp()))
            && (this.getAtTime() == null ? other.getAtTime() == null : this.getAtTime().equals(other.getAtTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getAp() == null) ? 0 : getAp().hashCode());
        result = prime * result + ((getAtTime() == null) ? 0 : getAtTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appId=").append(appId);
        sb.append(", ap=").append(ap);
        sb.append(", atTime=").append(atTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}