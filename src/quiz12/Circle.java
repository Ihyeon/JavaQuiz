package quiz12;

public class Circle extends Shape {
	
	//원형은 생성될 때 도형이름과, 반지름의 길이를 받고 초기화합니다.
	private int radius;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	//getArea()는 원의 넓이를 계산하도록 오버라이딩 처리
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	
	//main에서 객체를 생성해서 확인하세요
	

	
}
