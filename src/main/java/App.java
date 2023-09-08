import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.printf("bean1 message: %s\n", bean1.getMessage());
        System.out.printf("bean2 message: %s\n", bean2.getMessage());
        System.out.printf("bean1 = bean2: %s\n", bean1 == bean2);

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.printf("cat1 message: %s\n", cat1.getVoice());
        System.out.printf("cat2 message: %s\n", cat2.getVoice());
        System.out.printf("cat1 = cat2: %s\n", cat1 == cat2);
    }
}