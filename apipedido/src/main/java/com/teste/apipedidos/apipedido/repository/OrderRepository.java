package com.teste.apipedidos.apipedido.repository;

import com.teste.apipedidos.apipedido.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}