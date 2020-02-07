package com.yedam.ha;

public class Student {

	private	String name;
	private int eng;
	private int mat;
	private	int studentId;

	public Student(String name, int eng, int mat, int studentId) {
		super();
		this.name = name;
		this.eng = eng;
		this.mat = mat;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", eng=" + eng + ", mat=" + mat + ", studentId=" + studentId + "]";
	}

	public void showInfo() {
		System.out.println("이름:" +getName());
		
	}
}
	

