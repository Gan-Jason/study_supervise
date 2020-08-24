package com.gan.xiaoyuanzi.enjoystudy.config.exception;


import lombok.Data;

@Data
public class AjaxResponse {

    private boolean isOk;
    private int code;
    private String message;
    private Object data;

    private AjaxResponse(){};

    public static AjaxResponse success(){
        AjaxResponse ajaxResponse= new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("Request successfully");
        return ajaxResponse;
    }

    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("Request successfully");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    //请求成功的响应，带有查询数据（用于数据查询接口）
    public static AjaxResponse success(Object obj,String message){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    //请求出现异常时的响应数据封装
    public static AjaxResponse error(CustomException e) {

        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setOk(false);
        resultBean.setCode(e.getCode());
        if(e.getCode() == CustomExceptionType.USER_INPUT_ERROR.getCode()){
            resultBean.setMessage(e.getMessage());
        }else if(e.getCode() == CustomExceptionType.SYSTEM_ERROR.getCode()){
            resultBean.setMessage(e.getMessage() + "");
        }else{
            resultBean.setMessage("");
        }
        return resultBean;
    }

}
