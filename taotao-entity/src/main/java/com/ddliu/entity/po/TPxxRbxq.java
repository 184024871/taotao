package com.ddliu.entity.po;

import java.io.Serializable;

public class TPxxRbxq implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_RBXQ.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_RBXQ.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_RBXQ.rule
     *
     * @mbggenerated
     */
    private String rule;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_PXX_RBXQ
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_RBXQ.id
     *
     * @return the value of T_PXX_RBXQ.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_RBXQ.id
     *
     * @param id the value for T_PXX_RBXQ.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_RBXQ.name
     *
     * @return the value of T_PXX_RBXQ.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_RBXQ.name
     *
     * @param name the value for T_PXX_RBXQ.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_RBXQ.rule
     *
     * @return the value of T_PXX_RBXQ.rule
     *
     * @mbggenerated
     */
    public String getRule() {
        return rule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_RBXQ.rule
     *
     * @param rule the value for T_PXX_RBXQ.rule
     *
     * @mbggenerated
     */
    public void setRule(String rule) {
        this.rule = rule == null ? null : rule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PXX_RBXQ
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", rule=").append(rule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}