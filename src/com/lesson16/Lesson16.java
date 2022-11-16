package com.lesson16;

import com.employe.Developer;
import com.example.Fox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lesson16 {
    public static void main(String[] args) {
        Developer developer = new Developer(12_000, "Joe", new String[] {"Java", "JS"});
        Developer developer1 = new Developer(12_000, "Joe1", new String[] {"Java", "JS"});
        Developer developer2 = new Developer(12_000, "Joe2", new String[] {"Java", "JS"});
        Developer developer3 = new Developer(12_000, "Joe3", new String[] {"Java", "JS"});

        String name = "Joe3";
        ArrayList<Developer> developerArrayList =  new ArrayList<>();
        developerArrayList.add(developer);
        developerArrayList.add(developer1);
        developerArrayList.add(developer2);
        developerArrayList.add(developer3);

        Developer devJoe = null;
        for (Developer dev: developerArrayList) {
            if(dev.getName().equals(name)) {
                devJoe = dev;
                break;
            }
        }


        Map<String,Developer > developerMap = new HashMap<>();
        developerMap.put(developer.getName(), developer);
        developerMap.put(developer1.getName(), developer1);
        developerMap.put(developer2.getName(), developer2);
        developerMap.put(developer3.getName(), developer3);

        devJoe = developerMap.get(name);

        //MAp with 5 entries:  color vs fox
        Map<String, Fox> foxMap = ...




    }
}
