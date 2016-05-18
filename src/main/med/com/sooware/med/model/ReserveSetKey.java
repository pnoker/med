package com.sooware.med.model;

import java.io.Serializable;

public class ReserveSetKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reserve_set.app_id
     *
     * @mbggenerated
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reserve_set.week
     *
     * @mbggenerated
     */
    private Integer week;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reserve_set
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reserve_set.app_id
     *
     * @return the value of reserve_set.app_id
     *
     * @mbggenerated
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reserve_set.app_id
     *
     * @param appId the value for reserve_set.app_id
     *
     * @mbggenerated
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reserve_set.week
     *
     * @return the value of reserve_set.week
     *
     * @mbggenerated
     */
    public Integer getWeek() {
        return week;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reserve_set.week
     *
     * @param week the value for reserve_set.week
     *
     * @mbggenerated
     */
    public void setWeek(Integer week) {
        this.week = week;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve_set
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
        ReserveSetKey other = (ReserveSetKey) that;
        return (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve_set
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve_set
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
        sb.append(", week=").append(week);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}