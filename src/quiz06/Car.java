﻿package quiz06;

public class Car {
	
	String model;
	int speed;
	
	Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	Car(String model) {
		this(model, 0); // 생성자의 연결
	}
	
	// 1. model과 speend 전달받아서 저장하는 생성자를 만드세요.
	// 2. model만 전달받아서 model에 저장하는 생성자를 생성하세요
	// 3. 생성자를 하나로 연결하세요

	void accel(int speed) {
		
		if(this.speed >= 150) { // 그냥 speed를 사용하면 지역변수 speed가 되는 것
			System.out.println("속도를 올릴 수 없습니다");
		} else {
			this.speed = speed;
		}
		/*
		멤버변수 speed가 150 이상이라면 "속도를 올릴 수 없습니다" 를 출력
		그렇지 않으면 매개변수를 멤버변수에 저장하세요
		*/

	}
	
	void run() {
		
		for(int i = 0; i <= 200; i+=30) { // 0, 30, 60, 90, 120, 150, 180
			this.accel(i); // this를 붙여도 되고 빼도 됨
			System.out.println("현재속도: "  + this.speed);
		}
		/*	
		0-200 까지 30씩 증가하는 for문을 생성하고, 
		for문안에서 accel()를 호출하세요
		멤버변수 speed도 출력하세요
		*/		
	}
}







