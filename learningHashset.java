import org.w3c.dom.css.CSSStyleRule;

import java.util.*;


public class learningHashset {
    public static void  main(String[] args) {
//************   JAVA HASHSET ***********
        /** Hashset stores the elements by using a mechanism called hashing
         * Hashset contains unique elements only
         * hast allows null value
         * hashset class is not synchronized
         * Hashset doesnot maintain the insertion order,here the elements are inserted on the basis of their hashcode
         * Hashset is the best approach for search operations
         *
         * A list can contains duplicate elements whereas set contains unique and elements only
         */


        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("kazi");
        hashSet.add("jubo");
        hashSet.add("plaebnt");
        hashSet.add("kazi");
        // here the duplicate value will not print out
        System.out.println("printing hashset value\n"+ hashSet);

        // printing each value from the hashset and then print it
        for (String i:hashSet
             ) {
            System.out.println(i);
        }
        // removing the elemets from the hashset
        hashSet.remove("kazi");
        System.out.println("removing the elements\n"+hashSet);

        hashSet.add(null);
        System.out.println(hashSet);

        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("nokia");
        hashSet1.add("iphone");
        hashSet1.add("oneplus");
        // adding two  hashset together
        hashSet.addAll(hashSet1);
        System.out.println("Adding to hashset table together\n"+ hashSet);


        // removing hashset
      //  hashSet.remove(hashSet1);
        // System.out.println(hashSet1);

      hashSet.remove("iphone");
      System.out.println(hashSet);

      // isEmpty function
        System.out.println(hashSet.isEmpty());

        // ************  JAVA LINKEDHASHSET CLASS********



        /*
        *
        * java Linkedlistset class contains unique elements only like hashset
        * It provides all optional set operation and permits null elements
        * it is non synchronized
        * it maintains insertion order
        * The linkedhashset class extends hashset class which implements the set interface
        * */


        LinkedHashSet linkedHashSetSample = new LinkedHashSet();
        linkedHashSetSample.add("kazi");
        linkedHashSetSample.add("tom");
        linkedHashSetSample.add("jerry");
        linkedHashSetSample.add("iphone");
        linkedHashSetSample.add("10");
        linkedHashSetSample.add("44.444");
        linkedHashSetSample.add("9.9999999");
        linkedHashSetSample.add("True");


        System.out.println(linkedHashSetSample);

        // iterator is used to print the next elements.
        // for loop is one portion of iterator

        // applying iterator
        Iterator iteratorSample = linkedHashSetSample.iterator();
       System.out.println("printing list through iteratioon \n"+iteratorSample.next());
        System.out.println(iteratorSample.next());

        // applying while loop to print the list
        System.out.println(" print through iteration and while to print the complete list ");
        while (iteratorSample.hasNext()){
            System.out.println(iteratorSample.next());
        }

 // ************* JAVA TREESET CLASS***********

        /*
        * java tree set class implements the set interface that uses a tree for storage
        *
        * java treeset class contains uniqe elements only like Hashset
        * it can access and retriveal time are quite fast
        * it  doesnot allow null element
        * it is not synchronized
        * it maintains ascending order
        *
        * */
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("jubo");
        treeSet.add("kam");
        treeSet.add("lamb");
        treeSet.add("enjoy");
        treeSet.add("zaxy");

        System.out.println(treeSet);
        // applying for each to print

        for (String i:treeSet)
              {
                  System.out.println(i);


        }

        // another treeset data
        TreeSet<Integer> treeSet1= new TreeSet<Integer>();
        treeSet1.add(600);
        treeSet1.add(900);
        treeSet1.add(700);
        treeSet1.add(200); treeSet1.add(560);
        for (int i:treeSet1
             ) {
            System.out.println(i);

        }
        System.out.println(treeSet1);


        // using pull function to pull out the first and last elements

        System.out.println("Pulling the first elmennt from the set=\n"+treeSet1.pollFirst());
        System.out.println("Pulling the first elmennt from the set=\n "+treeSet1.pollLast());


        // declaring a new tree
        TreeSet<String> treeSet2 = new TreeSet<String>();
        treeSet2.add("A");
        treeSet2.add("B");
        treeSet2.add("C");
        treeSet2.add("D");
        treeSet2.add("E");
        treeSet2.add("F");

        // print the set in descending order
        System.out.println("print the list in descending order:"+ treeSet2.descendingSet());


        // use the " .headSet function ----> to print the list upto the middle of the list
        // such as if we want to print the set upto the letter -C

        // then the code excute

        System.out.println("print the list upto the middle of list -B \n"+treeSet2.headSet("C"));// this code implements upto the letter 'B' and print that
        System.out.println("Print the list list upto the midddle of the list till 'C' \n"+treeSet2.headSet("C", true)); // this code implements upto the letter C

        // print the list with the limit
        // using the "Subset function int the treeset " we can able to print the list with a limit
        System.out.println("using subset we print the list in a limit bound \n"+treeSet2.subSet("A",false,"E",true));

        System.out.println("2nd subset we print the list in a limit bound \n"+treeSet2.subSet("A",false,"E",false));


        // using the true we can print the letter in the subset .

        // Using "tailset function "
        System.out.println("Using tailset to print the list \n"+ treeSet2.tailSet("A",false));


        TreeSet<String> treeSet3 = new TreeSet<String>();
        treeSet3.add("jubo");
        treeSet3.add("jubosdsdsd");
        treeSet3.add("juboeeeee");
        treeSet3.add("jubozzzzz");

        Iterator iteratortreeSet3 = treeSet3.descendingIterator();
        // using while loop we can print the list element one after another
        while (iteratortreeSet3.hasNext()){
            System.out.println(iteratortreeSet3.next());
            // here we will print one by one
        }

        //******************  JAVA QUEUE INTERFACE *********************
        /*
        * THE QUEUE INTERFACE IS PROVIDED in java.util package and it implements the collection interface.
        * the queue interface is first in first out . this means that the elements entered first are the ones that are
        * deleted first
        *
        * */


        Queue<Integer> Queue = new LinkedList<Integer>();
        // add and print the elements in the queue
        Queue.add(2);
        Queue.add(722);
        Queue.add(123);
        Queue.add(52);
        Queue.add(92);
        Queue.add(2012);

        System.out.println("Print the queue\n"+ Queue);

        // remove the elements from the queue
        Queue.remove();
        System.out.println("remove the elements following the conecepts first in first out \n"+ Queue);

        // remove a particular elements from the queue
        Queue.remove(52);
        System.out.println("remove a specific element from the queue\n"+ Queue);

        // print the size
        System.out.println("size of the queue\n "+Queue.size());

        // print the head elements of the Queue
        int headelementsoftheQueue = Queue.peek(); // peek means first elements
        System.out.println("head elements of the Queue\n"+headelementsoftheQueue);

        int pullelementsoftheQueue = Queue.poll();
        System.out.println("pulling elements of the Queue\n"+ pullelementsoftheQueue);

        // pull a specific number of the queue
        System.out.println("pulling a specific elements of the Queue\n"+ Queue.poll());








        //*********************************  JAVA PriorityQueue*******************
        /*
        * The priorityQueue class provides the facitly of using Queue
        * but it doesnot orders the elements in first in first out manner */


        PriorityQueue <String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("kazi");
        priorityQueue.add("kkaaj");
        priorityQueue.add("tom");
        priorityQueue.add("lame");


        System.out.println("print the priority queue \n "+priorityQueue);

        Iterator<String> iteratorPriorityQueue = priorityQueue.iterator();
        System.out.println("using iternator and priniting the list ");
        while (iteratorPriorityQueue.hasNext())
        {
            System.out.println(iteratorPriorityQueue.next());
        }


        System.out.println("print the elements using peek function\n"+priorityQueue.peek());
        System.out.println("print the elements using poll function\n"+priorityQueue.poll());
        System.out.println("print the elements using elements  function\n"+priorityQueue.element());


        // ********Java Deque Interface *************

        /*
        * java Deque interface is a linear collection that supports elements insertion and removal at both ends.
        *
        * unlike queue, we can add or remove elements from both side
        * Null elements are not allowed in the Arraydueue
        * ArrayDeque is not thread safe, in the absence of external synchorization
        * ArrayDeque has no capacity restrictions
        * ArrayDeque is faster than Linkedlist and stack
        *
        *
        * */

        Deque<String> deque = new ArrayDeque<>();
        deque.add("kazi");
        deque.add("rimu");
        deque.add("lame");

        System.out.println("print the deque list\n "+ deque);
        // use offer function to add the elements in the deque list
        // offer usually add the element in the last of the list
        deque.offer("toton");
        System.out.println("adding the elements in the deque \n"+deque);
        // using the offerfirst function we can add the elements in the first portion of the list
        deque.offerFirst("sumi");
        System.out.println("adding the elements in the first portioon of the list \n"+ deque);

        System.out.println(deque.poll());
        System.out.println(deque.peekFirst());
        System.out.println(deque.pollLast());

        deque.addFirst("rajj");
        System.out.println(deque);

        deque.removeFirstOccurrence("kazi");
        deque.remove();
        System.out.println(deque);

        // **************JAVA MAP INTERFACE *******************
        /**
         * A map contains values on the basis of key , i.e key and value pair
         * Eack key and value pair is known as an entru.
         * A map contains unique keys
         *
         */




        Map<Integer,String> mapSample = new HashMap<>();
        mapSample.put(1,"kazi");
        // put function is to add or store the elements of key and string
        mapSample.put(2,"jubo");
        mapSample.put(3,"toton");
        mapSample.put(4,"lame");
        mapSample.put(5,"mim");
        mapSample.put(5,"kaji");
        System.out.println("print the maplist \n"+ mapSample);

        for (Map.Entry mmm : mapSample.entrySet()
             ) {
                System.out.println("your roll number and name "+ mmm.getKey()+" , "+mmm.getValue());
        }

        Map <Integer,String> mapSample1 = new HashMap<>();
        mapSample1.put(1,"rimu");
        mapSample1.put(2,"Black");
        mapSample1.put(3,"tom");
        mapSample1.put(4,"jerry");
        System.out.println(mapSample1);
        // changing the existing elements between the map
        mapSample1.put(new Integer(1),"ranimaa");
        System.out.println("changing the element between the list \n"+ mapSample1);

        mapSample1.put(7,"tanji");
        mapSample1.remove(2);
        System.out.println("removing element \n"+ mapSample1);


        //**************** java HASHMAP ********************

        /*
        * Java HashMap contains value based on the key
        * java HashMap contains only unique Keys
        * Java HAshMap may have one null keys and multiple null values
        * java HashMap maintains no order
        *
        * */

        HashMap <Integer, String > hashMap = new HashMap<>();
        hashMap.put(1, " rimu");
        hashMap.put(2, "kazi");
        hashMap.put(3,"ricky");
        hashMap.put(4,"lame");
        hashMap.put(5,"filza");

        System.out.println("prinmt the hashmap\n"+ hashMap);


        for (Map.Entry hashmapping : hashMap.entrySet()
             ) {
            System.out.println("print it using for-each loop \n"+ hashmapping.getValue()+hashmapping.getKey());

        }

        //using putAbsent function
        hashMap.putIfAbsent(3,"jaaj");
        System.out.println(hashMap);
        hashMap.putIfAbsent(6,"jaaj");
        System.out.println(hashMap);

        //merging toegether two hashmap

        HashMap<Integer,String > hashmapping1 = new HashMap<>();
        hashmapping1.put(88,"kk product");
        hashmapping1.put(99,"ll items");

        hashmapping1.putAll(hashMap);
        System.out.println("adding two hashmap\n"+hashmapping1);

        hashmapping1.remove(2);
        System.out.println(hashmapping1);


        // ************  Java LinkedHashMap************************

        /**
         * it contains values based on the key
         * conatins unique elements
         * may have one null key and multiple vaules
         * maintains insertion order
         */



        LinkedHashMap<Integer,String> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put(1,"kazi");
        linkedHashMap.put(2,"tttt");
        linkedHashMap.put(12,"eeee");
        linkedHashMap.put(11,"wwww");
        linkedHashMap.put(null,"modi");
        linkedHashMap.put(55, null);
        linkedHashMap.put(66,null);

        System.out.println(linkedHashMap);



        // ***********JAVA TREEMAP*****************

        /**
         * contains values based on the key
         * contains unique elements
         * cannot have a null key but it can multiple null values
         * maintains ascending order
         *
         */





        TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1,"kazi");
        treeMap.put(2,"kazi");
        treeMap.put(3,"mike");
        treeMap.put(4,"john");
        treeMap.put(5,"rimu");
        treeMap.put(6,"sumi");
        treeMap.put(7,"akter");
        treeMap.put(8,"ranimaa");
        treeMap.put(9,"shamin");
        System.out.println("print the treemap\n "+ treeMap);

