package com.nodeTech.Assignment.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nodeTech.Assignment.entity.ElectronicProduct;

import com.nodeTech.Assignment.repository.ElectronicProductRepository;

@Service
public class ElectronicProductService {

	@Autowired
	private ElectronicProductRepository repo;
	private int id;
	
	
	public  ElectronicProduct addProduct(ElectronicProduct product) throws InterruptedException {
	System.out.println("add producted executed");
		return repo.save(product);
	}
	public  ElectronicProduct addProductImage(byte[] imageBytes, String id) {
		int idInt=Integer.parseInt(id);
		ElectronicProduct product=repo.findById(idInt).orElse(new ElectronicProduct());
		 product.setImage(imageBytes);
		 System.out.println("images executed");
		return repo.save(product);
	}
	
	public List<ElectronicProduct> getProducts() throws InterruptedException{
		Thread.currentThread().sleep(2000);
		System.out.println("get products executed");
		return repo.findAll();
	}
	
	public ElectronicProduct getProduct(int id){
		return repo.findById(id).orElse(new ElectronicProduct());
	}
	
	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "product deleted "+id;
	}
	
	public ElectronicProduct updateProduct(ElectronicProduct product) {
		ElectronicProduct existingProduct= repo.findById(product.getId()).orElse(new ElectronicProduct());
		existingProduct.setProductName(product.getProductName());
//		existingProduct.setImage(product.getImage());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setRamMobile(product.getRamMobile());
		existingProduct.setScreenSize(product.getScreenSize());
		existingProduct.setColor(product.getColor());
		existingProduct.setRamLaptop(product.getRamLaptop());
		existingProduct.setProcessor(product.getProcessor());
		existingProduct.setHdCapacity(product.getHdCapacity());
		return repo.save(existingProduct);
	}
}
