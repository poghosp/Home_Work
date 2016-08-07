package com.AirConditioner;

abstract class Conditioner {
	abstract protected int temperature (); 
}	
	
class AirConditioner extends Conditioner {
	 private static String seriNum = "Ap7CHIN_";
	 private static int currentAirCon;
	 private int sourcevoltage;
	 private int tempvalue;
	 private boolean onoff = true;
	 
	AirConditioner (int sourcevoltage, boolean onoff, int tempvalue) {
		 setSourceVoltage(sourcevoltage);
		 setSweeptemp(tempvalue);
		 currentAirCon+=1;
	 }
	
	 protected int temperature () {
		 return this.tempvalue*10;
	 }
	
	 public int getSweeptemp() {
		return tempvalue;
	}

	public void setSweeptemp(int tempvalue) {
		if (this.onoff == false)
			return;
		if (tempvalue < 1)
			this.tempvalue = 1;
		else if (tempvalue > 5)
			this.tempvalue = 1;
		else 
			this.tempvalue = tempvalue;
	}

	public int getSourceVoltage() {
		return sourcevoltage;
	}
	
	public void setSourceVoltage(int sourcevoltage) {
		if (sourcevoltage == 0) {
			this.onoff = false;
		} else if (sourcevoltage != 220) {
			this.sourcevoltage = 220;
		} else {
			this.sourcevoltage = sourcevoltage;
		}
	}

	public String getCurrentAirConditionerName () {
		String Num = String.valueOf(currentAirCon);
		String name = seriNum + Num;
		
		return name;
	}

	
	public String getAirCondState () {
		if (this.onoff == true)
			return "On State";
		else 
			return "Off State";
	}

	public String getSerialNumber () {
		return seriNum;
	}
}


