package com.java.compare.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonDemo {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Joe", 24.0, 5.6),
                new Person("Pete", 18.0, 5.7),
                new Person("Chris", 21.0, 5.3)
        );
        //sorts the specified list according to the order inducted by the comparator
        System.out.println("Sorting Person records based on name");
        Collections.sort(people, new LexicographicComparator());
        for(Person person: people)
        	System.out.println(person);
        
        System.out.println("");
        System.out.println("Sorting Person records based on Age");
        Collections.sort(people, new AgeComparator());
        for(Person person: people)
        	System.out.println(person);
        
        //Implementing the comparator in the same class 
        System.out.println("");
        System.out.println("Sorting Person records based on Height");
        Collections.sort(people, new Comparator<Person>(){
        	public int compare(Person p1, Person p2){
        		Double p1_Height = p1.getHeight();
        		Double p2_Height = p2.getHeight();
        		
        		//ascending order
        		return p1_Height.compareTo(p2_Height);
        		
        		//descending order
        		//return p2_Height.compareTo(p1_Height);
        	}
        });
        for(Person person: people)
        	System.out.println(person);
      
      //The above sort method can also be calledas shown below
      //List<Person> peopleList = sortByHeight(people);
    }
    
    private static List<Person> sortByHeight(List<Person> person){
    	Collections.sort(person, new Comparator<Person>(){
        	public int compare(Person p1, Person p2){
        		Double p1_Height = p1.getHeight();
        		Double p2_Height = p2.getHeight();
        		
        		//ascending order
        		return p1_Height.compareTo(p2_Height);
        		
        		//descending order
        		//return p2_Height.compareTo(p1_Height);
        	}
        });
    	return person;
    }
}