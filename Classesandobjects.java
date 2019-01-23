package kobe;
import java.util.Scanner;
    public class Classesandobjects {
    public static void main(String[] args) {
        Scanner pug = new Scanner(System.in);
        
            dog Charlie = new dog();
            Charlie.setName("Charlie put");
            
            String dogA = Charlie.getName();
            System.out.println(dogA);
            System.out.print("Name: ");
            
            String name=pug.next();
            Charlie.setName(name);
            System.out.print("Age: ");
            
            int age=pug.nextInt();
            Charlie.setAge(age);
            System.out.print("Breed: ");
            String breed=pug.next();
            Charlie.setBreed(breed);
            
            System.out.print("Gender: ");
            char gender=pug.next().charAt(0);
            Charlie.setGender(gender);
}
}