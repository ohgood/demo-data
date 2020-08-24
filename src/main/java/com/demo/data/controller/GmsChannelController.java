package com.demo.data.controller;

import com.demo.data.db.gmssdk.bean.GmsChannel;
import com.demo.data.service.GmsChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 渠道控制器
 * @Author demo
 * @Date 2020/7/23 10:39
 * @Version 1.0
 */
@RestController
@RequestMapping("/gmsChannel")
public class GmsChannelController extends BaseController{

    @Autowired
    GmsChannelService gmsChannelServiceImpl;
    
    /**
     * @description 获取渠道列表
     * @author demo
     * @return
     * @updateTime 2020/7/23 10:44
     * @throws
     */
    @RequestMapping("/selectChannels")
    public List<GmsChannel> selectChannels() {
        return gmsChannelServiceImpl.selectChannels();
    }

}
