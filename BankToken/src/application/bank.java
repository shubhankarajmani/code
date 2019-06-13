package application;

import java.util.PriorityQueue;

import model.Customer;
import model.Token;

public class bank {

	public static void main(String[] args) {
		

PriorityQueue<Customer> queue  = new PriorityQueue<>()  ;

Token t1 = new Token(1, 1) ;
Token t2  =new Token(2 , 2);
Token t3= new Token(3,3) ;
Token t4  =new Token(4, 4);	

Customer c1 =  new Customer("a", false , 101, t1);
Customer c2 =  new Customer("b", true , 102, t2);
Customer c3 =  new Customer("c", true , 103, t3);	
Customer c4 =  new Customer("d", false , 104, t4);	
queue.add(c1) ;
queue.add(c2) ;
queue.add(c3) ;
queue.add(c4) ;	
System.out.println(queue.peek());
for(Customer customer : queue)
{
	System.out.println("Customer Name = "  + customer.getCustomerName() +  " Token Id = " + customer.getToken().getTokenNo() + " Counter No = "+customer.getToken().getCounterNo());
}
	}

}
