package com.placidmasvidal.cqrsandeventsourcing.command.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    public ProductController(final CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    private CommandGateway commandGateway;

    @PostMapping
    public CompletableFuture<String> create(@RequestBody ProductDTO dto) {
        return null;
    }

    @PutMapping
    public CompletableFuture<String> update(@RequestBody ProductDTO dto) {
        return null;
    }
}
