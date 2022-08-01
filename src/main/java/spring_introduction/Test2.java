package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);// указывается id и тип объекта -  интерфейс (можно и класс)
        pet.say();

        context.close(); // обязательно закрывать

    }
}
