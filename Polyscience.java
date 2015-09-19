package com.creation.object;

public class Polyscience {
	
		String assembly; // 581,582,583,584,585
		String soldering;// lead free, with lead
		String testing;// powersupply, flukemeter, fixture,currentMeter,cr0
		String mechAssembly;//housing, screwes, design, tools,wires
		String shipping;// boxes, scan
		
		public Polyscience(String assembly,String soldering,String testing,String mechAssembly,String shipping){
			this.assembly();
			this.soldering();
			this.testing();
			this.mechAssembly();
			this.shipping();
	
		}
		public void polysience1(){
			assembly();soldering();testing();mechAssembly();shipping();
		}
		
	public void assembly(){
		System.out.println(" bulding the board ");
	}
	public void soldering(){
		System.out.println(" solder the board ");
	}
	public void testing(){
		System.out.println(" testing the board  ");
	}
	public void mechAssembly(){
		System.out.println(" make the mechAssembly of the board  ");
	}
	public void shipping(){
		System.out.println("  ship the board ");
	}
	
}
