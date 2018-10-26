package com.istone.codetest;

import com.istone.codetest.channel.DatabaseChannel;
import com.istone.codetest.channel.QueueChannel;
import com.istone.codetest.channel.SlackChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class CodeTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeTestApplication.class, args);
    }

}
