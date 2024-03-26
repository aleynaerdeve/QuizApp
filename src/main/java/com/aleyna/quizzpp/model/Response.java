package com.aleyna.quizzpp.model;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

@Data
@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;
    /*public Object getResponse() {
        return response;
    }*/
}

