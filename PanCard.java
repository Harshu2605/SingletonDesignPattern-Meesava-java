package meeseva_pack;

import java.util.Random;

public class PanCard 
{
	public static PanCard p=null;
	long panNum;
	Random r=new Random(12345L);
	private PanCard()
	{
		this.panNum=r.nextLong();
		System.out.println("panNum:"+panNum);
	}
	public static PanCard createPanCardObject(User u) 
	{
		if(u.getFathername()=="ram")
		{
			if(p==null)
			{
				p=new PanCard();
				System.out.println("pancard is created...");
				
			}
			else
			{
				System.out.println("pancard is already exist");
			}

		}
		else
		{
			System.out.println("pancard is not created for the user..");
		}
		return p; 
		
	}
}

