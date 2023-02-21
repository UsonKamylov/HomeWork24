import java.util.*;

public class Main {
    public static  void main(String[] args) {
        Set<Integer> integer1=new HashSet<>();
        integer1.add(1);
        integer1.add(3);
        integer1.add(4);
        integer1.add(0);
        Set<Integer> integers2=new HashSet<>();
        integers2.add(7);
        integers2.add(3);
        integers2.add(4);
        integers2.add(5);
        System.out.println(symmetricDifference(integer1,integers2));




    }
    public static Set<Integer>symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> symmetricDiff=new HashSet<Integer>(set1);
        symmetricDiff.addAll(set2);
        Set<Integer> tmp=new HashSet<Integer>(set1);
        tmp.retainAll(set2);
        symmetricDiff.removeAll(tmp);
        return symmetricDiff;

    }
}