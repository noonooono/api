package com.son.sonapi_interface;

import com.son.sonapi_client_sdk.client.SonApiClient;
import com.son.sonapi_client_sdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

@SpringBootTest
class sonapiInterfaceApplicationTests {

    @Resource
    private SonApiClient sonApiClient;


    @Test
    void contextLoads() throws UnsupportedEncodingException {

        String son = sonApiClient.getNameByGet("son");
        User user = new User();
        user.setUsername("家雄");
        String usernameByPost = sonApiClient.getUsernameByPost(user);

        System.out.println(son);
        System.out.println(usernameByPost);
    }

}
