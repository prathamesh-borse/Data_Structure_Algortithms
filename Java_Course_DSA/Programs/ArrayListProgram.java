package Java_Course_DSA.Programs;

import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {
        arrayListExercise();
    }

    private static void arrayListExercise() {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Orange");
//        list.add("Mango");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
    }
}

/*
Write a program to create an ArrayList of strings, add elements to the list, and print the list.

Your program should do the following:

Create an ArrayList of strings called "list"

Add the following elements to the list: "Apple", "Banana", "Orange", "Mango"

Use a loop to iterate through the list and print each element on a new line

Example 1:

Output: Apple
Banana
Orange
Mango

Explanation:
Constraints:

None
*/