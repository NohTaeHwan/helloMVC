package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String,Customer> customerMap;
	private static final CustomerService instance = new CustomerService();

	private CustomerService() {
		customerMap = new HashMap<String,Customer>();
		
	}
	public static CustomerService getInstance() {
		return instance;
	}
	
	public void addCustomer(Customer customer) {
		customerMap.put(customer.getId(),customer);
	}
	
	public Customer findCustomer(String id) {
		if(id!=null)
			return (customerMap.get(id.toLowerCase()));
		else
			return null;
	}
	public Customer login(String id,String password) {
		//TODO customer 객체에서 고객 아이디와 비밀번호를 가져와서 만약 같다면 customer객체 리턴.
		//아니면 null리턴.
		Customer customer = customerMap.get(id);
		if(customer==null||!customer.getPassword().equals(password))
			return null;
		else
			return customer;
	}
	public List<Customer> getAllCustomers(){
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values());
		return customerList;
	}
	
}
