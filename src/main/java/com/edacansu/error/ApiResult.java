package com.edacansu.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult {

    private String error;
    private String message;
    private String path;
    private Date date = new Date(System.currentTimeMillis());


    public ApiResult(String error, String message, String path) {
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
