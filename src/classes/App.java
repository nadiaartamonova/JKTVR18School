
package classes;

import entity.Person;
import entity.Topic;


public class App {
     public void run(){
         
         //------------------setter PERSON------------------
        System.out.println("--------------------Persons-----------------");
        Person person1 = new Person(null, "Nadezda", "Artamonova", "pupil");
        System.out.println(person1.toString());
        
        Person person2 = new Person(null, "Roman", "Golf", "pupil");
        System.out.println(person2.toString());
        
        Person person3 = new Person(null, "Stas", "Java", "teacher");
        System.out.println(person3.toString());
        
        //------------------- setter TOPIC-----------------
        System.out.println("--------------------Topics-----------------");
        
        Topic topic1=new Topic(null, "Sometimes", person3, "All about our life in world");
        System.out.println(topic1.toString());
        
        
        
     }
}
