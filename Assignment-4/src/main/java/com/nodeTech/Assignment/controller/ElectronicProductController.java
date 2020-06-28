package com.nodeTech.Assignment.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nodeTech.Assignment.entity.ElectronicProduct;
import com.nodeTech.Assignment.service.ElectronicProductService;
@SpringBootApplication
@CrossOrigin(origins = "*")
@RestController
public class ElectronicProductController {

	@Autowired
	private ElectronicProductService service;
	
	@PostMapping("/addProduct")
	public ElectronicProduct postProduct(@RequestBody ElectronicProduct product) throws InterruptedException {
		return service.addProduct(product);
	}
	
	@PostMapping("/addProductImage")
	public ElectronicProduct postProduct(@RequestParam("fileData") MultipartFile file) throws IOException, InterruptedException {
		return service.addProductImage(file.getBytes(), file.getOriginalFilename());
	}
	
	@GetMapping("/getProducts")
	public List<ElectronicProduct> getProducts() throws InterruptedException{
		
		return service.getProducts();
	}
	@GetMapping("/getProduct/{id}")
	public ElectronicProduct getProduct(@PathVariable int id){
		return service.getProduct(id);
	}
	
	@PutMapping("/updateProduct")
	public ElectronicProduct updateProduct(@RequestBody ElectronicProduct product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	private String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
