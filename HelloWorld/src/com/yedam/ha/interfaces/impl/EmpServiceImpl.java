package com.yedam.ha.interfaces.impl;

import com.yedam.ha.interfaces.model.EmpService;
import com.yedam.ha.interfaces.model.Employee;

public class EmpServiceImpl implements EmpService { //implements 인터페이스를 구현하기 위해서 사용

	@Override
	public void addEmp(Employee emp, Employee[] emps) {
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

}
