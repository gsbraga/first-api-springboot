package osf.digital.gsbraga.springboot.entity;

public class Product {
	public int id;
	public int category;
	public String name;
	public String description;
	
	public Product(int id, int category, String name, String description) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.description = description;
	}
	
	public int getCategory() {
		return this.category;
	}
	
}
