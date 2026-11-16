package com.ejemplo.cafeteria;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.PublicKey;
import java.util.Map;

@RestController
public class CafeteriaController {
    @GetMapping("/bienvenida")
    public String bienvenida(){
        return "Bienvenido a Café andino";
    }
    @GetMapping("/pedido/{producto}")
    public String estadoPedido(@PathVariable String producto){
        return "Preparando tu " + producto + "...";
    }
    @GetMapping("/menu")
    public Map<String, Object> menu(){
        return Map.of(
                "tinto",3000,
                "capuchino",5000,
                "frape",8000,
                "late",10000
        );
    }
    @GetMapping("/cafeteria")
    public Map<String, Object> cafeteria(){
        return Map.of(
                "Nombre","Café Andino",
                "ciudad","Bogotá D.C",
                "horario","De 8:00 am A 6:00 pm",
                "abierto",true

        );
    }
    @GetMapping("/total/{precio}/{cantidad}")
    public String total(@PathVariable int precio,@PathVariable int cantidad){
        int total = precio * cantidad;
        return "Total a pagar: " + total;
    }

}
