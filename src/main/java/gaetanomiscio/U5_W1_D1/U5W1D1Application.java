package gaetanomiscio.U5_W1_D1;

import gaetanomiscio.U5_W1_D1.entites.Menu;
import gaetanomiscio.U5_W1_D1.entites.Table;
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

        Table t1 = context.getBean("getTable1", Table.class);
        System.out.println(t1);
        Table t2 = context.getBean("getTable2", Table.class);
        System.out.println(t2);
        Table t3 = context.getBean("getTable3", Table.class);
        System.out.println(t3);
        Table t4 = context.getBean("getTable4", Table.class);
        System.out.println(t4);

        context.close();
    }


}
