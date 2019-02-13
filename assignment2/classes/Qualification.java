package com.ncu.assignment.classes;
public class Qualification
{
String qualName;
String university;
String institute;
float cgpa;
Qualification(String qual, String univ, String instt, float cgp)
{ 
this.qualName = qual;
this.university = univ;
this.institute = instt;
this.cgpa= cgp;
}
public String display_qualification()
{
System.out.println("Qualification Name: " + qualName + "\nUniversity Name: " + university + "\nInstitute Name: " + institute + "\nCGPA: " + cgpa);
return "";}
}
