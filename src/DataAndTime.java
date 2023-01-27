import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class DataAndTime {


    public static void main(String[] args) {
        Date date = new Date();


        long l1, l2;
        Calendar calendar = new GregorianCalendar(2023,Calendar.APRIL,7,3, 12,24); //(2023,Calendar.APRIL,7,3, 12,24);
        System.out.println(l1 = date.getTime());
        System.out.println(calendar.getTime());
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            list.add(new Integer(i));
//        }
//
//        Collections.shuffle(list);
//        System.out.println(list);
//        Collections.sort(list);
        Date date1 = new Date();

        System.out.println(l2 = date1.getTime());
        System.out.println("время выполнения программы: " + (l2-l1) + "нс");
    }
}
