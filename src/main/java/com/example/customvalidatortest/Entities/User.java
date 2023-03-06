package com.example.customvalidatortest.Entities;


import com.example.customvalidatortest.validators.annotations.DoesNotContain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class User {
    @DoesNotContain(chars = {"#" , "%" , "@"})
    private  String  username  ;

    private String email ;

    private String password ;

}
