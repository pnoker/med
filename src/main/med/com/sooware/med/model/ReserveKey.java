package com.sooware.med.model;

import java.io.Serializable;

public class ReserveKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reserve.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reserve.week
     *
     * @mbggenerated
     */
    private Integer week;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reserve
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reserve.user_id
     *
     * @return the value of reserve.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reserve.user_id
     *
     * @param userId the value for reserve.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reserve.week
     *
     * @return the value of reserve.week
     *
     * @mbggenerated
     */
    public Integer getWeek() {
        return week;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reserve.week
     *
     * @param week the value for reserve.week
     *
     * @mbggenerated
     */
    public void setWeek(Integer week) {
        this.week = week;
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
        ReserveKey other = (ReserveKey) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()));
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
        sb.append(", userId=").append(userId);
        sb.append(", week=").append(week);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}