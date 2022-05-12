package com.hx.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * 账户信息实体类
 *
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
    private String role;
}

