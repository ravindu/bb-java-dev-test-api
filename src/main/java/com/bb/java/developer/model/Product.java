package com.bb.java.developer.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@ApiModel
public class Product {

    @Positive
    @NotBlank(message = "Product id cannot be null.")
    @ApiModelProperty(value = "Product id", required = true, example = "56778386934378374778473")
    private long id;

    @NotBlank(message = "Product name cannot be null.")
    @ApiModelProperty(value = "Product name", required = true, example = "Item 01")
    private String name;

    @Positive
    @Min(value= 1, message = "Product quantity cannot be negative value.")
    @ApiModelProperty(value = "Product quantity", required = true, example = "5")
    private int quantity;

    @Positive
    @Digits(integer = 4,fraction = 2, message = "Product sale amount allow two decimal points only.")
    private double sale_amount;


}
