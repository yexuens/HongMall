package com.yexue.ums.controller;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.yexue.ums.entity.User;
import com.yexue.ums.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yexue
 * @since 2024-06-15
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userServiceImpl;

    @GetMapping("/info")
    User info(){
        return userServiceImpl.getById(1);
    }
    @RequestMapping("/hello")
    String hello(){
        return  "hello";
    }
}
