package collectionandmaps;
import java.util.Set;
import java.util.HashSet;
import java.util.*;


public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();

        mapDemo();



    }

    public static void setDemo(){
        Set<String> fruit =new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        System.out.println(fruit.size());
        System.out.println(fruit);
//looping through collections
        //Iterator
        var i = fruit.Iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
//for loop
        for (String item:fruit){
            System.out.println(item);
        }
        //for each
        fruit.forEach(x -> System.out.println(x));

     public static void mapDemo(){
    Map<String,Integer> fruitCalories = new HashMap<>();
    fruitCalories.put("apple,65");
            fruitCalories.put("banana,45")
            fruitCalories.put("lemon,55")
            fruitCalories.put("pear,20")
            fruitCalories.put("lemon,25")
            fruitCalories.put("orange,165")
            System.out.println(fruitCalories.get("lemon"));
            System.out.println(fruitCalories.entrySet());
            fruitCalories.remove("organge");

        }
    }
}
