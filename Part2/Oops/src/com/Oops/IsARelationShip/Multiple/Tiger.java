package com.Oops.IsARelationShip.Multiple;

interface Tiger {
	default void hunt() {
		System.out.println("Hunt like tiger ");
	}
	default void roar() {
		System.out.println("Roar like tiger");
	}
}
