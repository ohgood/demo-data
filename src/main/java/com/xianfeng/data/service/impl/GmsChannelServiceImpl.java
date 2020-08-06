package com.xianfeng.data.service.impl;

import com.xianfeng.data.db.gmssdk.bean.GmsChannel;
import com.xianfeng.data.db.gmssdk.dao.GmsChannelDao;
import com.xianfeng.data.service.GmsChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author xianfeng
 * @Date 2020/7/23 10:21
 * @Version 1.0
 */
@Service
public class GmsChannelServiceImpl implements GmsChannelService {

    @Autowired
    GmsChannelDao gmsChannelDAO;

    /**
     * @description 查询渠道
     * @author xianfeng
     * @updateTime 2020/7/23 10:37 
     * @throws 
     */
    @Override
    public List<GmsChannel> selectChannels() {
        return gmsChannelDAO.selectChannels();
    }
}
