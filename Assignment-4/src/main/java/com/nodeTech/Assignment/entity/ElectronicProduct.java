package com.nodeTech.Assignment.entity;



import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="products")
public class ElectronicProduct {

	@Override
	public String toString() {
		return "ElectronicProduct [id=" + id + ", productName=" + productName + ", image=" + Arrays.toString(image)
				+ ", description=" + description + ", category=" + category + ", ramMobile=" + ramMobile
				+ ", screenSize=" + screenSize + ", color=" + color + ", ramLaptop=" + ramLaptop + ", processor="
				+ processor + ", hdCapacity=" + hdCapacity + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String productName;
	@Column(name="image")
	private byte[] image;
	@Column(name="description")
	private String description;
	@Column(name="catrgoery")
	private String category;
	@Column(name="ramMobile")
	private String ramMobile;
	@Column(name="screen_size")
	private String screenSize;
	@Column(name="color")
	private String color;
	@Column(name="ramLaptop")
	private String ramLaptop;
	
	@Column(name="processor")
	private String processor;
	@Column(name="hd_capacity")
	private String hdCapacity;
	

	public ElectronicProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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

	

	public ElectronicProduct(int id, String productName, byte[] image, String description, String category,
			String ramMobile, String screenSize, String color, String ramLaptop, String processor, String hdCapacity) {
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
		
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	}
