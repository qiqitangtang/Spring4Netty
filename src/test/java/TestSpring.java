import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class TestSpring {
	
	private static Logger log = Logger.getLogger("testSpring");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//加载spirng配置文件
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}