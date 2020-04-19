package com.roche.order.web.controller;

import com.roche.order.web.model.OrderLineRequest;
import com.roche.order.web.model.OrderLineResource;
import com.roche.order.web.model.OrderRequest;
import com.roche.order.web.model.OrderResource;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    @ResponseStatus(OK)
    public List<OrderResource>  getAllOrder(){
        OrderResource orderResource = new OrderResource();
        orderResource.setId("order_1");
        List<String> orderLines = Arrays.asList("order_line_id_1", "order_line_id_2", "order_line_id_3", "order_line_id_4");
        orderResource.setOrderLines(orderLines);

        return Arrays.asList(orderResource);
    }

    @GetMapping("/{orderId}")
    @ResponseStatus(OK)
    public  List<OrderLineResource>   getOrderDetails(@PathVariable String  orderId){
        OrderLineResource orderLineResource1 = new OrderLineResource();
        OrderLineResource orderLineResource2 = new OrderLineResource();

        return  Arrays.asList(orderLineResource1,orderLineResource2);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public  OrderResource   createNewOrder(@RequestBody OrderRequest request){
        OrderResource orderResource = new OrderResource();
        orderResource.setId("order_1");
        return orderResource;
    }

    @PutMapping("/{orderId}")
    @ResponseStatus(OK)
    public  List<OrderLineResource>   addOrderDetail(@RequestBody OrderLineRequest request, @PathVariable String orderId){

        OrderLineResource order1 = new OrderLineResource();
        order1.setOrderId(orderId);
        order1.setProductId("product_id_1");
        order1.setAmount(2);

        OrderLineResource order2 = new OrderLineResource();
        order2.setOrderId(orderId);
        order2.setProductId("product_id_2");
        order2.setAmount(3);

        OrderLineResource orderNew = new OrderLineResource();
        orderNew.setOrderId(orderId);
        orderNew.setProductId(request.getProductId());
        orderNew.setAmount(request.getAmount());

        return Arrays.asList(order1,order2,orderNew);
    }




}
