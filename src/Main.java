import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<Children> hashSet = new HashSet<>();

        hashSet.add(new Children(Profession.STUDENT, "Egor"));
        System.out.println(hashSet);
    }
}