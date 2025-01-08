package meeseva_pack;

public class User 
{
	private String name;
	private int age;
	private long mobilenumber;
	private String address;
	private String fathername;
	public User(String name, int age, long mobilenumber, String address, String fathername) {
		super();
		this.name = name;
		this.age = age;
		this.mobilenumber = mobilenumber;
		this.address = address;
		this.fathername =fathername ;
	}
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}


	public void dispaly()
	{
		System.out.println("name of the user:"+getName());
		System.out.println("age of the user:"+getAge());
		System.out.println("mobilenumber of the user:"+getMobilenumber());
		System.out.println("address of the user:"+getAddress());
		System.out.println("fathername of the user:"+getFathername());
	}
	
	

}