        for (Map.Entry treeMapPrintForeachLoop: treeMap.entrySet()
             ) {
            System.out.println(treeMapPrintForeachLoop);
            System.out.println(treeMapPrintForeachLoop.getKey()+"    "+treeMapPrintForeachLoop.getValue());

        }

        // priint the data in set format
        System.out.println("print the tree mao data in set format "+ treeMap.entrySet());

        // remove the data from the treemap
        treeMap.remove(2);
        System.out.println("remove the data from the treemap"+ treeMap);

        // decending order print
        System.out.println("print in desecnding order \n"+ treeMap.descendingMap());

        // printing upto the value =3=======> enter 3 token it will print all the values before 3
        System.out.println("print value up to 3\n"+ treeMap.headMap(4));
        // by using boolean value we can print the value itself 3
        System.out.println(treeMap.headMap(3,true));
        System.out.println(treeMap.headMap(3,false));

        // print the subportion of the tree map

        System.out.println("print subportion of the tree=\n"+ treeMap.subMap(2,8));
        // to include the first and last value also
        System.out.println("to include the first and last value also\n"+treeMap.subMap(2,true,8,true));
        System.out.println("to include the first only\n"+treeMap.subMap(2,true,8,false));
        System.out.println("to include last value also\n"+treeMap.subMap(2,false,8,true));


