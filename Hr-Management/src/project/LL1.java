package project;

import java.util.*;


class LL1 {
	//private static final String ID = null;
	Scanner sc=new Scanner(System.in);
    Node head;                      // head pointer
	 static class Node
	{
		int EmpId;
		String Name;
		int DOJ;
		int Salary;
		String Desiganation;
		
		Node next;
		Node(int d,String s,int j,int p,String k)                 // define node
		{   Name=s;
			EmpId=d;
			DOJ=j;
			Salary=p;
			Desiganation=k;
			next=null;
		}
	}
	 /////////////////////////////////////////////////////////
	 void select() {
		 int choice;
		 do {
		 System.out.println("Select Your Choice:");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Print salary slip");
			System.out.println("5.Count total no of Employee");
			System.out.println("6.Exit");
			 choice=sc.nextInt();
			
			switch( choice) {
			case 1:
				InsertEmployee();
				break;
			case 2:
				DeleteEmployee();
				break;
			case 3:
				UpdateEmployee();
				break;
			case 4:
				PrintSalarySlip();
				break;
			case 5:
				count();
				break;
			case 6:
				System.out.println("Exit");
				System.exit(0);
		    default:
			System.out.println("Invalid Choice");
		    break;
			}
			System.out.println(" ");
		 }while(choice!=6);
		 
	 
			
		 
	 }
	//-------------------------------------------------------------Display---------------------------------------------------------------
	void display() 
	{
		Node n = head;
		while(n!= null) 
		{
			System.out.println(n.EmpId+ "  "+n.Name+"   "+n.DOJ+"  "+n.Salary+" "+n.Desiganation);
			n = n.next;
		} 
		System.out.println("========================================"); 
	}
	
	//--------------------------------------------------------------DELETE----------------------------------------------------------
	 void DeleteEmployee() 
	 {
		 System.out.println("========================================"); 
		 System.out.println("Enter Employee_ID you want to delete"); 
		 int key=sc.nextInt();
		Node temp = head , prev= null;
		if(temp.EmpId==key && temp!=null) // first node
		{
			head=temp.next;
			return;
		}
		 while(temp!=null && temp.EmpId!=key) // middle
		 {
			 prev=temp;
			 temp=temp.next;
		 }
		 if(temp==null) //last 
		 {return;}
		 System.out.println("Deleted Employee----->");
		 System.out.println(temp.EmpId+" "+temp.Name);
		 prev.next = temp.next;
		
		 System.out.println("========================================"); 
		 select();
	 }
	 
	 //-------------------------------------------------------------Insert---------------------------------------------------------------
	 void InsertEmployee(){
		 System.out.println("Enter Employee ID");
		 int ID=sc.nextInt();
		 System.out.println("Enter Employee name");
		 String name=sc.next();
		 System.out.println("Enter year of joining");
		 int year=sc.nextInt();
		 System.out.println("Enter salary of employee");
		 int salary=sc.nextInt();
		 System.out.println("Enter Employee Designation");
		 String da=sc.next();
	  Node new_node = new Node(ID,name,year,salary,da);            //creating new node
				Node n=head;                               
				while(n.next!=null) {                       
					n=n.next;
				}
				n.next=new_node;  
				System.out.println("=============================================");
			System.out.println("new Employee list");	
			display(); 
		 
	}
	//-------------------------------------------------------------Update---------------------------------------------------------------
	 int search() 
	  { System.out.println("========================================"); 
		 System.out.println("Enter Employee_ID you want to update"); 
		 int ID=sc.nextInt();
		 Node q = head;
	  int position =1;
	  while(q!= null) 
	  {
		  if(q.EmpId==ID)
		   return position;
		  position++;
		  q=q.next;
	  }
	   return 0;
	  }
	 void UpdateEmployee() 
	 {     int position;
		 position=search();
	    System.out.println("Add changes in salary");
	    
	    int new_salary=sc.nextInt();
		 Node q = head;
	 if(position != 0) 
	 {
		 for(int i=1;i<position;i++)
			 q= q.next;
		 q.Salary=new_salary;
		 
		 System.out.println(q.EmpId+" NO"+" Employee Salary is Succesfully updated "+ new_salary);
		 System.out.println("====================================================");
		 
		 display();
		
	 }
	
	 }
	 
	 
	 
	//-------------------------------------------------------------SalarySlip---------------------------------------------------------------
	void PrintSalarySlip() {
 		System.out.println("Enter Employee ID");
		int data=sc.nextInt();
		 Node current = head;  
	        int i = 1;  
	        boolean flag = false;
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            while(current != null) {   //Compares node to be found with each node present in the list  
	                if(current.EmpId == data) {  
	                    flag = true;  
	                    break;  
	                }  
	                i++;  
	                current = current.next;  
	            }  
	          
	        if(flag)  {
	        	 System.out.println("========================================================================================================================"); 
	        	System.out.println("Salary slip of "+current.Name);
	        	System.out.println();
	        	System.out.println("Employee ID"+"   Employee Name"+"    Date of joining"+"   salary"+"    Designation"); 
	             System.out.println(current.EmpId+ "              "+current.Name+"           "+current.DOJ+"             "+current.Salary+"      "+current.Desiganation); 
	             System.out.println("========================================================================================================================="); 
	             select();
	        }
	    } 
	}

	  
//----------------------------------------------------------------count-------------------------------------------------------------------
	
	 void count()
	 {
		 Node p=head;
		 int count =0;
		 while(p!=null) 
		 {
			 count++;
			 p=p.next;
		 }
		 System.out.println("============================================================");
		 System.out.println("Total no of Employee --------> "+count);
		 System.out.println("============================================================");
		 
		 
		 
	 }
	//-----------------------------------------------------------main------------------------------------------------------------- 
	public static void main(String[] args) 
	{
		LL1 l1 = new LL1();  // node & reference
		System.out.println("Employee List-->");
		l1.head = new Node(1,"Raju",2021,20000,"CEO");
		Node second = new Node(2,"SHITAL",2020,25000,"Java Developer");
		Node third = new Node(3,"RAKESH",2018,15000,"Sql Developer");
		Node forth = new Node(4,"Prajkta",2017,10000,"Tester");
		Node fifth = new Node(5,"Priyali",2022,28000,"Analyzer");
		l1.head.next = second;  // link establish
		second.next = third;
		third.next = forth;
		forth.next =fifth;
		l1.display();
		l1.select();
		//l1.search();
		//l1.UpdateEmployee();
		
		
	}

}