package com.example.Courses.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseTopic<T> {

    private T body;
    private String message;
    private int status;

}
