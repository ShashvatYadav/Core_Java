package com.Oops.IsARelationShip.Multiple;

public class Liger implements Lion, Tiger {
	void size() {
		System.out.println("Bigger than tiger and lion");
	}
	@Override
	public void roar() {
		// TODO Auto-generated method stub
		Tiger.super.roar();
	}
	public static void main(String[] args) {
		Lion lg = new Liger();
		lg.roar();
	}
}
