package com.litongjava.test.controller;

import com.litongjava.annotation.RequestPath;

@RequestPath("/")
public class IndexController {
  @RequestPath()
  public String index() {
    return "index1";
  }
  
  @RequestPath("index2")
  public String index2() {
    return "index2";
  }
}
