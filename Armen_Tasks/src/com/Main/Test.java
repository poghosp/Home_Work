package com.Main;


import com.packagetwo.Example; 
import com.packageone.Example; 

public class Test {

	public static void main(String[] args) {
		
		Example exm1 = new Example();
		exm1.getPkgName();
		
//		com.packageone.Example exm1 = new com.packageone.Example();
//		com.packagetwo.Example exm2 = new com.packagetwo.Example();

	}

}

/*  Result:   packagetwo
 * Correct run: Packages which are imported first only that is used. So in our case used Example class from packagetwo
 * Note: With notification  "The import com.packageone.Example collides with another import statement"
 * 
 * Without any exception
 */

