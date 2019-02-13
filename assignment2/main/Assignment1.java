package com.ncu.assignment.main;
import java.util.*;
import com.ncu.assignment.validation.*;
import com.ncu.assignment.classes.*;
import com.ncu.assignment.exception.*;
public class Assignment1
{
	public static void main(String args[])
	{
		String firstName, lastName, eMail, contactNo, line1, line2, city, state;
		String qualName, institute, university, name, role;
		float cgpa;
		int i, j, k, l, m, n, b, c, a, pinCode, daydob, monthdob, yeardob, startday, startmonth, startyear, endday, endmonth, endyear;		
		
		Scanner S= new Scanner(System.in);

		System.out.println("Enter the number of students");
		n = S.nextInt();
		Student[] student = new Student[n];
		for (i= 0; i< n; i++)
		{

		System.out.println("Enter First Name");
		firstName = S.next();
		
		System.out.println("Enter Last Name");
		lastName = S.next();

		System.out.println("Enter Address");
		
		System.out.println("Enter line1");
		line1 = S.next();

		System.out.println("Enter line2");
		line2 = S.next();

		System.out.println("Enter city");
		city = S.next();

		System.out.println("Enter state");
		state = S.next();

		System.out.println("Enter pincode");
		pinCode = S.nextInt();		

		System.out.println("Enter Date of Birth");
		daydob = S.nextInt();
		monthdob = S.nextInt();
		yeardob = S.nextInt();		

		System.out.println("Enter number of Skills");
		a= S.nextInt();
		String[] sk = new String[a];
		for (m= 0; m< a; m++) 
		{
			System.out.println("Enter Skills");
			sk[m] = S.next();
		}

		System.out.println("Enter number of Qualifications");
		c= S.nextInt();
		Qualification[] ql = new Qualification[c];
		
		for (m= 0; m< c; m++) 
		{
			
			System.out.println("Enter details of Qualification" + (m+1));

			System.out.println("Enter qualification name");
			qualName = S.next();

			System.out.println("Enter university");
			university = S.next();

			System.out.println("Enter institute");
			institute = S.next();

			System.out.println("Enter cgpa");
			cgpa = S.nextFloat();
			
			ql[m]= new Qualification(qualName, university, institute, cgpa);

		}

		
			System.out.println("Enter number of projects");
			b = S.nextInt();

			Project[] pr = new Project[b];
			for(m= 0; m< b; m++)
			{
			
			System.out.println("Enter project name");
			name = S.next();

			System.out.println("Enter start date");
			startday = S.nextInt();
			startmonth = S.nextInt();
			startyear = S.nextInt();
			System.out.println("Enter end date");
			endday = S.nextInt();
			endmonth = S.nextInt();
			endyear = S.nextInt();
			System.out.println("Enter role");
			role = S.next();
			System.out.println("Enter number of responsibilities");
			l = S.nextInt();
			String[] resp = new String[l];
			System.out.println("Enter responsibilities");
for (j= 0; j< l; j++) 
				{
					resp[j] = S.next();
				}
				pr[m] = new Project(name, startday, startmonth, startyear, endday, endmonth, endyear, role, l);
				pr[m].setStart(startday, startmonth, startyear);
				pr[m].setEnd(endday, endmonth, endyear);
			}
System.out.println("Enter Email");
		eMail = S.next();

		System.out.println("Enter Contact Number");
		contactNo = S.next();

		student[i] = new Student(firstName, lastName, line1, line2, city, state, pinCode, daydob, monthdob, yeardob, eMail, contactNo, a, c, b);
		student[i].setProject(pr);
		student[i].setSkills(sk);
		student[i].setQual(ql);
		student[i].setDate1(daydob, monthdob, yeardob);
		student[i].setAddress(line1, line2, city, state, pinCode);
		student[i].displayDetails(b, c, a);

		}
	}
}	