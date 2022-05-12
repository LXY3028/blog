package com.hx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.entity.Type;
import com.hx.mapper.TypeMapper;
import com.hx.service.TypeService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}
