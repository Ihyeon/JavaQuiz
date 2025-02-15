package quiz09;

public class Computer {
	
	// 1
	private KeyBoard kb;
	private Mouse mu;
	private Monitor mt;
	
	// 2
	public Computer() {
		this.kb = new KeyBoard();
		this.mt = new Monitor();
		this.mu = new Mouse();
	}
	
	// 3
	public Computer(KeyBoard kb, Mouse mu, Monitor mt) {
		super();
		this.kb = kb;
		this.mu = mu;
		this.mt = mt;
	}

	// 4
	public void computerInfo() {
		kb.info();
		mt.info();
		mu.info();
	}
	
	
	// 5
	public KeyBoard getKb() {
		return kb;
	}

	public void setKb(KeyBoard kb) {
		this.kb = kb;
	}

	public Mouse getMu() {
		return mu;
	}

	public void setMu(Mouse mu) {
		this.mu = mu;
	}

	public Monitor getMt() {
		return mt;
	}

	public void setMt(Monitor mt) {
		this.mt = mt;
	}
	

	

	
	
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요

	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.

	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
		
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
