package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        places.add("Delhi");
        places.add("Mumbai");
        places.add("Sydney");
        places.add("New York");
        places.add("London");
        places.add("Paris");
        places.add("Kashmir");

        printList(places);

        places.add(1, "Dubai");

        printList(places);

        places.remove(4);
        printList(places);

    }

    private static void printList(LinkedList<String> ll){
        Iterator<String> i = ll.iterator();
        while (i.hasNext()){
            System.out.println("Visiting " +i.next());
        }
        System.out.println("========================");
    }

    private static boolean addOrder(LinkedList<String> ll, String city){
        ListIterator<String> stringListIterator = ll.listIterator();
        while(stringListIterator.hasNext()){
            int comparision = stringListIterator.next().compareTo(city);
            if(comparision==0){
                System.out.println(city +" already included");
                return false;
            }
            else if(comparision>0){
                stringListIterator.previous();
                stringListIterator.add(city);
                return true;
            }
            else if(comparision<0){

            }
        }
        stringListIterator.add(city);
        return true;
    }
}
