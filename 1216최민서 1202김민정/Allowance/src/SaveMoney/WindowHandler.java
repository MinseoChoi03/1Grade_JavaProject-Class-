package SaveMoney;

import java.awt.event.WindowAdapter;//�����츮������ �޼ҵ���� �� ���·� ������ ���� ��
import java.awt.event.WindowEvent;//������ ��ü���� �߻��ϴ� �̺�Ʈ�� ����ڰ� �����츦 ���ų� �ݰų� ���� ������ ���� �� �߻�

public class WindowHandler extends WindowAdapter { //���������͸� ��ӹ޴� �������ڵ鷯 Ŭ����
    public void windowClosing(WindowEvent e) {//�ݴ� X��ư�� ������
    	System.exit(0);//�ý��� ����
    }//windowClosing(WindowEvent e)��
}//WindowHandler Ŭ���� ��