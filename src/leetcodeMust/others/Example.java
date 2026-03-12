package leetcodeMust.others;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Example {
    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());

        pq.add(new Student("sai", 99));
        pq.add(new Student("isha", 97));
        pq.add(new Student("abhi", 90));


        while (!pq.isEmpty()) {
            Student obj = pq.poll();
            System.out.println(obj);
        }

    }
}

class Student {
    String name;
    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getMarks(), o1.getMarks());
    }
}