package com.hx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.entity.Friend;
import com.hx.mapper.FriendMapper;
import com.hx.service.FriendService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 */
@Service
public class FriendServiceImpl extends ServiceImpl<FriendMapper, Friend> implements FriendService {

}
