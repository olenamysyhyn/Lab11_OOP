package ucu.edu.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Oles").age(32).
                                    gender("male").mark(61).mark(100).
                                    grades(Arrays.asList(62,63)).build();
        System.out.println(user);
        
    }
}