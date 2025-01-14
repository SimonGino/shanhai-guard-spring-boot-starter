package com.wangshanhai.guard.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义Body解码规则
 * @author Shmily
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "shanhai.decodebody")
public class DecodeBodyConfig {
    /**
     * 是否开启
     */
    private Boolean enable=false;
    /**
     * 解密模式（1: 全量 2:自定义 默认：1）
     */
    private Integer mode=1;
}
