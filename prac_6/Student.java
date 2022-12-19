package prac_6;

public class Student implements Comparable<Student>{
    public double average;
    public int ID;

    Student(int ID, double average)
    {
        this.ID = ID;
        this.average = average;
    }

    Student()
    {
        ID = 0;
        average = 2;
    }

    @Override
    public int compareTo(Student o) {
        if (this.ID > o.ID) return 1;
        else if (this.ID == o.ID) return 0;
        else return -1;
    }
}
