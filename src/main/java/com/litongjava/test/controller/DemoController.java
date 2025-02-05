package com.litongjava.test.controller;

import com.litongjava.annotation.Get;
import com.litongjava.annotation.RequestPath;
import com.litongjava.jfinal.aop.Aop;
import com.litongjava.test.services.HelloService;

@RequestPath("/demo")
public class DemoController {

  @Get
  public String demo01() {
    return "demo01";
  }
  
  @Get("/hello")
  public String hello() {
    return Aop.get(HelloService.class).hello();
  }
}
