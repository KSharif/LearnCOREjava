import java.util.*;


public class learningLinkedList {
    public static void main(String[] args) {
        //***********LinkedLIST*************

        // java LinkedList class uses a doubly linkedList to store the elements

        LinkedList<String> linkedListsample = new LinkedList<String>();
        linkedListsample.add("kazi ");
        linkedListsample.add("kazi ");
        linkedListsample.add("kazi ");
        linkedListsample.add("kazi ");
        linkedListsample.add("kazi ");
        linkedListsample.add("kazi ");
        linkedListsample.add("kazi ");

        System.out.println("print the linked list=\n "+ linkedListsample);
        // through linkedlist you can add the elements before and after the array of linkedlist

        linkedListsample.add(0,"sharif");
        System.out.println("Print elements for the compements of the array \n "+ linkedListsample);

        // build a new more linkedlist
        LinkedList<String> nameSample = new LinkedList<String>();
        nameSample.add("kazi rimu");
        nameSample.add("kazi rimu");
        nameSample.add("kazi rimu");
        nameSample.add("kazi rimu");

        // merging two linked list together and build a new one
        // ------addall function is used to connect the linkedlist and arraylist also

         linkedListsample.addAll(nameSample);
        System.out.println("Merging two linkedlist together = \n "+linkedListsample);

        // adding elements into the first position of the linkedlist
        linkedListsample.addFirst("jaya tree");
        System.out.println("adding elements into the first position of the linkedlist\n"+ linkedListsample);
        // print them in a last position

        linkedListsample.addLast("trrreee tooommm");
        System.out.println(" Adding element in the last position of linkedlist =\n" + linkedListsample);

        // remove the elements from the linkedlist
        linkedListsample.remove(0);
        System.out.println("Removing elemensts from the linkedlist \n"+linkedListsample);
        // remove the complete linkedlist by objects
        linkedListsample.remove("sharif ");
        System.out.println("remove elements inform of objects \n"+linkedListsample);

        //// remove the complete linkedlist by objects
        linkedListsample.removeAll(nameSample);
        System.out.println("Remove the complete second linkedlist \n"+ linkedListsample);
        // clear the entire the linkedlist
        linkedListsample.addAll(nameSample);
        System.out.println();


        System.out.println("add the elements toegther "+linkedListsample);

        linkedListsample.clear();
        System.out.println(linkedListsample);

        // get names into the linkedlist through string
    //    String name1 = linkedListsample.get(1)
        //  System.out.println(linkedListsample);

        // print booelan , float , int into linkedlist
        LinkedList ramdonElements = new LinkedList();
        ramdonElements.add("10");
        ramdonElements.add("12.6666");
        ramdonElements.add("14.699999999");
        ramdonElements.add("true ");
        System.out.println(ramdonElements);

        //*********************JAva LIST INTERFACE ******************

        List<String> name22 = new ArrayList<>();
        name22.add("kazi");
        name22.add("kazi");
        name22.add("raaj");
        name22.add("kazi");

        // adding names into linked interface
        name22.add(4,"shaharair");
        System.out.println(name22);
        // check contain in the list

        System.out.println(name22.contains("kazi"));
        System.out.println(name22.contains("jj=ack"));

        // finding the position of index

        System.out.println(name22.indexOf("raaj"));

   // using get method in the linkedlist
        System.out.println(name22.get(2));

        // adding string array to the linked list

        String[] nameSample3 = {"maa", "baba", "sumi"};

        /***** we cannot add things in just the array, we have to use the linkedlist
         *
         */

        List<String> putStringToLinkedlist = new ArrayList<>();
        for (String i: nameSample3){
            putStringToLinkedlist.add(i);


        }
        System.out.println(putStringToLinkedlist);
















































    }

}
