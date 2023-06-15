package Lectures.arraysandarraylist;

public class Outer {
    int x=5;

    class inner{
        int x=7;

        void func(int x){
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer.this.x);
        }
    }
    public static void main(String... args){

        Outer out=new Outer();
        Outer.inner in = out.new inner();
        in.func(10);


    }
}

























