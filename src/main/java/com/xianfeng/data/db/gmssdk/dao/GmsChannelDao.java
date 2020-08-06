package com.xianfeng.data.db.gmssdk.dao;

import com.xianfeng.data.db.gmssdk.bean.GmsChannel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description GmsChannelDAO继承基类
 * @Author xianfeng
 * @Date 2020/7/23 9:42
 * @Version 1.0
 */
@Repository
public interface GmsChannelDao extends MyBatisBaseDao<GmsChannel, Integer> {

    List<GmsChannel> selectChannels();
}