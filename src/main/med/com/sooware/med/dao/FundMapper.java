package com.sooware.med.dao;

import com.sooware.med.model.Fund;

public interface FundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbggenerated
     */
    int insert(Fund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbggenerated
     */
    int insertSelective(Fund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbggenerated
     */
    Fund selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Fund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Fund record);
}