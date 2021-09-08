package com.example.cicddemowithappcenter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesArray {


    public static void main(String...args){
        int[] array = {4,6,7,8,4,9,8,7};
        System.out.println(findDuplicates(array));
    }


    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> dupes = new HashSet<>();
        for (int num : nums) {
            if (!dupes.add(num)) {
                list.add(num);
            }
        }
        return list;
    }
}
