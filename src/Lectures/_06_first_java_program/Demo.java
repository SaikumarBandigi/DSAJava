package Lectures._06_first_java_program;

import java.io.File;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {


//        PrintStream obj = System.out;
//        obj.print("Hello world");


//        InputStream inputStream = System.in;
//
//        Scanner scanner = new Scanner(inputStream);
//
//        int a = scanner.nextInt();
//        System.out.println(a);


        File f = new File("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\Bandigi.pdf");

        Scanner sc = new Scanner(f);
        String s = sc.nextLine();

        System.out.println(s);
    }
}

