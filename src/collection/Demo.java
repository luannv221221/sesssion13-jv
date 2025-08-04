package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student = new Student(1,"A",19);
        Student student1 = new Student(2,"C",16);
        Student student3 = new Student(3,"B",18);
        list.add(student);
        list.add(student1);
        list.add(student3);

        for (Student st : list) {
            System.out.printf(st.toString());
        }
        System.out.println("Sau khi sap xep");
//        Collections.sort(list);
//        for (Student st : list) {
//            System.out.printf(st.toString());
//        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return CharSequence.compare(o2.getName(),o1.getName());
            }
        });
        for (Student st : list) {
            System.out.printf(st.toString());
        }
    }
}
