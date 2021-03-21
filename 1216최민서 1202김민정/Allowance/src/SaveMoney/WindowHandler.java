package SaveMoney;

import java.awt.event.WindowAdapter;//윈도우리스너의 메소드들을 빈 상태로 구현해 놓은 것
import java.awt.event.WindowEvent;//윈도우 객체에서 발생하는 이벤트로 사용자가 원도우를 열거나 닫거나 등의 동작을 취할 때 발생

public class WindowHandler extends WindowAdapter { //윈도우어댑터를 상속받는 윈도우핸들러 클래스
    public void windowClosing(WindowEvent e) {//닫는 X버튼을 누르면
    	System.exit(0);//시스템 종료
    }//windowClosing(WindowEvent e)끝
}//WindowHandler 클래스 끝