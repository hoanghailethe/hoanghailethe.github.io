package com.example.demo;

import com.example.demo.Service.CustomerService;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		// ApplicationContext chính là container, chứa toàn bộ các Bean
//		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//
//		CustomerRepository customerRepo = context.getBean(CustomerRepository.class);
//
//		// Tim khach hang co Id = 99;
//		Customer cus1 = customerRepo.findById(99L).get();
//		System.out.print("Customer id 99: ");
//		System.out.println(cus1);
//
//		// Tim khach hang co email = "JohnSmith@";
//		Customer cus2 = customerRepo.findByEmail("egrouer8@ameblo.jp").get();
//		System.out.print("Customer who has email: egrouer8@ameblo.jp ");
//		System.out.println(cus2);
//
//		//iterate list: https://crunchify.com/how-to-iterate-through-java-list-4-way-to-iterate-through-loop/
//
//		// Tim danh sach khach hang firstname = " John"
//		System.out.print("Customers who has FN as JOHN ");
//		List<Customer> customersJohn = customerRepo.findByFirstName("John");
//		Iterator<Customer> listIterator1 = customersJohn.iterator();
//		while(listIterator1.hasNext()) {
//			System.out.println(listIterator1.next());
//		}
//		System.out.println("----------------");
//
//		// Tim danh sach khach hang lastname = " Smith"
//		System.out.print("Customer who has LN as Smith ");
//		List<Customer> customersLnSmith = customerRepo.findByLastName("Smith");
//		Iterator<Customer> listIterator2 = customersLnSmith.iterator();
//		while(listIterator2.hasNext()) {
//			System.out.println(listIterator2.next());
//		}
//		System.out.println("----------------");
//
//		// Tim danh sach khach hang job = "Cost Accountant"
//		System.out.print("Customers work as Cost Accountant ");
//		List<Customer> customersDeveloper = customerRepo.findByJob("Cost Accountant");
//		Iterator<Customer> listIterator3 = customersJohn.iterator();
//		while(listIterator3.hasNext()) {
//			System.out.println(listIterator3.next());
//		}
//		System.out.println("----------------");
	}
}
