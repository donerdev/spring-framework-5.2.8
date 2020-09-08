import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Test;

public class IocTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("pojo");
		Test test = applicationContext.getBean(Test.class);
		test.test();
	}
}
