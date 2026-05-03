package com.telusko.EcomApp.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String brand;
	private String category;
	private BigDecimal price;
	
	@JsonFormat(shape =JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
	private Date releaseDate;
	private Boolean productAvailable;
	private int stockQuantity;
	
	
	private String imageName;
	private String  imageType;
	@Lob
	private byte[] imageData;
	
	
	public String getImageName() {
		return imageName;
	}





	public void setImageName(String imageName) {
		this.imageName = imageName;
	}





	public String getImageType() {
		return imageType;
	}





	public void setImageType(String imageType) {
		this.imageType = imageType;
	}





	public byte[] getImageData() {
		return imageData;
	}





	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}





	public Product() {
		
	}





	public Product(String name, String description, String brand, String category, BigDecimal price, Date releaseDate,
			Boolean productAvailable, int stockQuantity) {
		super();
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.releaseDate = releaseDate;
		this.productAvailable = productAvailable;
		this.stockQuantity = stockQuantity;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Boolean getProductAvailable() {
		return productAvailable;
	}
	public void setProductAvailable(Boolean productAvailable) {
		this.productAvailable = productAvailable;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	
	
	
	
}
