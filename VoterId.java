package meeseva_pack;

import java.util.Random;

public class VoterId 
{
	private static VoterId v=null;
	int voterId;
	Random r=new Random();
	private VoterId()
	{
		this.voterId=r.nextInt(123456);
		System.out.println("VoterId:"+voterId);
		
	}
	public static void createVoterIdObject(User u)
	{
		if(u.getAge()>=18)
		{
			if(v==null)
			{
				v=new VoterId();
				System.out.println("VoterId is created");
			}
			else
			{
				System.out.println("Already voterId id created");
			}
		}
	}

}
