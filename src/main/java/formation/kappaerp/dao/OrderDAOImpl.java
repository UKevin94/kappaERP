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
        session.saveOrUpdate(newOrder);
    }

    @Override
    public Order getOrder(int orderId) {
        Session session = factory.getCurrentSession();
        return session.get(Order.class, orderId);
    }

    @Override
    public void deleteOrder(int orderId) {
        Session session = factory.getCurrentSession();
        Query query = session.createQuery("DELETE FROM orders WHERE id=:Id");
        query.setParameter("Id", orderId);
        query.executeUpdate();
    }
}
