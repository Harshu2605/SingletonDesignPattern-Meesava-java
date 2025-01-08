package meeseva_pack;

import java.util.Random;
import java.util.Scanner;
public class MainClass
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean start=true;
		while(start)
		{
			System.out.println("enter your choice:\n 1)create AadharCard \n2)generate VoterId \n 3)generate Pancard \n4)exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: Aadharcard.createAadharcardObject();
			break;
			case 2:
				System.out.println("enter user name:");
				String name=sc.next();
				System.out.println("enter user age:");
				int age=sc.nextInt();
				System.out.println("enter user mobilenum:");
				long mobile=sc.nextLong();
				System.out.println("enter user address:");
				String address=sc.next();
				System.out.println("enter user fatherName:");
				String fatherName=sc.next();
				VoterId.createVoterIdObject(new User(name,age,mobile,address,fatherName));
			break;
			case 3:
				System.out.println("enter user name:");
				String name1=sc.next();
				System.out.println("enter user age:");
				int age1=sc.nextInt();
				System.out.println("enter user mobilenum:");
				long mobile1=sc.nextLong();
				System.out.println("enter user address:");
				String address1=sc.next();
				System.out.println("enter user fatherName:");
				String fatherName1=sc.next();
				PanCard.createPanCardObject(new User(name1,age1,mobile1,address1,fatherName1));
			break;
			case 4:
				start=false;
				System.out.println("Thank you....");
			break;
			}
			
		}
	}

}