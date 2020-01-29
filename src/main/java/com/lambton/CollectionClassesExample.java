package com.lambton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionClassesExample
{
    public static void main(String[] args)
    {
        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("Canada");
        countryList.add("India");


        System.out.println(countryList.get(1));

        for(String name: countryList)
        {
            System.out.println(name);
        }

        for(int i=0; i< countryList.size();i++)
        {
            System.out.println(countryList.get(i));
        }

        HashSet<String> c = new HashSet<>();
        c.add("A");
        c.add("B");

        c.add("ABC");
        c.add("Bca");
        c.add("C");
        c.add("D");

        c.remove("B");
        for (String s : c)
        {
            System.out.println(s);
        }

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("IND", "India");
        hashMap.put("CAN", "Canada");
        hashMap.put("NEP", "Nepal");

        for(Map.Entry<String, String> entry : hashMap.entrySet())
        {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        HashMap<String, ArrayList<String>> countryStatesList = new HashMap<>();
        

    }


}
