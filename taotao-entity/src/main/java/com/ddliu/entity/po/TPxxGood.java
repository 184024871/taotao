package com.ddliu.entity.po;

import java.io.Serializable;

public class TPxxGood implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_GOOD.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_GOOD.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_GOOD.price
     *
     * @mbggenerated
     */
    private String price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_GOOD.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_GOOD.fwsm_ids
     *
     * @mbggenerated
     */
    private String fwsmIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PXX_GOOD.rbxq_id
     *
     * @mbggenerated
     */
    private String rbxqId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_PXX_GOOD
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_GOOD.id
     *
     * @return the value of T_PXX_GOOD.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_GOOD.id
     *
     * @param id the value for T_PXX_GOOD.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_GOOD.name
     *
     * @return the value of T_PXX_GOOD.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_GOOD.name
     *
     * @param name the value for T_PXX_GOOD.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_GOOD.price
     *
     * @return the value of T_PXX_GOOD.price
     *
     * @mbggenerated
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_GOOD.price
     *
     * @param price the value for T_PXX_GOOD.price
     *
     * @mbggenerated
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_GOOD.description
     *
     * @return the value of T_PXX_GOOD.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_GOOD.description
     *
     * @param description the value for T_PXX_GOOD.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_GOOD.fwsm_ids
     *
     * @return the value of T_PXX_GOOD.fwsm_ids
     *
     * @mbggenerated
     */
    public String getFwsmIds() {
        return fwsmIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_GOOD.fwsm_ids
     *
     * @param fwsmIds the value for T_PXX_GOOD.fwsm_ids
     *
     * @mbggenerated
     */
    public void setFwsmIds(String fwsmIds) {
        this.fwsmIds = fwsmIds == null ? null : fwsmIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PXX_GOOD.rbxq_id
     *
     * @return the value of T_PXX_GOOD.rbxq_id
     *
     * @mbggenerated
     */
    public String getRbxqId() {
        return rbxqId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PXX_GOOD.rbxq_id
     *
     * @param rbxqId the value for T_PXX_GOOD.rbxq_id
     *
     * @mbggenerated
     */
    public void setRbxqId(String rbxqId) {
        this.rbxqId = rbxqId == null ? null : rbxqId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PXX_GOOD
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
        sb.append(", price=").append(price);
        sb.append(", description=").append(description);
        sb.append(", fwsmIds=").append(fwsmIds);
        sb.append(", rbxqId=").append(rbxqId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}