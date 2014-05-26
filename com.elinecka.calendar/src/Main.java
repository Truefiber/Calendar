import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fiber on 22.05.14.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
