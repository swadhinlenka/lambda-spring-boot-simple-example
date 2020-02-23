package com.example;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Component;

import com.example.pojo.GenericRes;
import com.example.pojo.RequestInfo;
@Component
public class CustomHandler extends SpringBootRequestHandler<RequestInfo, GenericRes<?>> {

}