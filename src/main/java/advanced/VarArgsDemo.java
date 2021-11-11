package advanced;

public class VarArgsDemo {

    public static void main(String[] args) {
        sysoString("tom");
        sysoString("tom", "jerry");
    }

    // items will take make array automaticalyy
    private static void sysoString(String... items){
        for (String element: items) {
            System.out.println(element);
        }
    };
}
