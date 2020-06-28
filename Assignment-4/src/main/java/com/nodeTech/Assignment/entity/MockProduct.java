package com.nodeTech.Assignment.entity;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class MockProduct {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRamMobile() {
		return ramMobile;
	}
	public void setRamMobile(String ramMobile) {
		this.ramMobile = ramMobile;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRamLaptop() {
		return ramLaptop;
	}
	public void setRamLaptop(String ramLaptop) {
		this.ramLaptop = ramLaptop;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getHdCapacity() {
		return hdCapacity;
	}
	public void setHdCapacity(String hdCapacity) {
		this.hdCapacity = hdCapacity;
	}
	
	private int id;
	private String productName;
	private byte[] image;
	private String description;
	private String category;
	private String ramMobile;
	private String screenSize;
	private String color;
	private String ramLaptop;
	private String processor;
	private String hdCapacity;
	private MultipartFile fileData;
	@Override
	public String toString() {
		return "MockProduct [id=" + id + ", productName=" + productName + ", image=" + Arrays.toString(image)
				+ ", description=" + description + ", category=" + category + ", ramMobile=" + ramMobile
				+ ", screenSize=" + screenSize + ", color=" + color + ", ramLaptop=" + ramLaptop + ", processor="
				+ processor + ", hdCapacity=" + hdCapacity + ", fileData=" + fileData + "]";
	}
	public MockProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MockProduct(int id, String productName, byte[] image, String description, String category, String ramMobile,
			String screenSize, String color, String ramLaptop, String processor, String hdCapacity,
			MultipartFile fileData) {
		super();
		this.id = id;
		this.productName = productName;
		this.image = image;
		this.description = description;
		this.category = category;
		this.ramMobile = ramMobile;
		this.screenSize = screenSize;
		this.color = color;
		this.ramLaptop = ramLaptop;
		this.processor = processor;
		this.hdCapacity = hdCapacity;
		this.fileData = fileData;
	}
	public MultipartFile getFile() {
		return fileData;
	}
	public void setFile(MultipartFile fileData) {
		this.fileData = fileData;
	}
}
