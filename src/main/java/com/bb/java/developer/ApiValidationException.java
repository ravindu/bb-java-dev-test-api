package com.bb.java.developer;

import com.bb.java.developer.model.ProductRequest;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class ApiValidationException extends RuntimeException{

    Set<ConstraintViolation<ProductRequest>> constraintViolations;

    public ApiValidationException(Set<ConstraintViolation<ProductRequest>> constraintViolations) {
        super("bean validation failed " + constraintViolations.toString());
        this.constraintViolations = constraintViolations;
    }

    public Set<ConstraintViolation<ProductRequest>> getConstraintViolations() {
        return this.constraintViolations;
    }
}
