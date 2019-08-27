package com.xiao.springboot.springboothelloworld.service;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import static com.xxl.job.core.biz.model.ReturnT.SUCCESS_CODE;

@Component
@JobHandler(value = "jobTestHello")
public class JobTestHello extends IJobHandler {
  private static Logger log = LoggerFactory.getLogger(JobTestHello.class);

  @Override
  public ReturnT<String> execute(String param) {
    ReturnT<String> t = new ReturnT<>();
    t.setCode(SUCCESS_CODE);
    log.info("Hello world");
    t.setMsg("success");

    return t;
  }
}
