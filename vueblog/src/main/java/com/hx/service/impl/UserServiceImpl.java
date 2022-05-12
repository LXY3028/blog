package com.hx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.common.lang.vo.UserInfo;
import com.hx.entity.User;
import com.hx.mapper.UserMapper;
import com.hx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 查询所有用户（只含有部分信息）
     *
     * @return 用户（只含有部分信息）list
     */
    @Override
    public List<UserInfo> getUserInfoList(){
        List<UserInfo> userInfos = userMapper.getUserInfo();
        return  userInfos;
    }
}
