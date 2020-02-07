//package com.yedam.ha.interfaces;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import com.yedam.ha.interfaces.model.Employees;
//
//public class ServiceProc {
//	List<Employees> list = new ArrayList<>();
//	Service service = new ServiceImpl();
//	Scanner scn = new Scanner(System.in);
//
//	// 한건 입력, 전체 조회, 한건조회, 수정
//	public void execute() {
//		System.out.println("===================");
//		System.out.println("1조회 2수정 3리스트 4삭제 5종료");
//		System.out.println("선택");
//		int menu = scn.nextInt();
//		if (menu == 1) {
//			System.out.println("id입력:");
//			System.out.println("firstName입력:");
//			String name = scn.nextLine();
//			Employees emp = new Employees();
//			emp.setEmployeeId(employeeId);
//			emp.setFirstName(firstName);
//			service.addMember(emp, list);
//
//		} else if (menu == 2) {
//			List<Employees> list = service.getMemberList(list);
//		} else if (menu == 3) {
//			service.getMember(memberId, list);
//		} else if (menu == 4) {
//			service.updateMember(emp, list);
//		} else if (menu == 5) {
//
//		}
//	}
//
//	public void execute
//	{
//		service.getMember(emp, list);
//		service.getMemberList(list);
//		service.getMember(memberId, list);
//
//	}
//
//}
//}

