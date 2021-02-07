package com.onurdesk.loop.program;

enum Colour {
	Black, White, Red, Green, Yellow, Grey
}

public class EnumExample {

	public static void main(String[] args) {

		Colour colour;

		colour = Colour.Black;

		System.out.println("Selected " + colour + " Colour");

		colour = Colour.Yellow;

		System.out.println("Selected " + colour + " Colour");
	}

}