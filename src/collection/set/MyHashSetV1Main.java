package collection.set;

import collection.list.MyLinkedList;

import java.util.LinkedList;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(3);
        set.add(14);
        set.add(24); // hashIndex 중복
        System.out.println(set);

        // 검색
        int searchValue = 14;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("set.remove(" + searchValue + ") = " + removeResult);
        System.out.println(set);
    }
}
