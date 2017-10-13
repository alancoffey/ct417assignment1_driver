package com.github.alancoffey;

import java.util.ArrayList;
import java.util.Iterator;

import org.joda.time.DateTime;

public class Driver {
	

	public static void main(String[] args) {
		//setting up course start and with joda
		DateTime courseStart = new DateTime(2014,9,4,9,0,0);	
		DateTime courseEnd = new DateTime(2018,5,5,16,0,0);
		
		//arraylists for students
		 ArrayList<Student> BCTstudents = new ArrayList<Student>();
	     ArrayList<Student> artStudents = new ArrayList<Student>();
	     //addings students 
	     
	     BCTstudents.add(new Student("Seamus Cribbon", 25, 14465478,new DateTime(1992,8,14,5,10)));
	     BCTstudents.add(new Student("Alan Coffey", 22, 14509053,new DateTime(1995,8,16,2,12)));
	     BCTstudents.add(new Student("Mary Walsh", 22, 14588278,new DateTime(1995,7,10,1,0)));
	     artStudents.add(new Student("Sarah McGettigan",20,16788489,new DateTime(1997,5,6,0,0)));
	     artStudents.add(new Student("Bill Dole",26,14488523,new DateTime(1991,4,12,0,0)));
	     //creating module arraylists
	     ArrayList<Module> modules_BCT = new ArrayList<Module>();
	     ArrayList<Module> modules_art = new ArrayList<Module>();
	     
	     //settings up modules 
	     Module graphics = new Module("Graphics and Image Processing", "CT404");	     
	     Module artHistory = new Module("Art History","AR410");
	     Module artPractical = new Module("Art Portfolio Creation", "AP401");
	     Module watercolour = new Module("Painting with Watercolour", "AR444");
	     Module fyp = new Module("Final Year Project", "CT413");
	     Module realTimeSys = new Module("Real Time Systems", "CT420");	     
	     modules_art.add(artHistory);
	     modules_art.add(artPractical);
	     modules_art.add(watercolour);
	     modules_BCT.add(fyp);
	     modules_BCT.add(realTimeSys);
	     modules_BCT.add(graphics);  
	     //setting up courses
	     CourseProgramme bscComp= new CourseProgramme("Computer Science and IT", modules_BCT,courseStart,courseEnd);
	     CourseProgramme arts= new CourseProgramme("Art History and Design", modules_art,courseStart,courseEnd);
	     ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
	     
	     courses.add(arts);
	     for(Student student : artStudents){
	    		student.addStutoCourse(arts);
	    	}
	     courses.add(bscComp);
	     for(Student student : BCTstudents){
	    		student.addStutoCourse(bscComp);
	    	}
	     //printing to console 
	     	for (Student x: BCTstudents){
	     		System.out.println("\nName: " + x.getName() +" - Registered to - "+ bscComp.getName());
	     		System.out.println("Modules: " );	
	     		for(Module y:modules_BCT){
	     				System.out.println(y.getName());
	     			}
	    	}
	   	    for (Student s: artStudents){
	   	    	System.out.println("\nName: " + s.getName() +" - Registered to - "+ arts.getName());
	   	    	for(Module z:modules_art){
	   	    		System.out.println("Modules: " + z.getName());
	   	    	}
	   
	   	    }
	}
}
	



