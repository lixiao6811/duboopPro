package com.hsf.provider.service;

import com.hsf.api.bean.User;
import com.hsf.api.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
@Service
public class UserServiceImpl2 implements IUserService {

    @Override
    public User selectByUid(Long uid) {
        log.info("selectByUid:{}",uid);
        User user = new User();
        user.setUid(1L);
        user.setMobile("17600402632");
        user.setName("李晓");
        return user;
    }
}
