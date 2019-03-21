package Service;

import java.util.Scanner;

import UserInterface.Order;
import Validation.ValidateElements;

public class OrderFoodServiceImpl implements OrderFoodService{

	public Integer order(Order ord) {
		
		ValidateElements ve = new ValidateElements();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String s1 = sc.nextLine();
		ve.validateName(s1);
		ord.setName(s1);
		
		System.out.println("Enter emailId:");
		String s2 = sc.nextLine();
		ve.validateEmailId(s2);
		ord.setEmailId(s2);
		
		System.out.println("Enter Address:");
		ord.setAddress(sc.nextLine());
		
		System.out.println("Enter OrderType:");
		ord.setOrderType(sc.nextLine());
		
		System.out.println("Enter Menu:");
		ord.setMenu(sc.nextLine());
		
		System.out.println("Enter Mobile No:");
		Long l1 = sc.nextLong();
		ve.validateMobileNo(l1);
		ord.setMobileNo(l1);
		
		return ord.getOrderId();
		
	}
	

}
