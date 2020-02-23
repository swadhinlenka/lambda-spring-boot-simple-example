package com.example;

import com.example.pojo.GenericRes;

public abstract class Response {

	public <T> GenericRes<T> success(T t) {
		return GenericRes.<T>builder().data(t).message("success").build();
	}

	public <T> GenericRes<T> error(String msg) {
		return GenericRes.<T>builder().message(msg).status(false).build();
	}

	public <T> GenericRes<T> error(String msg, Throwable th) {
		return GenericRes.<T>builder().message(msg).status(false).build();
	}

}