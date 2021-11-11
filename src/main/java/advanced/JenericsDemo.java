package advanced;

import java.util.ArrayList;
import java.util.List;

public class JenericsDemo {


    public static void main(String[] args) {
        // not type safe
        List names = new ArrayList();
        names.add("Jerry");
        names.add(7);
        System.out.println(names);

        //<String> is generics giving type-safety
        List<String> stringNames = new ArrayList<>();
        stringNames.add("Jerry");
        // stringNames.add(7); compile error
        System.out.println(stringNames);
        List<String> testList = new ArrayList<>();
        System.out.println(addToList("test", testList));
    }

    // generic T is placeholder for any type
    private static <T> List<T> addToList(T element, List<T> list){
        list.add(element);
        return list;
    }
}
