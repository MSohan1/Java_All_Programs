package controller;

import java.util.Scanner;

import dao.AaddharCard_Dto;
import dto.AaddharCard;
import dto.Person;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Details Of Aadhar");
		
		System.out.println("Enter Aadhar Number :");
		long number = scanner.nextLong();
		System.out.println("Enter Aaddhar Authority :");
		String authority = scanner.next();
	
		AaddharCard aaddharCard = new AaddharCard();
		
		aaddharCard.setAadherNumber(number);
		aaddharCard.setAadherAuthority(authority);
		
		System.out.println("Enter Details Of Person");
		System.out.println("Enter Person Age :");
		int age = scanner.nextInt();
		
		System.out.println("Enter Person Name :");
		String name = scanner.next();
		
		System.out.println("Enter Person Phone :");
		Long phone = scanner.nextLong();
		
		Person person = new Person();
		person.setPersonAge(age);
		person.setPersonName(name);
		person.setPersonPhone(phone);
		
		aaddharCard.setPerson(person);
		
		
		
		AaddharCard_Dto aaddharCard_Dto = new AaddharCard_Dto();
		aaddharCard_Dto.InsertData(aaddharCard);

	}

}
