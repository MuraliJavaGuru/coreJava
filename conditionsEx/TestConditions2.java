package conditionsEx;

import java.util.Scanner;

public class TestConditions2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age:");
		int age = sc.nextInt();
		
		if(age>18){
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("id = "+id);
			System.out.println("age = "+age);
		}else {
			System.out.println("Age should be greater than 18");
		}
	}
}
