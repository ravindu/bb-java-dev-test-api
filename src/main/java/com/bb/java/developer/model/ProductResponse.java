package com.bb.java.developer.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.List;

@Data
@ApiModel
public class ProductResponse implements Response {

    @ApiModelProperty(value = "Product id", example = "Item 01")
    private String id;

    @ApiModelProperty(value = "Event creation date time")
    private OffsetDateTime timestamp;

    @ApiModelProperty(value = "List of products", example = "Item 1, Item 2")
    private Collection<Product> products;

    @ApiModelProperty(value = "Booking placed date time")
    private OffsetDateTime createdDateTime;

    @ApiModelProperty(value = "Booking updated date time")
    private OffsetDateTime updatedDateTime;
}
