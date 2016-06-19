package com.abhay.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class NameSortLastChar { 
	
	private static String[] names = {"Luis", "Hector", "Selena", "Emmanuel", "Amish"};

public static void main(String[] args) {
    List<String> linkedNames = new ArrayList<String>();
    String firstName = null;
    for (int i=0; i<names.length; i++) {
        boolean isFirstName = true;
        String currentName = names[i];
        char prev = currentName.charAt(0);
        for (int j=0; j<names.length; j++) {
            /*if (i==j) continue;*/
            String name = names[j];
            char end = name.charAt(name.length()-1);
            if (Character.toLowerCase(prev) == Character.toLowerCase(end)) {
                isFirstName = false;
                break;
            }
        }
        if (isFirstName) {
            firstName = currentName;
            break;
        }
    }

    // if a loop
    if (firstName == null) {
        firstName = names[0];
    }

    linkedNames.add(firstName);
   /* System.out.println(linkedNames);*/
    String next = firstName;
    while(next != null) {
        char endChar = next.charAt(next.length()-1);
        next = null;
        for (String name:names) {
            if (linkedNames.contains(name)) {
                continue;
            }
            if (Character.toLowerCase(endChar) == Character.toLowerCase(name.charAt(0))) {
                linkedNames.add(name);
                next = name;
                break;
            }
        }
    }

    System.out.println("[");
    for (String name : linkedNames) {
        System.out.println(name);
    }
    System.out.println("]");
}}
