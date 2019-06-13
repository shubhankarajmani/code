package model;

public class Customer implements Comparable<Customer>{
private String customerName;
public Customer(String customerName, boolean priorCutomer, int customeId, Token token) {
	super();
	this.customerName = customerName;
	this.priorCutomer = priorCutomer;
	this.customeId = customeId;
	this.token = token;
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", priorCutomer=" + priorCutomer + ", customeId=" + customeId
			+ ", token=" + token + ", getToken()=" + getToken() + ", getCustomerName()=" + getCustomerName()
			+ ", isPriorCutomer()=" + isPriorCutomer() + ", getCustomeId()=" + getCustomeId() + "]";
}
private boolean priorCutomer ;
private int customeId;
private Token token ;  
public Token getToken() {
	return token;
}
public void setToken(Token token) {
	this.token = token;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public boolean isPriorCutomer() {
	return priorCutomer;
}
public void setPriorCutomer(boolean priorCutomer) {
	this.priorCutomer = priorCutomer;
}
public int getCustomeId() {
	return customeId;
}
public void setCustomeId(int customeId) {
	this.customeId = customeId;
}
@Override
public int compareTo(Customer o)
{
	if(!priorCutomer)
	{
		return  1 ;
	}
	else {
		return -1 ;
	}

}

}
