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
		//TODO customer ��ü���� �� ���̵�� ��й�ȣ�� �����ͼ� ���� ���ٸ� customer��ü ����.
		//�ƴϸ� null����.
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
