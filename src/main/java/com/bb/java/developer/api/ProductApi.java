package com.bb.java.developer.api;

import com.bb.java.developer.model.ProductRequest;
import com.bb.java.developer.model.ProductResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;


@RequestMapping("/api/v1")
public interface ProductApi {

    @PostMapping(
            value = "/products",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    Mono<ProductResponse> addProduct(@RequestBody @Valid ProductRequest productRequest);

    @GetMapping(
            value = "/products",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    Flux<ProductResponse> getAllProducts();

    @GetMapping(
            value = "/product/{event-id}",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    Mono<ProductResponse> getProduct(@PathVariable("eventId") String eventId);
}
