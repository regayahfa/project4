package com.example.project4.ControllerAdvis;

import com.example.project4.ApiException.ApiExption;
import com.example.project4.Apirespons.Apiresponsty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ControllerAdvis {
    @ExceptionHandler(value = ApiExption.class)
    public ResponseEntity<Apiresponsty> ApiExsption(ApiExption e){
        String massege=e.getMessage();
        return ResponseEntity.status(400).body(new Apiresponsty(massege));
    }

}
