package com.halo.service;

import com.itheima.pinda.log.entity.OptLogDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Halo
 * @create 2021/11/12 下午 11:37
 * @description
 */
@Service
@Slf4j
public class LogService {
    // 将日志信息保存到数据库
    public void saveLog(OptLogDTO optLogDTO){
        // 此处只是将日志信息进行输出，实际项目中可以将日志信息保存到数据库
        log.debug("保存日志信息：" + optLogDTO);
    }
}