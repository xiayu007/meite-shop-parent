package com.mayikt.weixin.service;

import com.mayikt.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author admin
 * @desc 微信服务接口
 * @create 2019-12-03 22:30
 */
@Api(tags = "微信服务")
public interface WeiXinService {


    /**
     * 获取app应用信息
     *
     * @return
     */
    @GetMapping("/getApp")
    @ApiOperation("微信应用程序接口")
    public AppEntity getApp();
}
