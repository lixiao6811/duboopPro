package com.hsf.api.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <pre>
 * 名称: ${file_name}
 * 描述:
 * </pre>
 *
 * @author huangshengfeng
 * @since 1.0.0
 */
@Getter
@Setter
public class User implements Serializable {
    private static final long serialVersionUID = -3137375707741635252L;

    private Long uid;
    private String name;
    private String mobile;

}
