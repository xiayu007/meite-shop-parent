package com.mayikt.weixin.service.impl;

import com.mayikt.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @desc
 * @create 2019-12-03 22:34
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {

    @Override
    public AppEntity getApp() {
        return new AppEntity("123","夏雨");
    }

}
