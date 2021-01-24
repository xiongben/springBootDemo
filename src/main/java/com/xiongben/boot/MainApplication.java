package com.xiongben.boot;


import com.xiongben.boot.bean.Pet;
import com.xiongben.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);

//        Pet tom01 = run.getBean("tom22",Pet.class);
//        Pet tom02 = run.getBean("tom22",Pet.class);
//        System.out.println("组件："+(tom01 == tom02));

        boolean tom = run.containsBean("tom");
        System.out.println("容器中tom组件：" + tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件：" + user01);

        User user02 = run.getBean("user01",User.class);
        System.out.println(user02);

    }


}
