package PrimaAnualV3;

import static org.junit.Assert.*;

import org.junit.Test;



public class PRIMAv3Test {

	@Test
	public void testPrima1() {
		System.out.println("calcularPrima");
		int edad = 17;
		int puntos =29;
		float expResult = 0;
		float result=PRIMAv3.primaV3(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	@Test
	public void testPrima2() {
		System.out.println("calcularPrima");
		int edad = 20;
		int puntos =30;
		float expResult = 1350;
		float result=PRIMAv3.primaV3(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	public void testPrima3() {
		System.out.println("calcularPrima");
		int edad = 35;
		int puntos =-1;
		float expResult = 0;
		float result=PRIMAv3.primaV3(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	public void testPrima4() {
		System.out.println("calcularPrima");
		int edad = 25;
		int puntos =40;
		float expResult = 0;
		float result=PRIMAv3.primaV3(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	public void testPrima5() {
		System.out.println("calcularPrima");
		int edad = 40;
		int puntos =0;
		float expResult = 0;
		float result=PRIMAv3.primaV3(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	public void testPrima6() {
		System.out.println("calcularPrima");
		int edad = 70;
		int puntos =23;
		float expResult = 750;
		float result=PRIMAv3.primaV3(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}
	
	public void testPrima7() {
		System.out.println("calcularPrima");
		int edad = 98;
		int puntos =27;
		float expResult = 0;
		float result=PRIMAv3.primaV3(edad, puntos);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}


}
