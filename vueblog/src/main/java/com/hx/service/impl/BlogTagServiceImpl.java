package com.hx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.entity.BlogTag;
import com.hx.mapper.BlogTagMapper;
import com.hx.service.BlogTagService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 */
@Service
public class BlogTagServiceImpl extends ServiceImpl<BlogTagMapper, BlogTag> implements BlogTagService {

}
