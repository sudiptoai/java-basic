package exceptions;

import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =  scanner.nextInt();
        try {
            checkAge(age);
            System.out.println("Age is "+age);
        }catch (InterceptAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkAge(int age) throws InterceptAgeException {
        if(age < 0 || age > 120){
            throw new InterceptAgeException("age can not be -ve");
        }
    }
}
