package formation.kappaerp.services;

import formation.kappaerp.entities.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getOrders();

    public void saveOrder(Order newOrder);

    public Order getOrder(int orderId);

    public void deleteOrder(int orderId);
}
