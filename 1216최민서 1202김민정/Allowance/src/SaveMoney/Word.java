package SaveMoney;
//�Է��� ���� ����ϴ� �뵵�� ���� Ŭ����

public class Word {//Word Ŭ���� ����
    String date;//date ����
    String contents;// contents ����
    String income;//income ����
    String outlay;//outlay ����
    String valance;//valance ����
   
    public Word(String date, String contents, String income, String outlay, String valance) {//�����ڸ޼��� ����
    	this.date = date;//�ܺηκ��� ���޹��� date�� this.date�� ����
    	this.contents = contents;//�ܺηκ��� ���޹��� contentsfmf this.contents�� ����
    	this.income = income;//�ܺηκ��� ���޹��� income�� this.income�� ����
    	this.outlay = outlay;//�ܺηκ��� ���޹��� outlay�� this.outlay�� ����
    	this.valance = valance;//�ܺηκ��� ���޹��� valance�� this.valance�� ����
    }//�����ڸ޼����� �� 

    //getter&setter
    public String getDate() {//getDate ����
    	return date;//date ��ȯ
    }//end of getDate

    public void setDate(String date) {//setDate ����
    	this.date = date;//�ܺηκ��� ���޹��� date�� this.date�� ����
    }//end of setDate

    public String getContents() {//getContents ����
	return contents;//contents ��ȯ
    }//end of getContents

    public void setContents(String contents) {//setContents ����
    	this.contents = contents;//�ܺηκ��� ���޹��� contents�� this.contents�� ����
    }//end of setContents

    public String getIncome() {//getIncome �޼��� ����
    	return income;//income ��ȯ
    }//end of getIncome

    public void setIncome(String income) {//setIncome �޼��� ����
    	this.income = income;//�ܺηκ��� ���޹��� income�� this.contents�� ����
    }//end of setIncome

    public String getOutlay() {//getOutlay �޼��� ����
    	return outlay;//outlay ��ȯ
    }//end of getOutlay

    public void setOutlay(String outlay) {//setOutlay �޼��� ����
    	this.outlay = outlay;//�ܺηκ��� ���޹��� outlay�� this.outlay�� ����
    }//end of setOutlay

    public String getValance() {//getValance �޼��� ����
    	return valance;//valance ��ȯ
    }//end of getValance

    public void setValance(String valance) {//setValance �޼��� ����
    	this.valance = valance;//�ܺηκ��� ���޹��� valance�� this.valance�� ����
    }//end of setValance   
}//end of Word  