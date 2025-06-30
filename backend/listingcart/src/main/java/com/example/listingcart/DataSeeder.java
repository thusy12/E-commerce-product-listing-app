package com.example.listingcart;

import com.example.listingcart.models.Product;
import com.example.listingcart.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String ...args) throws Exception{
        //Check if table is empty
        if (productRepository.count() == 0){
            //seed demo data
            List<Product> products = Arrays.asList(
                    new Product("Oppo v5",1500.68,"Oppo v5 mobile",3.5,"Mobile","Rajesh",3,5,Arrays.asList("https://picsum.photos/id/1/200/300","https://picsum.photos/id/12/200/300")),
                    new Product("Lenovo Thinkpad",5000.235,"Laptop with i7 10th gen",4.5,"Laptop","Thusy",1,2,Arrays.asList("https://picsum.photos/id/8/200/300","https://picsum.photos/id/9/200/300")),
                    new Product("Mens Nike Shoes",200.31,"Mens shoes",4.2,"Shoe","Nimesh",1,15,Arrays.asList("https://picsum.photos/id/11/200/300","https://picsum.photos/id/13/200/300")),
                    new Product("Jbl speaker",250,"jbl speaker with bluetooth",3.9,"Speaker","Rajesh",0,4,Arrays.asList("https://picsum.photos/id/142/200/300","https://picsum.photos/id/121/200/300")),
                    new Product("smart watch",700.87,"smart watch with health checkups",2.1,"Watch","Kamal",4,3,Arrays.asList("https://picsum.photos/id/28/200/300","https://picsum.photos/id/96/200/300")),
                    new Product("Hp",6000.63,"Hp Laptop with i7 12th gen 16gb ram",4.5,"Laptop","Mahesh",7,6,Arrays.asList("https://picsum.photos/id/0/200/300","https://picsum.photos/id/2/200/300")),
                    new Product("Iphone 15 pro max",18000.99,"Iphone 15 pro max 1TB Titanium",4.8,"Mobile","Thusy",3,24,Arrays.asList("https://picsum.photos/id/87/200/300","https://picsum.photos/id/65/200/300")),
                    new Product("Samsung",15000,"samsung s25 ultra mobile",4.7,"Mobile","Rajesh",2,14,Arrays.asList("https://picsum.photos/id/81/200/300","https://picsum.photos/id/323/200/300")),
                    new Product("Airpods pro",299.99,"Airpods pro v3.0",4.4,"Earphone","Nimesh",13,6,Arrays.asList("https://picsum.photos/id/91/200/300","https://picsum.photos/id/99/200/300"))
            );
            System.out.println("Demo data seeding started.....");
            productRepository.saveAll(products);
            System.out.println("Demo data seeding completed......");
        }
    }
}
