package com.landa.nameplatesystem.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogExampleOther {
    public static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExampleOther.class);

    public static void main(String... args) {
        log.error("Something else is wrong here");
        log.debug("Something else is wrong here");
        log.info("Something else is wrong here");
        log.trace("Something else is wrong here");
    }
}
