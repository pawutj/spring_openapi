package com.openapi.openapi.models;

import lombok.Data;

@Data
public class Payload<T> {
    private String user;
    private T object;
}
