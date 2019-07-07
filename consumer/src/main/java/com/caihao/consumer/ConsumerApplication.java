package com.caihao.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/6 16:59
 */
@SpringBootApplication(scanBasePackages = "com.caihao.consumer.controller")
public class ConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class,args);
  }
}
