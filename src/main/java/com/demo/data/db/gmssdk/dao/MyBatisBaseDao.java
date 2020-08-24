package com.demo.data.db.gmssdk.dao;

import java.io.Serializable;

/**
 * @Description DAO公共基类，由MybatisGenerator自动生成请勿修改
 * @param <Model> The Model Class 这里是泛型不是Model类
 * @param <PK> The Primary Key Class 如果是无主键，则可以用Model来跳过，如果是多主键则是Key类
 * @Author demo
 * @Date 2020/7/23 9:42
 * @Version 1.0
 */
public interface MyBatisBaseDao<Model, PK extends Serializable> {

    int deleteByPrimaryKey(PK id);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(PK id);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKeyWithBLOBs(Model record);

    int updateByPrimaryKey(Model record);
}