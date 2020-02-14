package formation.kappaerp.dao;

import formation.kappaerp.entities.Order;
import java.util.List;

public interface OrderDAO {

    public List<Order> getOrders();

    public void saveOrder(Order newOrder);

    public Order getOrder(int orderId);

    public void deleteOrder(int orderId);
}
