package io.github.jaxkodex.examples.simplemicroservice.controller;

import io.github.jaxkodex.examples.simplemicroservice.data.Orden;
import io.github.jaxkodex.examples.simplemicroservice.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/order")
public class OrderController {
    private OrdenService ordenService;

    @Autowired
    public OrderController(OrdenService ordenService) {
        this.ordenService = ordenService;
    }

    @RequestMapping(value = "/{id}")
    public Orden byId(@PathVariable Long id) {
        return ordenService.find(id);
    }
}
