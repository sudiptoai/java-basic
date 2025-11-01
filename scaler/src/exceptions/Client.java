package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\karl\\Desktop\\test.txt");
        try {
            Scanner input = new Scanner(file);
        }catch (FileNotFoundException e){
            System.out.println("error: "+e);
        }
    }
}
