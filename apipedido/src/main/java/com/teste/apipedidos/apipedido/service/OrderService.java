package com.teste.apipedidos.apipedido.service;

import com.teste.apipedidos.apipedido.model.Order;
import com.teste.apipedidos.apipedido.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order save(@Validated Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> findById(Integer id){
        return orderRepository.findById(id);
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
}