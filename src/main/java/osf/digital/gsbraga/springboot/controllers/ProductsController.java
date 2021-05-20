package osf.digital.gsbraga.springboot.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import osf.digital.gsbraga.springboot.entity.Product;


@RestController
@RequestMapping("/api/v1")
public class ProductsController {
	List<Product> productList = new ArrayList<Product>();
	private int index = 0;
	
	@GetMapping("/products/{category}")
	public ResponseEntity<List<Product>> get( @PathVariable(value = "category") int category) {
		
		List<Product> list = productList.stream()
				.filter(product -> product.getCategory() == category)
	                .collect(Collectors.toList());
		
		if(list.isEmpty()){
			return ResponseEntity.ok(productList);
		}else {
			return ResponseEntity.ok(list);
		}
		
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProducts(@RequestBody Product product) {
		product.id = ++this.index;
		productList.add(product);
		return ResponseEntity.ok(product);
	}

}
