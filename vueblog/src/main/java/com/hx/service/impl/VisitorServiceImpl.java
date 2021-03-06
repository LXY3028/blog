package com.hx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.entity.Visitor;
import com.hx.mapper.VisitorMapper;
import com.hx.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 *
 */
@Service
public class VisitorServiceImpl extends ServiceImpl<VisitorMapper, Visitor> implements VisitorService {
    @Autowired
    VisitorMapper visitorMapper;

    /**
     * 通过uuid查询是否存在是该uuid的访客
     *
     * @param uuid
     * @return
     */
    @Override
    public boolean hasUUID(String uuid) {
        return visitorMapper.hasUUID(uuid) == 0 ? false : true;
    }

    /**
     * 通过uuid查询访客
     *
     * @param uuid
     * @return
     */
    @Override
    public Visitor getVisitorByUuid(String uuid){
        return visitorMapper.selectByUuid(uuid);
    }

    /**
     * 获取Pv
     *
     * @return pv
     */
    @Override
    public int getPv(){
        return  visitorMapper.getPv();
    }


}
