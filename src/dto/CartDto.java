package dto;

public class CartDto extends ProductDto{
	private int pquantity;

	public int getPquantity() {
		return pquantity;
	}

	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}

	@Override
	public String toString() {
		return "CartDto [pquantity=" + pquantity + ", getProduct_id()=" + getProduct_id() + ", getProduct_name()="
				+ getProduct_name() + ", getPrice()=" + getPrice() + ", getRs()=" + getRs() + ", getProduct_details()="
				+ getProduct_details() + ", getProduct_addres()=" + getProduct_addres() + "]";
	}

	

}
