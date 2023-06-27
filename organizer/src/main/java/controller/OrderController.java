package controller;

import entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.OrderService;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String getAll(Model model) {
        List<Order> taskList = orderService.getAll();
        model.addAttribute("orderList", taskList);
        model.addAttribute("orderSize", taskList.size());
        return "index";
    }

    @RequestMapping("/delete/{id}")
    public String deleteOrder(@PathVariable int id) {
        orderService.delete(id);
        return "redirect:/";
    }

    @PostMapping("/add")
    public String addOrder(@ModelAttribute Order order) {
        orderService.save(order);
        return "redirect:/";
    }
}
