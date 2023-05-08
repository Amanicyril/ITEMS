package com.javaguides.itemsspringbootapp;

import com.javaguides.itemsspringbootapp.entity.items;
import com.javaguides.itemsspringbootapp.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemsSpringBootAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ItemsSpringBootAppApplication.class, args);
	}

	@Autowired
	private repository Repository;
	@Override
	public void run(String... args) throws Exception {

		items Item= new items();
		Item.setItem_name("trousers");
		Item.setItem_amount(1);
		Item.setItem_price(17000);

		Repository.save(Item);

	}
}
