package com.aspire.onlineshoppingBean;

import java.io.InputStream;

public class ProductBean {
String productName;
String cost;
String quantity;
InputStream inputstream;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getCost() {
	return cost;
}
public void setCost(String cost) {
	this.cost = cost;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public InputStream getInputstream() {
	return inputstream;
}
public void setInputstream(InputStream inputstream) {
	this.inputstream = inputstream;
}


}
