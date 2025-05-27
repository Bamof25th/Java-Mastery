package Greedy;

import java.util.*;

public class ActivitySelection {

    public static int greedyActivitiy(int[] start, int[] end) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        count = 1;
        int lastEnd =  end[0];
        for (int i = 1; i < end.length; i++) {
            if(start[i] > lastEnd){
                count++;
                list.add(i);
                lastEnd = end[i];
            }
        }

     return count;

    }

    public static void main(String[] args) {
        int[] a = { 1,3,0,5,8,5 };
        int[] b = { 2,4,6,7,9,9 };

        int asd = greedyActivitiy(a, b);

        System.out.println(asd);
    }
}
