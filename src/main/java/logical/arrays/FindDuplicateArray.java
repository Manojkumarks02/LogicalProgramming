package logical.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,2,4,5,6,7,7,8};
        Set<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);
    }

    private static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>(); //to keep track of elements we've encountered
        Set<Integer> set1 = new HashSet<>(); //If an element is already in the set, it means it's a duplicate, so we add it to another set

        for(int num : arr){
            if( !set.add(num)){
                set1.add(num);
            }
        }
        return set1;
    }
}
