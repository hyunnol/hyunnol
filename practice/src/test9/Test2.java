package test9;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class member1 = Class.forName("test9.Member");
		Member member = (Member)member1.newInstance();
		
		member.job = "의사";
		member.address = "성동구";
		
		System.out.println(member.toString());
	
		

	}

}
