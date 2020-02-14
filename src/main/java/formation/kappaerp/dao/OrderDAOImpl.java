package formation.kappaerp.dao;

import formation.kappaerp.entities.Order;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private SessionFactory factory;

    @Override
    public List<Order> getOrders() {
        //current hibernate session
        Session session = factory.getCurrentSession();
        Query query = session.createQuery("from orders");
        List<Order> orders = query.list();
        return orders;
    }

    @Override
    public void saveOrder(Order newOrder) {
        Session session = factory.getCurrentSession();
        session.save(newOrder);
    }

    @Override
    public Order getOrder(int orderId) {
        return null;
    }

    @Override
    public void deleteOrder(int orderId) {

    }
}
