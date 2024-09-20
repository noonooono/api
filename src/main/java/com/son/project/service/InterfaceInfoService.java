package com.son.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.son.sonapi_common.model.entity.InterfaceInfo;

/**
* @author son
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-02 11:53:39
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
