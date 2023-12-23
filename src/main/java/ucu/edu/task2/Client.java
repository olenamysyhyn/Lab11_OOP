package ucu.edu.task2;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class Client {
    private static int current_id = 0;
    private int id;
    private String name;
    private int age;
    private Sex sex;
    
    public Client(String name, int age, Sex sex) {
        id = current_id++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
