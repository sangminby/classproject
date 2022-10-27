package hio.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import hio.domain.HioMember;
import service.HioMemberDeleteService;

public class HioMemberDeleteController implements HioMemberDeleteInterface {

	Scanner sc = new Scanner(System.in);

	@Override
	public void memberDeletet() {

		List<HioMember> allList = new HioMemberDeleteService().memberSelectToDelete();

		System.out.println("== 회원 삭제를 진행합니다. ==");
		System.out.println("===== 현재 회원 리스트 =====");

		int[] searchIndex = new int[0];
		
		if (allList != null && !allList.isEmpty()) {

			for (int i=0; i<allList.size(); i++) {
				System.out.print(allList.get(i).getMemberNo() + " | " +allList.get(i).getMemberName() + " | " + allList.get(i).getMemberPhone());
			
				searchIndex[i] = i;
			
			}
			//for (HioMember h : allList) {
			//	System.out.println(h);
			//}
		}

		System.out.println("----------------------------");

		while (true) {
			System.out.println("위 리스트에서 삭제할 회원 이름을 입력해주세요. >> ");
			String delName = sc.nextLine().trim();

			for (int i=0; i<allList.size(); i++) {

				if (allList.get(i).getMemberName()==delName) {

					int result = new HioMemberDeleteService().memberDelete(delName);

					if (result > 0) {
						System.out.println("회원 삭제 완료!");
						break;
					} else {
						System.out.println("회원 삭제 실패!");
					}

				} else {
					System.out.println("입력하신 회원이 존재하지 않습니다.");
					break;
				}
			}
		}

	}
}
