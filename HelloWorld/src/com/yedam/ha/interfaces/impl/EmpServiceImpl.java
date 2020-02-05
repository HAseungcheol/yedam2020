package com.yedam.ha.interfaces.impl;

import com.yedam.ha.interfaces.model.EmpService;
import com.yedam.ha.interfaces.model.Employee;
import com.yedam.ha.interfaces.model.Employees;

public class EmpServiceImpl implements EmpService { //implements 인터페이스를 구현하기 위해서 사용

	@Override
	public void addEmp(Employee emp, Employee[] emps) {  //저장하는 방법이 없어서 배열사용 값을 배열안에 넣음
//		System.out.println("추가능");
		for(int i=0; i<emps.length; i++) {
			if(emps[i]==null) {
				emps[i]=emp;
				break;
			}
		}
		System.out.println("입력완료");
		
	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
		//	System.out.println("조회기능");
		
		for(Employee emp : emps) {
			if(emp!=null && emp.getEmpNo()==empNo) {
				System.out.println(emp);
			}
		}
		
	}

	@Override
	public void empList(Employee[] emps) {
		for(Employee emp : emps) {
			if(emp !=null) {
				System.out.println(emp);
			}
		}
		System.out.println("리스트기능");
		
	}

	@Override
	public void delEmp(int empNo, Employee[] emps) {
		//System.out.println("삭제기능");
		for(int i=0; i<emps.length; i++) {
			if(emps[i]!=null && emps[i].getEmpNo()== empNo) {
				emps[i]=null;
			}
		}
		System.out.println("삭제완료.");
	}

	@Override
	public void searchEmployees() {
		System.out.println("디비조회.");
		EmpDAO dao = new EmpDAO();
		Employees[] empArray =dao.getEmployees();
		for (Employees emp : empArray) {
			if(emp != null) {
				System.out.println(emp);
			}
		}
	}// end of serarch

	@Override
	public void insertEmployees(Employees emp) {
		System.out.println("디비 입력 가능.");
		EmpDAO dao= new EmpDAO();
		dao.insertEmployees(emp);
		
	}// end of insertEmployees

}
