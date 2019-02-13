package com.ncu.assignment.classes;
public class Student
{
	String firstName;
	String lastName;
	String line1, line2, city, state;
	Address addrs;
	int pinCode;
	int daydob, monthdob, yeardob;
	Date dob;
	String[] skills;
	Qualification[] qual;
	Project[] projects;
	String eMail;
	String contactNo;
	int j;
	Student(String fname, String lname, String l1, String l2, String p, String st, int pinCd, int month, int day, int year,String em, String con, int a, int b, int c)
	{
	this.firstName = fname;
	this.lastName = lname;
	this.addrs = new Address(l1, l2, p, st, pinCd);
	this.dob = new Date(day, month, year);
	this.skills = new String[a];
	this.qual = new Qualification[c];
	this.projects = new Project[b];
	this.eMail = em;
	this.contactNo = con;
	}
	public void setDate1(int day, int month, int year)
	{
		this.daydob = day;
		this.monthdob = month;
		this.yeardob = year;
	}

	public String getDate1()
	{
		dob.setDate(daydob, monthdob, yeardob);
		return dob.displayDate();
	}


	public void setAddress(String l1, String l2, String c, String st, int pinCd )
	{
		this.line1 = l1;
		this.line2 = l2;
		this.city = c;
		this.state = st;
		this.pinCode = pinCd;
	}

	public Address getAddr()
	{
		System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);
		return addrs;
	}

	public void setSkills(String[] skl)
	{
		this.skills = skl;
	}

	public void getSkills(int a)
	{
		
		System.out.println(skills);
		
	}

	public void setQual(Qualification[] q)
	{
		qual = q;
	}
	
	public Qualification[] getQual()
	{

			return qual;			

	}

	public void setProject(Project[] prj)
	{
		projects = prj;
	}


	public Project[] getProject()
	{

			return projects;

	}

	public void displayDetails(int b, int c, int a)
	{
		int i;

		System.out.println("\nStudent Name: " + firstName + " " + lastName);
		System.out.println("Date of birth: " + dob.displayDate());
		System.out.println("Email: " + eMail);
		System.out.println("Contact Number: " + contactNo);		
		System.out.println("Address ");
		System.out.println(addrs.displayAddress());
		System.out.println("Skills: ");
		for(i= 0; i< a; i++)
		{
		System.out.println(skills[i]);
		}
		System.out.println("\nQualifications ");
		for(i= 0; i< c; i++)
		{
		System.out.println(qual[i].display_qualification());
		}
		System.out.println("Project Details: ");
		for(i= 0; i< b; i++)
		{
		System.out.println(projects[i].displayProjects());
		}
	}
}