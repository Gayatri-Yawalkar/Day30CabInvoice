package com.bridgelabz.junit;
//Step1
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.cabinvoice.CabInvoiceGenerator;
public class CabInvoiceGeneratorTest {
	@Test
	public void givenDistanceAndTime_shouldReturnTotalFare() {
		CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
		double distance=2.0;
		int time=2;
		double fare=cabInvoiceGenerator.calculateFare(distance,time);
		assertEquals(22,fare,0.0);
	}
	@Test
	public void givenLessDistanceOrTime_shouldReturnMinFare() {
		CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
		double distance=0.1;
		int time=2;
		double fare=cabInvoiceGenerator.calculateFare(distance,time);
		assertEquals(5,fare,0.0);
	}
}
