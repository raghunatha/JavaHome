package com.java.polymorphism;

class Box1 {
	int w, h;

	void info() {
		System.out.println("This is a simple box");
		System.out.println("width = " + w + " hieght " + h);
	}
}

class WoddenBox1 extends Box1 {
	int life;

	void info() {
		System.out.println("This is a Wodden box");
	}
}

class SteelBox1 extends Box1 {
	int wg;

	void info() {
		System.out.println("This is a steel box");
	}
}

class LargeWoddenBox1 extends WoddenBox1 {
	void info() {
		System.out.println("This is a Huge Wodden box");
	}
}

class BoxDemo1 {
	public static void main(String arg[]) {
		Box1 b[] = new Box1[5];
		b[1] = new Box1();
		b[2] = new WoddenBox1();
		b[3] = new SteelBox1();
		b[4] = new LargeWoddenBox1();
		for (int i = 1; i < 5; i++)
			b[i].info();
	}
}
