package com.imooc.sell.VO;


import lombok.Data;

@Data
//http请求返回的最外层对象
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示错误新信息
    private String msg = "";

    //返回的具体内容
    private T data;
}
