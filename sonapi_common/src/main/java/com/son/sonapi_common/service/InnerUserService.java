package com.son.sonapi_common.service;


import com.son.sonapi_common.model.entity.User;

/**
 * 内部用户服务
 *
 * @author sonson
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
