package com.sreenutech.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sreenutech.Account;
import com.sreenutech.Customer;
import com.sreenutech.Orders;

public class JsonSerialize {

	public static void main(String[] args) throws JsonProcessingException {
		
		Customer customer =new Customer();
		customer.setfName("praveen");
		customer.setlName("reddy");
		customer.setTitle("Mr");
		customer.setMobnum("9701809976");
		customer.setEmailid("praveen.reddy2938@gmail.com");
		customer.setAddress("Hyderabad");
		//prepare the account object
		Account account=new Account();
		account.setBalance(1000.00);
		account.setCardNum("05211140058765");
		account.setCvv(784);
		account.setNameOnCard("Gurram Praveen");
		customer.setAccount(account);
		
		List<Orders> orderList=new ArrayList<>();
		
		Orders order=new Orders();
		order.setOid("1111");
		order.setName("mobile");
		order.setDelivered(true);
		order.setDesc("good");
		
		Orders order1=new Orders();
		order1.setOid("2222");
		order1.setName("watch");
		order1.setDelivered(true);
		order1.setDesc("Not bad");
		
		Orders order2=new Orders();
		order2.setOid("3333");
		order2.setName("Laptop");
		order2.setDelivered(true);
		order2.setDesc("AVG");
		
		orderList.add(order);
		orderList.add(order1);
		orderList.add(order2);

		customer.setOrder(orderList);
		
		ObjectMapper mapper=new ObjectMapper();
		//String jsonData = mapper.writeValueAsString(customer);
		String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customer);
		
		System.out.println("JSON data is:"+jsonData);
		
		

	}

}
