package com.mayikt.member.service;

import com.mayikt.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author admin
 * @desc 会员服务接口
 * @create 2019-12-03 22:53
 */
@Api(tags = "会员服务接口")
public interface MemberService {


    @ApiOperation("会员服务调用微信服务")
    @GetMapping("/memberToWeiXin")
    AppEntity memberToWeiXin();
}
