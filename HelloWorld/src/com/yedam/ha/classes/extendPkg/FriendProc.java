package com.yedam.ha.classes.extendPkg;

import java.util.Scanner;

public class FriendProc {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	public Friend getFriend(String name) {
		Friend friend = null; //초기화
		for (Friend f : friends) {
			if (f != null && f.getName().equals(name)) {
				friend = f;

			}
		}
		return friend;
	}

	public void addFriend() { //입력
		// System.out.println("입력메뉴입니다.");
		// 1)대학친구 2)회사친구 3) 그외
		System.out.println("1.대학친구 2.회사친구 3.그외");
		int subMenu = scn.nextInt();
		scn.nextLine();
		System.out.println("이름입력");
		String name = scn.nextLine();
		System.out.println("번호입력");
		String phone = scn.nextLine();
		Friend friend = null; //초기화
		if (subMenu == 1) {
			System.out.println("학교입력");
			String univ = scn.nextLine();
			friend = new UnivFriend(name, phone, univ);
		} else if (subMenu == 2) {
			System.out.println("화사입력");
			String company = scn.nextLine();
			friend = new ComFriend(name, phone, company);
		} else if (subMenu == 3) {
			friend = new Friend(name, phone);
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	public void listFriend() {  
		// System.out.println("리스트메뉴입니다.");
		for (Friend friend : friends) { // Friend 클래스의 friend 만큼 돌아라
			if (friend != null)
				friend.showInfo();
		}
	}

	public void updateFriend() {
		// System.out.println("수정메뉴입니다.");
		System.out.println("찾을 이름 입력:");
		String name = scn.nextLine();
		Friend f = getFriend(name);
		if (f == null) {
			System.out.println("조회결과없음");
			// return; (둘중에 하나 사용하면 된다)
		} else {
			System.out.println("변경할 번호 입력:");
			String phone = scn.nextLine();
			f.setPhone(phone);
		}
	}

	public void delFriend() {
//		System.out.println("삭제메뉴입니다.");
		System.out.println("삭제 이름 입력:");
		String phone = scn.nextLine();
		boolean isExist = false;
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(phone)) {
				friends[i] = null;
				isExist = true;
			}

		}
		if (isExist) {
			System.out.println("삭제되었습니다");
		} else {
			System.out.println("해당 조건의 값이 없습니다.");
		}
	}

	public void exec() {
		while (true) {
			System.out.println("===============================");
			System.out.println("1.입력 2.리스트 3.수정 4.삭제 9.종료");
			System.out.println("===============================");
			System.out.println("선택>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				// 입력
				addFriend();
			} else if (menu == 2) {
				// 리스트
				listFriend();
			} else if (menu == 3) {
				updateFriend();
			} else if (menu == 4) {
				delFriend();
			} else if (menu == 9) {
				break;
			}

		}
		System.out.println("프로그램 종료");
	}
}
