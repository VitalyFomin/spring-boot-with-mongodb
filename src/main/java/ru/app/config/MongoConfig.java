package ru.app.config;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created by silwer on 27.02.16.
 */

@Configuration
public class MongoConfig {

    @Value("${mongo.host}")     private String host;
    @Value("${mongo.port}")     private int port;
    @Value("${mongo.database}") private String database;
    @Value("${mongo.username}") private String username;
    @Value("${mongo.password}") private String password;

    @Autowired
    ApplicationContext context;

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        System.out.println("RUN :: >>> MongoDbFactory mongoDbFactory()");
        ServerAddress serverAddress = new ServerAddress(host, port);
        MongoClient mongoClient = new MongoClient(serverAddress);

        return new SimpleMongoDbFactory(mongoClient, database);
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
        System.out.println("RUN :: >>> MongoTemplate mongoTemplate()");
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
}
