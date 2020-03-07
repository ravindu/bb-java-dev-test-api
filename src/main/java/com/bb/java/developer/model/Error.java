package com.bb.java.developer.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class Error implements Response {

    @ApiModelProperty(value = "Error code for this transaction.", example = "1000999")
    private String errorCode;

    @ApiModelProperty(value = "Description of the error code", example = "Invalid product quantity.")
    private String errorMessage;
}
