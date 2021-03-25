package com.placidmasvidal.cqrsandeventsourcing.command;

import org.axonframework.eventsourcing.eventstore.EmbeddedEventStore;
import org.axonframework.eventsourcing.eventstore.EventStorageEngine;
import org.axonframework.extensions.mongo.DefaultMongoTemplate;
import org.axonframework.extensions.mongo.eventsourcing.eventstore.MongoEventStorageEngine;
import org.axonframework.serialization.Serializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    // The `MongoEventStorageEngine` stores each event in a separate MongoDB document
    @Bean
    public EventStorageEngine storageEngine(com.mongodb.client.MongoClient client) {
        return MongoEventStorageEngine
                .builder()
                .mongoTemplate(DefaultMongoTemplate
                        .builder()
                        .mongoDatabase(client)
                        .build())
                .build();
    }

    @Bean
    public EmbeddedEventStore eventStore(EventStorageEngine storageEngine){
        return EmbeddedEventStore.builder().storageEngine(storageEngine).build();
    }

    public org.axonframework.extensions.mongo.eventsourcing.tokenstore.MongoTokenStore tokenStore(com.mongodb.client.MongoClient client,
                                      Serializer serializer){
        return org.axonframework.extensions.mongo.eventsourcing.tokenstore.MongoTokenStore.builder()
                .mongoTemplate(
                        DefaultMongoTemplate.builder()
                                .mongoDatabase(client)
                                .build()
                )
                .serializer(serializer)
                .build();
    }

}

