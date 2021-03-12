package com.placidmasvidal.cqrsandeventsourcing.command.product;

import com.placidmasvidal.cqrsandeventsourcing.command.addproduct.AddProductCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class ProductAggregate {

    @AggregateIdentifier
    private Long id;
    private String name;
    private int quantity;

    @CommandHandler
    public ProductAggregate(AddProductCommand cmd) {
        // Verifies state consistency and applies events
    }
}

