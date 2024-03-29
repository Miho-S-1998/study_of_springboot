package com.example.demo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=UniqueLoginValidator.class)
public @interface UniqueLogin {
	String message()default "この社員は登録済みです。";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};
}
