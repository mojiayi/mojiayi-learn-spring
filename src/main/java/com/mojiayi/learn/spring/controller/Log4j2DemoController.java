package com.mojiayi.learn.spring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Administrator on 2017/7/13.
 */
@RestController
@RequestMapping("/log4j2-demo")
public class Log4j2DemoController {
    public static final Logger LOGGER = LogManager.getLogger(Log4j2DemoController.class);

    @RequestMapping("/debug-level")
    public void outputDebugLog() {
        LOGGER.debug("this is debug log");
    }

    @RequestMapping("/info-level")
    public void outputInfoLevel() {
        LOGGER.info("this is info log");
    }

    @RequestMapping("/warn-level")
    public void outputWarnLevel() {
        LOGGER.warn("this is warn log");
    }

    @RequestMapping("/error-level")
    public void outputErrorLevel() {
        LOGGER.error("this is error log");
    }

    @RequestMapping("/all-level")
    public void outputAllLevel() {
        ThreadContext.put("uniq", UUID.randomUUID().toString());
        LOGGER.debug("this is debug log");
        LOGGER.info("this is info log");
        LOGGER.warn("this is warn log");
        LOGGER.error("this is error log");
    }
}
