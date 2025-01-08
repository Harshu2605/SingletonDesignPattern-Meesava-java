package meeseva_pack;

import java.util.Random;

public class Aadharcard 
{
	public static Aadharcard a=null;
	long aadharCard;
	Random r=new Random();
	
	private Aadharcard()
	{
		this.aadharCard=r.nextLong(12345678912l);
		System.out.println("AadharCardNo:"+aadharCard);
		
	}
	public static Aadharcard  createAadharcardObject()
	{
		
		if(a==null)
		{
			a=new Aadharcard();
			System.out.println("created a new aadhar");
		}
		else
		{
			System.out.println("Already aadhar is created");
		}
		return a;
	}
	

}
