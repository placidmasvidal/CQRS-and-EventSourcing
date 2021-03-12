package com.placidmasvidal.cqrsandeventsourcing.command.addproduct;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class AddProductCommand {

    public AddProductCommand(
            final Long id,
            final String name,
            final int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @TargetAggregateIdentifier  //used to identify which instance of an Aggregate type should be handled
    private final Long id;
    private final String name;
    private final int quantity;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}