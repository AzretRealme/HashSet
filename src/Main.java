import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Integer> hashset = new HashSet<>();
        hashset.add(12);
        hashset.add(20);
        hashset.add(25);
        hashset.add(10);

        //hashset.add(10);
        for(Integer g: hashset){
            System.out.println(g);
        }

        System.out.println("--------------------------------------------------");

        System.out.println(hashset.size() + "  --Size");
        System.out.println(hashset.isEmpty() + " --isEmpty");
        System.out.println(hashset.contains(10) + " --contains(10)");
        System.out.println(hashset.remove(12) + " --remove(12)");

        System.out.println("--------------------------------------------------");

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(12);
        linkedHashSet.add(20);
        linkedHashSet.add(25);
        linkedHashSet.add(10);

        for(Integer w: linkedHashSet){
            System.out.println(w);
        }

        System.out.println("--------------------------------------------------");

        System.out.println(hashset.size() + "  --Size");
        System.out.println(hashset.isEmpty() + " --isEmpty");
        System.out.println(hashset.contains(10) + " --contains(10)");
        System.out.println(hashset.remove(12) + " --remove(12)");
    }
}
