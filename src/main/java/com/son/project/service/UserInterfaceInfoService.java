package com.son.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.son.sonapi_common.model.entity.UserInterfaceInfo;

/**
 * 用户接口信息服务
 *
 * @author sonson
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {


    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
