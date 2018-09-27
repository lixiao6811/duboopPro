package com.hsf.api.service;

import com.hsf.api.bean.User;

/**
 * <pre>
 * 名称: ${file_name}
 * 描述:
 * </pre>
 *
 * @author huangshengfeng
 * @since 1.0.0
 */
public interface IUserService {

    User selectByUid(Long uid);
}
