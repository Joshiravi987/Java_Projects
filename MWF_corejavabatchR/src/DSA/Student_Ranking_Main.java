package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class StudentRanking implements Comparable<StudentRanking> {
    int Rollno;
    String name;
    int Marks;

    public StudentRanking(int Rollno, String name, int Marks) {
        this.Rollno = Rollno;
        this.name = name;
        this.Marks = Marks;
    }

    @Override
    public int compareTo(StudentRanking o) {
        // Sort in descending order of marks
        return Integer.compare(Marks,o.Marks);
    }
}

public class Student_Ranking_Main {
    public static void main(String[] args) {
        ArrayList<StudentRanking> al = new ArrayList<>();

        al.add(new StudentRanking(1, "Ravi", 95));
        al.add(new StudentRanking(2, "Avi", 70));
        al.add(new StudentRanking(3, "Kavi", 80));

        Collections.sort(al);

        Iterator<StudentRanking> it = al.iterator();
        while (it.hasNext()) {
            StudentRanking a = it.next();
            System.out.println(a.Rollno + "  " + a.name + "  " + a.Marks);
        }
    }
}
