package advanced;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionDemo {
    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new House());
        print(buildings);
        printSuper(buildings);
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        // print(houses); compile error because List<House> is not subtype of List<Building>
        printExtends(houses);
    }
private static void print(List<Building> buildings){
    for (Building  element:
            buildings) {
        System.out.println(element.toString());
    }
}

// <? extends Building> means all subclasses of Building
private static void printExtends(List<? extends Building> buildings){
        for (Building  element:
                buildings) {
            System.out.println(element.toString());
        }
    }

    // <? super House> superclass of House
    private static void printSuper(List<? super House> buildings){
        for (Object element:
                buildings) {
            System.out.println(element.toString());
        }
    }
}

class Building {
    @Override
    public String toString() {
        return "Building";
    }
}

class House extends Building {
    @Override
    public String toString() {
        return "House";
    }
}
