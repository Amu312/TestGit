package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonIntegers {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>(Arrays.asList(1,3,5,7,8));
        List<Integer> b = new ArrayList<>(Arrays.asList(3,6,5));

        a.retainAll(b);
        System.out.println(a);

    }
}
