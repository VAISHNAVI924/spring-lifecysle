package springlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sol {
public static void main(String[] args) {
ClassPathXmlApplicationContext c1 =new ClassPathXmlApplicationContext("springlifecycle/java.xml");
System.out.println(c1.getBean("abc"));
if(c1!=null) {
	c1.close();
}
	}

}
