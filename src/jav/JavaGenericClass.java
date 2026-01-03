package jav;

import java.util.Scanner;

public class JavaGenericClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                String s = sc.next();
                GenericClass<String> stringGenericClass = new GenericClass<>(s);
                stringGenericClass.showType();
            } else {
                int i = sc.nextInt();
                GenericClass<Integer> integerGenericClass = new GenericClass<>(i);
                integerGenericClass.showType();
            }
        }
    }
}
class GenericClass<T> {
    String s;
    int i;
    GenericClass(int i) {
        this.i = i;
    }
    GenericClass(String s) {
        this.s = s;
    }
    public void showType() {
        if (s != null) {
            System.out.println("String");
            System.out.println(s);
        } else if (i >= 0) {
            System.out.println("Integer");
            System.out.println(i);
        }
    }
}