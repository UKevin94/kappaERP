package formation.kappaerp.controllers;

import formation.kappaerp.services.OrderService;
import formation.kappaerp.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/listOrders")
    public String listOrders(Model model){
        List<Order> orders = orderService.getOrders();
        model.addAttribute("orders",orders);
        return "list-orders";
    }

    @GetMapping("/newOrder")
    public String newOrder(Model model){
        model.addAttribute("order", new Order());
        return "order-form";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order") Order order){
        orderService.saveOrder(order);
        return "redirect:/order/listOrders";
    }

    @GetMapping("/viewOrder")
    public String viewOrder(@RequestParam("orderId") int orderId, Model model){

    }

    //@GetMapping("/deleteOrder")
    @DeleteMapping("/deleteOrder")
    public String deleteOrder(@RequestParam("orderId") int orderId, Model model){

    }
}
