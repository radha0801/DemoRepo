package UserInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Service.OrderFoodServiceImpl;

public class JavaBasicMain {
	
	public static List<Integer> orderList(){
		OrderFoodServiceImpl ordeImpl = new OrderFoodServiceImpl();
		Order p1 = new Order();
		ArrayList<Integer> item = new ArrayList<Integer>();
		Integer I1 = ordeImpl.order(p1);
		item.add(I1);
		return item;
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println(orderList()); 
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int j= 1;
		for(i=1; i<=j;i++) {
			System.out.println("Do you want anything else...");	
			String s1= sc.nextLine();		
			if(s1.equalsIgnoreCase("yes")) {
				orderList();
				Order p1 = new Order();
				int x = p1.getOrderId();
				System.out.println(x+i);
				j++;
					
			}else if(s1.equalsIgnoreCase("No")){
				//i++;
				System.out.println("Thank you");
			}						
		}
		sc.close();			
	}
}
 