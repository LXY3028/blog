package com.hx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hx.entity.Visitor;

/**
 *  服务类
 *
 */
public interface VisitorService extends IService<Visitor> {
    /**
     * 通过uuid查询是否存在是该uuid的访客
     *
     * @param uuid
     * @return
     */
    boolean hasUUID(String uuid);

    /**
     * 通过uuid查询访客
     *
     * @param uuid
     * @return
     */
    Visitor getVisitorByUuid(String uuid);
    /**
     * 获取Pv
     *
     * @return pv
     */
    int getPv();
}
