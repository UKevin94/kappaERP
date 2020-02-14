package formation.kappaerp.services;

import formation.kappaerp.dao.OrderDAO;
import formation.kappaerp.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Override
    @Transactional
    public List<Order> getOrders() {
        return orderDAO.getOrders();
    }

    @Override
    @Transactional
    public void saveOrder(Order newOrder) {
        orderDAO.saveOrder(newOrder);
    }

    @Override
    @Transactional
    public Order getOrder(int orderId) {
        return orderDAO.getOrder(orderId);
    }

    @Override
    @Transactional
    public void deleteOrder(int orderId) {
        orderDAO.deleteOrder(orderId);
    }
}
