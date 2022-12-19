package prac_6;

public class Sorting {
    public static void main(String[] args) {
        Student[] s1 = new Student[5];
        array_fill(s1);
        System.out.println("before sort");
        print_array(s1);
        insertion_sort(s1);
        System.out.println("after sort");
        print_array(s1);
    }

    static void insertion_sort(Student[] a)
    {
        Student tmp;
        for (int i = 1; i < a.length; ++i)
        {
            tmp = a[i];
            int k = i-1;
            while (k >= 0 && a[k].compareTo(tmp) > 0)
            {
                    a[k+1] = a[k];
                    k--;
            }
            a[k+1] = tmp;
        }
    }

    static void array_fill(Student[] array)
    {
        for (int i = 0; i < array.length; ++i)
        {
            array[i] = new Student();
            array[i].ID = 10000 + (int) (Math.random()*90000);
            array[i].average = 2 + (Math.random()*3);
        }
    }

    static void print_array(Student[] array)
    {
        for (int i = 0; i < array.length; ++i)
        {
            System.out.println(array[i].ID + ": " + array[i].average);
        }
        System.out.print("\n");
    }

}
