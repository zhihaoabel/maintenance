package com.ruoyi.common.wechat.util;

import com.ruoyi.common.wechat.WechatConstants;
import com.ruoyi.common.wechat.config.WxMpProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Abel
 * @since 2/4/2023 1:48 AM
 */
@Component
public class RedisUtils {

    @Resource
    private WxMpProperties properties;

    public String getChannelCodeKey() {
        return String.format(WechatConstants.CHANNEL_CODE_RULE, properties.getConfigs().get(0).getAppId());
    }
}
