package JavaTraining.Week3.Day5;

import java.util.*;

public class O8 {
  public static void main(String[] args) {
    Set<Student> uniq = new TreeSet<Student>(new NameComparator());

    uniq.add(new Student(1, "mn"));
    uniq.add(new Student(2, "ab"));
    uniq.add(new Student(1, "mn"));

    System.out.println(uniq);
  }
}
