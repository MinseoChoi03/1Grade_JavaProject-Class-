package SaveMoney;
//입력한 값을 기억하는 용도로 만든 클래스

public class Word {//Word 클래스 선언
    String date;//date 선언
    String contents;// contents 선언
    String income;//income 선언
    String outlay;//outlay 선언
    String valance;//valance 선언
   
    public Word(String date, String contents, String income, String outlay, String valance) {//생성자메서드 선언
    	this.date = date;//외부로부터 전달받은 date를 this.date에 넣음
    	this.contents = contents;//외부로부터 전달받은 contentsfmf this.contents에 넣음
    	this.income = income;//외부로부터 전달받은 income을 this.income에 넣음
    	this.outlay = outlay;//외부로부터 전달받은 outlay를 this.outlay에 넣음
    	this.valance = valance;//외부로부터 전달받은 valance를 this.valance에 넣음
    }//생성자메서드의 끝 

    //getter&setter
    public String getDate() {//getDate 선언
    	return date;//date 반환
    }//end of getDate

    public void setDate(String date) {//setDate 선언
    	this.date = date;//외부로부터 전달받은 date를 this.date에 넣음
    }//end of setDate

    public String getContents() {//getContents 선언
	return contents;//contents 반환
    }//end of getContents

    public void setContents(String contents) {//setContents 선언
    	this.contents = contents;//외부로부터 전달받은 contents를 this.contents에 넣음
    }//end of setContents

    public String getIncome() {//getIncome 메서드 선언
    	return income;//income 반환
    }//end of getIncome

    public void setIncome(String income) {//setIncome 메서드 선언
    	this.income = income;//외부로부터 전달받은 income을 this.contents에 넣음
    }//end of setIncome

    public String getOutlay() {//getOutlay 메서드 선언
    	return outlay;//outlay 반환
    }//end of getOutlay

    public void setOutlay(String outlay) {//setOutlay 메서드 선언
    	this.outlay = outlay;//외부로부터 전달받은 outlay를 this.outlay에 넣음
    }//end of setOutlay

    public String getValance() {//getValance 메서드 선언
    	return valance;//valance 반환
    }//end of getValance

    public void setValance(String valance) {//setValance 메서드 선언
    	this.valance = valance;//외부로부터 전달받은 valance를 this.valance에 넣음
    }//end of setValance   
}//end of Word  