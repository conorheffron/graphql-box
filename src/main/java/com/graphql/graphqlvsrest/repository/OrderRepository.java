package com.graphql.graphqlvsrest.repository;

import com.graphql.graphqlvsrest.entity.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> getOrdersByProduct(Integer productId);
}
