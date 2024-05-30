package com.tnsif.java.arrays;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring an array of student
		Student1[] studArray;
		//allocating memory for 5 students
		studArray = new Student1[5];
		
		studArray[0]=new Student1(1,"Rahul");
		studArray[1]=new Student1(2,"Ravi");
		studArray[2]=new Student1(3,"Ramya");
		studArray[3]=new Student1(4,"Rohith");
		studArray[4]=new Student1(5,"Ravin");
		
		//access these student data
		for(int i=0; i<studArray.length;i++) {
			System.out.println(studArray[i].getRollNo()+ " " +studArray[i].getName());
		}
	}

}