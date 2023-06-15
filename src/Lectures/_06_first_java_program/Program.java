package Lectures._06_first_java_program;

public class Program {

    int value;

    public void result() {
        int value = 20;
        System.out.print(this.value);
    }

    public static void main(String[] args) {
        new Program().result();


    }
}