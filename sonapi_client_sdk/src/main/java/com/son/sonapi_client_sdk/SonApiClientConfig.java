package com.son.sonapi_client_sdk;

import com.son.sonapi_client_sdk.client.SonApiClient;
import com.son.sonapi_client_sdk.client.SonApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Api 客户端配置
 *
 * @author sonson
 */
@Configuration
@ConfigurationProperties("sonapi.client")
@Data
@ComponentScan
public class SonApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public SonApiClient sonApiClient() {
        return new SonApiClient(accessKey, secretKey);
    }

}
