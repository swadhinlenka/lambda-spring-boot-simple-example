package com.example;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.example.pojo.GenericRes;
import com.example.pojo.RequestInfo;
import com.example.pojo.ResponseInfo;
@Component
public class UserDetails extends Response implements Function<RequestInfo, GenericRes<?>> {

    @Override
    public GenericRes<?> apply(RequestInfo info) {
        return success(ResponseInfo.builder().firstName(info.getFirstName()).lastName(info.getLastName()).build());
    }
}