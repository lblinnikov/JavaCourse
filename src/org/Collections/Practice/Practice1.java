package org.Collections.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {

    static List<Integer> getAllInput(List<Integer> integerList1, List<Integer> integerList2) {

        ArrayList<Integer> result = new ArrayList<>();

        // add everything up
        result.addAll(integerList1);
        result.addAll(integerList2);

        return result
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


    public static void main(String... arg) {

        // stealing Marek's solution for tet
        List<Integer> testList1 = Arrays.asList(2,1,3,5,4);

        List<Integer> testList2 = Arrays.asList(4,5,3,7,6);



        System.out.println(
                getAllInput(testList1,testList2)
        );


    }

}
