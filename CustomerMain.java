import java.util.Map;
import java.util.TreeMap;

public class CustomerMain {
    public static void main(String[] args) {
        Map<Integer,Customer> map=new TreeMap<>();
        map.put(1,new Customer(2900,"John"));
        map.put(8,new Customer(294,"Lim"));
        map.put(99,new Customer(100,"Melisa"));
        map.put(56,new Customer(267,"Tim"));
        System.out.println(map.toString());


    }
}
