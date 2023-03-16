package Nov08LabExam;

import java.util.Scanner;

class Student{
	int rollNo;
	String name;
	String course;
	double marks;
	public Student(int rollNo, String name, String course, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public void display() {
		System.out.print("Student RollNo: "+rollNo+" Name: "+name+" Course: "+course+" Marks: "+marks);
		System.out.println();

	}
	public void result() {
		if(marks>=50) {
			System.out.println("Student "+name+" is Passed");
		}else {
			System.out.println("Student "+name+" is Failed");
		}
	}
	
	
}
public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Students:");
		int size=sc.nextInt();
		Student ar[]= new Student[size];
		for(int i=0;i<ar.length;i++) {
				System.out.println("Enter Student Roll No :");
				int rollNo =sc.nextInt();
				System.out.println("Enter Student Name :");
				String name =sc.next();
				System.out.println("Enter Student Course :");
				String course =sc.next();
				System.out.println("Enter Student Marks :");
				double marks =sc.nextDouble();
				ar[i] = new Student(rollNo,name,course,marks);
		}
		
		for(Student a:ar) {
			a.display();
		}
		System.out.println("Student Result :");
		for(Student b:ar) {
			b.result();
		}
		int passCount=0;
		int failCount=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i].marks>=50) {
				passCount++;
			}else {
				failCount++;
			}
			
		}
		System.out.println("Number of Student Passed :"+passCount);
		System.out.println("Number of Student Passed :"+failCount);
	}

}	



