package com.ebs.mapper;

import com.ebs.model.UserBean;

public interface UserBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String usercode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int insert(UserBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int insertSelective(UserBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    UserBean selectByPrimaryKey(String usercode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserBean record);
}