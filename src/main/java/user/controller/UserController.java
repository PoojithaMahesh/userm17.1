package user.controller;

import java.util.Scanner;

import user.dao.UserDao;
import user.dto.User;

public class UserController {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter 1 to save the User ");
	System.out.println("Please enter 2 to update the User ");
	System.out.println("Please enter 3 to find the User ");
	System.out.println("Please enter 4 to delete the User ");

	int choice =scanner.nextInt();
	
	switch (choice) {
	case 1:{
		System.out.println("please enter name");
		String name=scanner.next();
		System.out.println("please enter address");
		String address=scanner.next();
		System.out.println("please enter phone");
		long phone=scanner.nextLong();
		User user=new User();
		user.setAddress(address);
		user.setName(name);
		user.setPhone(phone);
		
		UserDao dao=new UserDao();
		dao.saveUser(user);
		System.out.println("Data saved successfully");
		
		
	}
		
		break;
	case 2:{
		
		System.out.println("please enter id to be update");
		int id=scanner.nextInt();
		
		System.out.println("please enter name");
		String name=scanner.next();
		System.out.println("please enter address");
		String address=scanner.next();
		System.out.println("please enter phone");
		long phone=scanner.nextLong();
		User user=new User();
		user.setAddress(address);
		user.setName(name);
		user.setPhone(phone);
		
		UserDao dao=new UserDao();
		dao.updateUser(id, user);
		
		System.out.println("data updated successfully");
		
	}
	break;
	case 3 :{
		
		System.out.println("please enter id to be fetched!!");
		int id=scanner.nextInt();
		UserDao dao=new UserDao();
		dao.findUser(id);
		System.out.println("Data fetched successfully");
	
	}
	break;
	
	case 4:{
		System.out.println("please enter id to be deleted!!");
		int id=scanner.nextInt();
		UserDao dao=new UserDao();
		dao.deleteUser(id);
		System.out.println("Data deleted successfully");
	}

	default:
		break;
	}
}
}
