package com.hx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.entity.Tag;
import com.hx.mapper.TagMapper;
import com.hx.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
