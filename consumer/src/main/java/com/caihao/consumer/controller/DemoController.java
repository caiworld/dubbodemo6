package com.caihao.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.caihao.api.service.DemoService;
import com.caihao.dubboprovider01.entity.Doctor;
import com.caihao.dubboprovider01.service.DoctorService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/6 17:05
 */
@RestController
public class DemoController {

  @Reference(version = "1.0.0",
      application = "${dubbo.application.id}",
      url = "dubbo://localhost:12345")
  private DemoService demoService;

  @Reference(version = "1.0.0",
      application = "${dubbo.application.id}",
      url = "dubbo://localhost:12345")
  private DoctorService doctorService;

  @GetMapping("/say_hello")
  public String sayHello(@RequestParam String name) {
    List<Doctor> doctorList = doctorService.getDoctorList();
    System.out.println(doctorList.size());
    for (Doctor doctor : doctorList) {
      System.out.println(doctor);
    }
    return demoService.sayHello(name);
  }


}
