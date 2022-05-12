package com.hx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.common.lang.vo.UserInfo;
import com.hx.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 获取用户部分信息list
     */
    @Select("select id, nickname, username, avatar, email, status, create_time, update_time, role  from user  order by create_time desc")
    List<UserInfo> getUserInfo();

}
