package com.son.project.service;

import com.son.sonapi_common.service.InnerUserInterfaceInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * 用户接口信息服务测试
 *
 * @author sonson
 */
@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private InnerUserInterfaceInfoService innerUserInterfaceInfoService;

    @Test
    public void invokeCount() {
        boolean b = innerUserInterfaceInfoService.invokeCount(1L, 1L);
        Assertions.assertTrue(b);
    }
}