        //************JAva HashTable**************

        /*
        * A hashtable is an array of a list. each list is known as a bucket
        * A hashtable contains values based on the key
        * Contains unique elements
        * doesnot allow null keys  or value
        *
        *
        * */


        Hashtable<Integer,String > hashtable = new Hashtable<Integer, String>();
        hashtable.put(1,"kazi");
        hashtable.put(2,"tom");
        hashtable.put(3, "sharif");
        hashtable.put(4,"kam");
        hashtable.put(5,"little");
        hashtable.put(6,"big");
        hashtable.put(7,"mouse");

        ////// it prints the value in descending order


        System.out.println("print the hashtable above\n "+  hashtable);

        // remove the elements
        hashtable.remove(5);
        System.out.println("remove the elements from the hashtabale \n"+ hashtable);

        // replace the elements

        hashtable.replace(3,"manaz");
        System.out.println("replacing the values: \n "+hashtable);


        // find the valies
        System.out.println("finding the elements form the hashtable \n "+ hashtable.get(3));

        // if the value is not present
        System.out.println(hashtable.getOrDefault(10,"not found "));

        // putAbsent
        hashtable.putIfAbsent(8,"nishat");
        // if the value is presnt then it will replace the value
        // if the value is not present then it add the hashtable
        System.out.println(hashtable);


























    }
}
