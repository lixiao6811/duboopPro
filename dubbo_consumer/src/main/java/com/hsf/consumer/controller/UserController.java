package com.hsf.consumer.controller;

import com.hsf.api.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * <pre>
 * 名称: ${file_name}
 * 描述:
 * </pre>
 *
 * @author huangshengfeng
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private IUserService userServiceImpl;

    @GetMapping(value = "/get-{uid}")
    public Object getUser(@PathVariable Long uid){
       return userServiceImpl.selectByUid(uid);
    }

}
