package com.mayikt.member.feign;

import com.mayikt.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author admin
 * @desc
 * @create 2019-12-03 23:07
 */
@FeignClient("app-mayikt-weixin")
public interface WeiXinServiceFeign extends WeiXinService {

}
