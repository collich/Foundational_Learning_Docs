package com.second.learn_another.examples.dep_inj;

// import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessLogic{
    Dependency1 dependency1;
    Dependency2 dependency2;

    public BusinessLogic (Dependency1 dependency1, Dependency2 dependency2){
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    // @Autowired
    public void setDependency1(Dependency1 dependency1){
        this.dependency1 = dependency1;
    }

    // @Autowired
    public void setDependency2(Dependency2 dependency2){
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1{
}

@Component
class Dependency2{
}

@Configuration
@ComponentScan("com.second.learn_another.examples.dep_inj")
public class DependencyInjectionApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionApp.class)) {
            // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessLogic.class).toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
