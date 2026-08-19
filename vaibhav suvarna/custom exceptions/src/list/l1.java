package list;

import java.util.ArrayList;

public class l1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        System.out.println(a);
        a.add("nsam");
        a.add("fgc");
        a.add("nb");
        a.add("gfb");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        for (int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }


    }
}