package com.bb.java.developer.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Data
@ApiModel
public class ProductRequest implements Request {

    @NotBlank(message = "Event id cannot be null.")
    @ApiModelProperty(value = "Event request id", required = true, example = "EVENT_1")
    private String id;

    @NotBlank(message = "Event timestamp cannot be null.")
    @ApiModelProperty(value = "Timestamp related to the Event", required = true, example = "2020-03-05T23:55:53.111032+08:00")
    private String timestamp;

    @NotNull(message = "Product list related to event cannot be null or empty.")
    @ApiModelProperty(value = "Product list related to Event", required = true, example = "Item_1, Item_2")
    private Collection<Product> products;
}
