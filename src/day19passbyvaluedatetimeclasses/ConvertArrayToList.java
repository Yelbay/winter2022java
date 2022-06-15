package day19passbyvaluedatetimeclasses;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer arr[]={3,4,5,6};
        //when we create a list from an array by using asList() method the length will be fixed like array.loop is better for
        // converting to array to list
        Arrays.asList(arr);
        List<Integer>list=Arrays.asList(arr);
        System.out.println(list);
        //Try to remove an element from list we can not remove and add if we make as.List(arr)
       // list.remove(1);
       // System.out.println(list);
//Try to add an element into the list
       // list.add(7);
       // System.out.println(list);
        //try to clear the list
        //list.clear();
       // System.out.println(list);



            Object[] obj = new Object[]{ "3", 4, "2", "5",1 ,6 };

            TreeSet<Integer> listo = new TreeSet<>();

            for (Object o: obj) {
                if ( o instanceof Integer)
                    listo.add ( (int) o) ;
                else
                    listo.add( Integer.valueOf((String) o) );
            }

            System.out.println(listo);

        }



    }

