package com.demo.data.service;


import com.demo.data.db.gmssdk.bean.GmsChannel;

import java.util.List;

/**
 * @Description GmsChannelService
 * @Author demo
 * @Date 2020/7/23 9:42
 * @Version 1.0
 */
public interface GmsChannelService {

    List<GmsChannel> selectChannels();
}