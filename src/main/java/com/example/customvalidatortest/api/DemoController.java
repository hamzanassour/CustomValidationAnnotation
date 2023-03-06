package com.example.customvalidatortest.api;

import com.example.customvalidatortest.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DemoController {

    @GetMapping("")
    public ResponseEntity<List<String>> check(@Valid @RequestBody User user , BindingResult bindingResult ){

        List<String> errors = new ArrayList<>();

        if(bindingResult.hasErrors()){
            errors = bindingResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage()).collect(Collectors.toList());
        }else {
            errors.add(" Congrats!!! The username does not  contains invalid characters");
        }
        return  ResponseEntity.ok().body(errors);
    }

}
