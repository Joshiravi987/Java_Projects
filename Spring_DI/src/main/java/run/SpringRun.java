package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.phone.Phone;

public class SpringRun {
public static void main(String[] args) {
	
	ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
	Phone p = (Phone) context.getBean("phone");
	System.out.println(p.getPhoneModelno()+" "+p.getPhoneName()+" "+p.getPhoneStorage());
	p.showPersonDetails();
}
}
