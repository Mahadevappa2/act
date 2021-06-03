package com.example.Product1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Product1.entities.Product;
import com.example.Product1.repository.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;
  
  public Product saveProduct(Product product) {
	 return repository.save(product);
  }
  
  public List<Product> saveProducts(List<Product> products) {
		 return repository.saveAll(products);
	  }
  
  public List<Product> getProducts() {
		 return repository.findAll();
	  }
  
  public Product getProductById(int id) {
		 return repository.findById(id).orElse(null);
	  }
  
  public Product getProductByName(String name) {
		 return repository.findByName(name);
	  }
  
  public String deleteProduct(int id) {
		  repository.deleteById(id);
		  return "prodcut removed ||" + id;
	  }
  public Product updateProduct(Product product) {
      Product existingProduct = repository.findById(product.getId()).orElse(null);
      existingProduct.setName(product.getName());
      existingProduct.setQuatity(product.getQuatity());
      existingProduct.setPrice(product.getPrice());
      return repository.save(existingProduct);
  }
  
  
}
