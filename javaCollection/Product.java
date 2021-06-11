package javaCollection;

public class Product {
	int total;
	private int weight; 
	private int quantity; 
	private int priceItem; 
	String productName; 
	Status status;
	City city;
	ServicePackage servicePackage;
	
	public Product() {
	
	}
	
	
	public ServicePackage getServicePackage() {
		return servicePackage;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getPriceItem() {
		return priceItem;
	}
	
	public void setPriceItem (int priceItem) {
		this.priceItem = priceItem;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getTotal() {
		return (priceItem*quantity + servicePackage.getValue());
	}
}