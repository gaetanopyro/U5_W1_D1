package gaetanomiscio.U5_W1_D1;

import gaetanomiscio.U5_W1_D1.entites.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {


    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D1Application.class);

        Menu mn = context.getBean("getMenu", Menu.class);
        System.out.println(mn);

        context.close();
    }


}
