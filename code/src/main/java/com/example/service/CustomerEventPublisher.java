package com.example.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.example.entity.Customer;

@Service
public class CustomerEventPublisher {

    @Autowired
    private KafkaTemplate<String, Customer> kafkaTemplate;

    public void publishCustomerEvent(Customer customer) {
        kafkaTemplate.send("customer_events", customer);
    }
}
