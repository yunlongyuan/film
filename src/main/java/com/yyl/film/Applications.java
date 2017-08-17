package com.yyl.film;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/8/17.
 */
@SpringBootApplication
@MapperScan("com.yyl.film.mapper")
public class Applications {

    public static void main(String[] args){
        SpringApplication.run(Applications.class,args);
    }
}
