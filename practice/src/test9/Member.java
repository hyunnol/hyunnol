package test9;

public class Member extends Group implements Pay{
	public String name;
	public int age;
	public String job;
	public String address;
	
	Member() {}
	
	
	Member(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void setJob() {
		System.out.println("직업:" + job);
	}
	
	public void setAddress() {
		System.out.println("주소");
	}

	public String toString() {
		return job+","+address;
	}
	
	
	

}
