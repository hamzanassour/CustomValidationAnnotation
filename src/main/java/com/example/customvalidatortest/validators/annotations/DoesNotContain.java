package com.example.customvalidatortest.validators.annotations;

import com.example.customvalidatortest.validators.DoesNotContainValidator;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = DoesNotContainValidator.class)
public @interface DoesNotContain {
      String message() default "The field contains invalid characters";
      Class<?>[] groups() default {};
      Class<? extends Payload>[] payload() default {};
      String[] chars();
}
