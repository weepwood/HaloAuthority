package com.itheima.pinda.authority.biz.service.auth;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Halo
 * @create 2021/12/04 下午 03:41
 * @description 验证码 Service
 */
public interface ValidateCodeService {
    /**
     * 生成验证码
     */
    void create(String key, HttpServletResponse response) throws IOException;

    /**
     * 校验验证码
     * @param key   前端上送 key
     * @param code 前端上送待校验值
     */
    boolean check(String key, String code);
}