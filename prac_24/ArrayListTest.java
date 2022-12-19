package prac_24;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Moscow");
        cities.add("St. Petersburg");
        cities.add("Dublin");
        cities.add("New York");

        System.out.println("List:");
        for (String city:cities)
        {
            System.out.println(city);
        }

        System.out.println("list[2] = "+cities.get(2));
        cities.set(2, "Washington DC");
        System.out.println("list[2] = "+cities.get(2));

        System.out.println("There are " + cities.size() + " cities in the ArrayList");

        if (cities.contains("Dubai"))
        {
            System.out.println("There was Dubai in the ArrayList");
            cities.remove("Dubai");
        }
        else {
            System.out.println("There was no Dubai, spb removed instead");
            cities.remove("St. Petersburg");
        }

        System.out.println("List:");
        for (String city:cities)
        {
            System.out.println(city);
        }

        cities.sort(cmp);

        System.out.println("List:");
        for (String city:cities)
        {
            System.out.println(city);
        }

        if (cities.indexOf(cities.get(0)) == cities.lastIndexOf(cities.get(0)))
        {
            System.out.println("There is only 1 "+ cities.get(0)+" in the list");
        }
        else
        {
            System.out.println("There are several "+cities.get(0)+" in the list");
        }
    }
    static Comparator<String> cmp = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if (o1 == o2) {
                return 0;
            }
            if (o1 == null) {
                return -1;
            }
            if (o2 == null) {
                return 1;
            }
            return o1.compareTo(o2);
        }
    };
}
