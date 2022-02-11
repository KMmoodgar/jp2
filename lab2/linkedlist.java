package classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist
{
	public static void main(String[] args)
	{
		LinkedList<Student> array = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.ADD\n2.REMOVE\n3.DISPLAY\n4.SIZE\n5.ISEMPTY\n6.EXIT");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter student usn :");
				String usn = sc.next();
				System.out.println("Enter student name :");
				String name = sc.next();
				System.out.println("Enter student course : ");
				String course = sc.next();
				Student s = new Student(usn,name,course);
				array.addFirst(s);
				
				break;
			case 2:
				 System.out.println("Enter the index numebr to delete :");
				 int index = sc.nextInt();
				 if(index < array.size())
				 {
					 array.remove(index);
				 }
				 else
				 {
					 System.out.println("Array index out of bound");
				 }
				 break;
			case 3:
				for(Student stud: array)
				{
					System.out.println(stud.name);
				}
				break;
			case 4:
				System.out.println(array.size());
				break;
			case 5:
				System.out.println(array.isEmpty());
				break;
			case 6:
				System.exit(0);
				break;
				
			}
		}
	}
}
