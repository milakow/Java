package org.collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMechanism {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        //{>null}
        System.out.println(names.size());
        names.add("Ada");
        //("Ada")>null
        //{>("Ada")>null}
        System.out.println(names.size());
        names.add("Iza");
        //("Iza")>null
        //{>("Ada")>("Iza")>null}
        System.out.println(names.size());
        names.add("Jan");
        //("Jan")>null
        //{>("Ada")>("Iza")>("Jan")>null}
        System.out.println(names.size());
        names.add("Zofia");
        //("Zofia")>null
        //{>("Ada")>("Iza")>("Jan")>("Zofia")>null}
        System.out.println(names.size());
        names.add(0,"Tom");
        //("Tom")>null
        //at 0 is: ("Ada")>("Iza")>
        //make 'tom' point 'ada'
        //("Tom")>("Ada")>
        //make linked list point to tom
        //{>("Tom")>("Ada")>("Iza")>("Jan")>("Zofia")>null}

    }
}
class MyNode1 {
    private String data;
    private MyNode1 nextNode = null;
}

class MyLinkedList{
    private MyNode1 firstNode = null;
}