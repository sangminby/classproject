package hio.controller;

import java.util.Scanner;

import hio.HioMain;
import hio.domain.HioMember;
import service.HioMemberInsertService;

public class HioMemberInsertController implements HioMemberInsertInterface {

	HioMember hioMember = new HioMember();
	
	Scanner sc = new Scanner(System.in);
	public void memberInsert() {
		
		System.out.println("------------------------------------------------");
		System.out.println("-------------------- 회원가입 --------------------");
		System.out.print("회원 아이디 입력 >>");
		String memberId = sc.nextLine();
		System.out.print("회원 비밀번호 입력 >>");
		String memberPwd = sc.nextLine();
		System.out.print("회원 이름 입력 >>");
		String memberName = sc.nextLine();
		System.out.print("회원 주소 입력 >>");
		String memberAddress = sc.nextLine();
		System.out.print("회원 전화번호 입력 >>");
		String memberPhone = sc.nextLine();
		
		hioMember.setMemberId(memberId);
		hioMember.setMemberPwd(memberPwd);
		hioMember.setMemberName(memberName);
		hioMember.setMemberAddress(memberAddress);
		hioMember.setMemberPhone(memberPhone);
		
		int result = new HioMemberInsertService().memberInsert(hioMember);
		
		
		System.out.println(result);
	
	}
}
