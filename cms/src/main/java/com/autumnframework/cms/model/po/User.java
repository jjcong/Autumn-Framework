package com.autumnframework.cms.model.po;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.user_login_name
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private String user_login_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.username
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.password
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.status
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.creator
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.creator_id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private Integer creator_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.create_time
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private Date create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.modifier
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private String modifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.modifier_id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private Integer modifier_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column af_user.modifier_time
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    private Date modifier_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.id
     *
     * @return the value of af_user.id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.id
     *
     * @param id the value for af_user.id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.user_login_name
     *
     * @return the value of af_user.user_login_name
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public String getUser_login_name() {
        return user_login_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.user_login_name
     *
     * @param user_login_name the value for af_user.user_login_name
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setUser_login_name(String user_login_name) {
        this.user_login_name = user_login_name == null ? null : user_login_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.username
     *
     * @return the value of af_user.username
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.username
     *
     * @param username the value for af_user.username
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.password
     *
     * @return the value of af_user.password
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.password
     *
     * @param password the value for af_user.password
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.status
     *
     * @return the value of af_user.status
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.status
     *
     * @param status the value for af_user.status
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.creator
     *
     * @return the value of af_user.creator
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.creator
     *
     * @param creator the value for af_user.creator
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.creator_id
     *
     * @return the value of af_user.creator_id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public Integer getCreator_id() {
        return creator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.creator_id
     *
     * @param creator_id the value for af_user.creator_id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setCreator_id(Integer creator_id) {
        this.creator_id = creator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.create_time
     *
     * @return the value of af_user.create_time
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.create_time
     *
     * @param create_time the value for af_user.create_time
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.modifier
     *
     * @return the value of af_user.modifier
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.modifier
     *
     * @param modifier the value for af_user.modifier
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.modifier_id
     *
     * @return the value of af_user.modifier_id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public Integer getModifier_id() {
        return modifier_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.modifier_id
     *
     * @param modifier_id the value for af_user.modifier_id
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setModifier_id(Integer modifier_id) {
        this.modifier_id = modifier_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column af_user.modifier_time
     *
     * @return the value of af_user.modifier_time
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public Date getModifier_time() {
        return modifier_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column af_user.modifier_time
     *
     * @param modifier_time the value for af_user.modifier_time
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    public void setModifier_time(Date modifier_time) {
        this.modifier_time = modifier_time;
    }
}