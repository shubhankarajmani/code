package model;

import java.sql.Timestamp;

public  class Token {
private int tokenNo;

private int counterNo ;

public Token(int tokenNo, int counterNo) {
	super();
	this.tokenNo = tokenNo;

	this.counterNo = counterNo;
}
public int getCounterNo() {
	return counterNo;
}
public void setCounterNo(int counterNo) {
	this.counterNo = counterNo;
}
public int getTokenNo() {
	return tokenNo;
}
public void setTokenNo(int tokenNo) {
	this.tokenNo = tokenNo;
}

	
public void tokenDetails()
{
System.out.println(this.getTokenNo() + this.getCounterNo() );	

}

}
