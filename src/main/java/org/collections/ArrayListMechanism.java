package org.collections;

import java.util.ArrayList;
import java.util.List;
public class ArrayListMechanism {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //[null][null][null]
        System.out.println(names.size());
        names.add("Ada");
        //["Ada"][null][null]
        System.out.println(names.size());
        names.add("Iza");
        //["Ada"]["Iza"][null]
        System.out.println(names.size());
        names.add("Jan");
        //["Ada"]["Iza"]["Jan"]
        System.out.println(names.size());
        names.add("Zofia");
        //["Ada"]["Iza"]["Jan"]
        //[null][null][null][null][null][null]
        //["Ada"][null][null][null][null][null]
        //["Ada"]["Iza"][null][null][null][null]
        //["Ada"]["Iza"]["Jan"][null][null][null]
        //["Ada"]["Iza"]["Jan"]["Zofia"][null][null]
        System.out.println(names.size());
        names.add(0, "Tom");
        //["Ada"]["Iza"]["Jan"]["Zofia"]["Zofia"][null]
        //["Ada"]["Iza"]["Jan"]["Jan"]["Zofia"][null]
        //["Ada"]["Iza"][["Iza"]["Jan"]["Zofia"][null]
        //["Ada"]["Ada"][["Iza"]["Jan"]["Zofia"][null]
        //["Tom"]["Ada"][["Iza"]["Jan"]["Zofia"][null]
    }
}
