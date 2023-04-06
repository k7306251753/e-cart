package dto;

public class ProductDto {
	// product_id, product_name, price, rs, product_details, product_addres
	private int product_id;
	private String product_name;
	private String price;
	private String product_details;
	private String product_addres;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getProduct_details() {
		return product_details;
	}

	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}

	public String getProduct_addres() {
		return product_addres;
	}

	public void setProduct_addres(String product_addres) {
		this.product_addres = product_addres;
	}

	public ProductDto(int product_id, String product_name, String price, String product_details,
			String product_addres) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;

		this.product_details = product_details;
		this.product_addres = product_addres;
	}

	public ProductDto(String product_name, String price, String product_details, String product_addres) {
		super();
		this.product_name = product_name;
		this.price = price;

		this.product_details = product_details;
		this.product_addres = product_addres;
	}

	public ProductDto() {
		super();

	}

	@Override
	public String toString() {
		return "ProductDto [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price
				+ ", product_details=" + product_details + ", product_addres=" + product_addres + "]";
	}
}