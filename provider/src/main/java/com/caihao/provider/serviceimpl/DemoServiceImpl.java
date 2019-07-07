package com.caihao.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.caihao.api.service.DemoService;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/6 16:49
 */
@Service(
    version = "1.0.0",
    application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}",
    registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {

  @Override
  public String sayHello(String name) {
    return "hi," + name;
  }
}
