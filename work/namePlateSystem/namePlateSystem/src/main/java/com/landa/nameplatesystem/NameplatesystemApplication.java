package com.landa.nameplatesystem;

import com.landa.nameplatesystem.utils.Constants;
import com.landa.nameplatesystem.utils.LogExampleOther;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.landa.nameplatesystem.pojo")     //扫描实体类
@MapperScan("com.landa.nameplatesystem.dao")
public class NameplatesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(NameplatesystemApplication.class, args);
        LogExampleOther.log.info(Constants.SYSTEMNAME+":启动");
    }

}
