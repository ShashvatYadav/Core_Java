package com.Oops.Abstraction.Interface;

class SportCar implements Car {
	String brand;
	String model;
	boolean isEngineOn;
	int currentGear;
	int currentSpeed;
	
	SportCar(String model, String brand){
		this.brand = brand;
		this.model = model;
		isEngineOn = false;
		currentGear = 0;
		currentSpeed = 0;
	}
	@Override
	public void startEngine() {
		isEngineOn = true;
		System.out.println(model + " : Started with sound.....!");
		
	}

	@Override
	public void shiftGear(int gear) {
		if(isEngineOn) {
			currentGear = gear;
			System.out.println(model + " : Gear changed to  -> " + currentGear);
			return;
		}
		System.out.println("First start engine!");
		
	}

	@Override
	public void accelerate() {
		if(isEngineOn) {
			currentSpeed += 20;
			System.out.println(model + " : Speed changed to -> " + currentSpeed);
			return;
		}
		System.out.println("Start engine first");
	}

	@Override
	public void brake() {
		currentSpeed -= 20;
		if(currentSpeed<0) currentSpeed = 0;
		System.out.println(model + " : Speed decreased -> " + currentSpeed);
		
	}

	@Override
	public void stopEngine() {
		isEngineOn = false;
		currentSpeed = 0;
		currentGear = 0;
		System.out.println(model + " : Happy ride !");
		
	}
	
	public static void main(String[] args) {
		SportCar gt = new SportCar("Mustang", "Ford");
		gt.startEngine();
		gt.shiftGear(3);
		gt.accelerate();
		gt.accelerate();
		gt.accelerate();
		gt.accelerate();
		gt.brake();
		gt.stopEngine();
	}
	
}
