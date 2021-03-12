package com.online.book.store.repositories;

import com.online.book.store.domain.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

    @Query("select o from Order o order by o.id")
    public List<Order> getAllBookOrders();

}
