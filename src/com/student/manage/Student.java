package com.student.manage;

public class Student 
{
	private int studenID;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	
		//Constructors
	
	public Student(int studenID, String studentName, String studentPhone, String studentCity) 
	{
		super();
		this.studenID = studenID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student(String studentName, String studentPhone, String studentCity) 
	{
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
		//END OF THE Constructors
	
		//getters & setters	

	public int getStudenID() {
		return studenID;
	}

	public void setStudenID(int studenID) {
		this.studenID = studenID;
	}

	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	
	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

		//END of getters & setters
	
	@Override
	public String toString() {
		return "Student [studenID=" + studenID + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
	
}
