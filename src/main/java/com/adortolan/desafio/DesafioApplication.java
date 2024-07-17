package com.adortolan.desafio;

import com.adortolan.desafio.entities.Order;
import com.adortolan.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Autowired
	private OrderService orderService;

	final Order order = new Order(1309, 95.90, 0.00);

	@Override
	public void run(String... args) throws Exception {
		System.out.printf("Pedido código " + order.getCode().toString());
		System.out.printf("\r\nValor total: R$ " + "%,.2f",orderService.total(order));
	}
}
