package com.AirConditioner;

public class Main {

	public static void main(String[] args) {
		AirConditioner air1 = new AirConditioner(220,true,2);
		AirConditioner air2 = new AirConditioner(0,true,2);
		AirConditioner air3 = new AirConditioner(0,false,2);
		AirConditioner air4 = new AirConditioner(110,true,6);
		
		AirConditioner[] arr =  {air1,air2,air3,air4};
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Serial Number = " + arr[i].getSerialNumber());
			System.out.println("Current Tempriture = " + arr[i].temperature());
			System.out.println("Current Name = " + arr[i].getCurrentAirConditionerName());
		}
		
		

	}

}
