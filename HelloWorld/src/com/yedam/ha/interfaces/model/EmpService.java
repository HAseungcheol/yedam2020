package com.yedam.ha.interfaces.model;

import java.util.List;

public interface EmpService {
	//저장기능
	public void addEmp(Employee emp, Employee[] emps);
	//조회기능 
	public void searchEmp(int empNo, Employee[] emps);
	
	//전체 리스트
	public void empList(Employee[] emps);
	
	//삭제
	public void delEmp(int empNo, Employee[] emps);
	
	//디비 연결 조회 가능
	public void searchEmployees();
	
	//디비 입력 기능
	public void insertEmployees(Employees emp);  //추상메소드
	
	//collection 디비처리
	//1.전체데이터 조회 2.한건조회   
	public List<Employees> getDBEmployees();
	
	public Employees getDBEmployee(int empId);
	//3.입력
	public void insertDBEmp(Employees emp);
	//4.수정(update)
	public void updateDBEmp(Employees emp);
	
	//5.삭제
	public void deleteDBEmp(Employees emp);
	
	

}
