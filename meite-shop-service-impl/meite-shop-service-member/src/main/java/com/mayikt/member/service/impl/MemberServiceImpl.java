package com.mayikt.member.service.impl;

import com.mayikt.entity.AppEntity;
import com.mayikt.member.feign.WeiXinServiceFeign;
import com.mayikt.member.service.MemberService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @desc
 * @create 2019-12-03 22:57
 */
@RestController
public class MemberServiceImpl implements MemberService{

    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;

    @Override
    public AppEntity memberToWeiXin() {
        return weiXinServiceFeign.getApp();
    }
}
