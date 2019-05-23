package com.xiao.springboot.springboothelloworld.exception;

/**
 * 自定义异常类
 */
@SuppressWarnings("ALL")
public class BusinessException extends RuntimeException {
  private String code;
  private String msg;

  public BusinessException(String code, String msg) {
    super();
    this.code=code;
    this.msg=msg;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String getCode(){
    return code;
  }

  public String getMsg(){
    return msg;
  }
}
