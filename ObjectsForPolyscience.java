package com.creation.object;

public class ObjectsForPolyscience {

	public static void main(String[] args) {
assembly();
soldering();
testing();
mechAssembly();
shipping();
	}

	public static void assembly(){
		
		Polyscience polyscince = new Polyscience("581", "lead free", "powersupply" ,"housing","boxes");
		polyscince.polysience1();
	}
	public static void soldering(){
		Polyscience polyscince = new Polyscience("582", "with free", "flukemeter" ,"screwes","boxes");
		polyscince.polysience1();
	}
	
	public static void testing(){
		Polyscience polyscince = new Polyscience("583", "lead free", "fixture" ,"design","boxes");
		polyscince.polysience1();
	}
	public static void mechAssembly(){
		Polyscience polyscince = new Polyscience("584", "lead free", "currentMeter" ,"tools","boxes");
		polyscince.polysience1();
	}
	public static void shipping(){
		Polyscience polyscince = new Polyscience("585", "lead free", "cro" ,"wires","boxes");
		polyscince.polysience1();
	}
	
}
		
		