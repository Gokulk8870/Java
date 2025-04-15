

import java.util.Scanner;

public class AgeValidatorWithAssertion {
	public static void main(String[] args) {
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		age=sc.nextInt();
		
		//assertion error
		assert(age>0)&&(age<120);
		
		System.out.println("The entered age:"+age);
		
	}
}
