package formation.kappaerp.controllers;

import formation.kappaerp.services.OrderService;
import formation.kappaerp.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        Order order = orderService.getOrder(orderId);
        model.addAttribute("order", order);
        return "order-form";
    }

    //@GetMapping("/deleteOrder")
    @DeleteMapping("/deleteOrder")
    public String deleteOrder(@RequestParam("orderId") int orderId, Model model){
        orderService.deleteOrder(orderId);
        return "redirect:/order/listOrder";
    }

    @InitBinder("order")
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class,"orderDate", new CustomDateEditor(sdf, true));
    }
}
