import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Test;

public class IocTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("pojo");
		Test test = applicationContext.getBean(Test.class);
		test.test();
		}
//https://github.com/spring-projects/spring-framework/issues/25611  Process 'command 'git'' finished with non-zero exit value 128Process 'command 'git'' finished with non-zero exit value 128
}
