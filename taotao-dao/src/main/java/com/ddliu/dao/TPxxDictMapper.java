package com.ddliu.dao;

import com.ddliu.entity.po.TPxxDict;

import java.util.List;

public interface TPxxDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PXX_DICT
     *
     * @mbggenerated
     */
    int insert(TPxxDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PXX_DICT
     *
     * @mbggenerated
     */
    List<TPxxDict> selectAll();
}