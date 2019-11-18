package annotations.field;

public class Product {
	
	@FieldConfig(size=10)
	private String productId;

	public Product(String productId) {
		super();
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}