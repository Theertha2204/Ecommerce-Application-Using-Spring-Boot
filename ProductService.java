package com.telusko.EcomApp.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.telusko.EcomApp.model.Product;
import com.telusko.EcomApp.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;

	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

	public Product getProductById(int id) {
		
		return productRepo.findById(id).orElse(null);
	}

	
	
	public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
	product.setImageName(imageFile.getOriginalFilename());
	product.setImageType(imageFile.getContentType());
	product.setImageData(imageFile.getBytes());
		
		return productRepo.save(product);
		
	}

	public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
		
		product.setImageData(imageFile.getBytes());
		product.setImageName(imageFile.getOriginalFilename());
		product.setImageType(imageFile.getContentType());
		return productRepo.save(product);
	}

	public void deleteProduct(int id) {
	productRepo.deleteById(id);
		
	}

	public List<Product> searchProducts(String keyword) {
	
		return productRepo.searchProducts(keyword);
	}

}
