package com.bridgelabz.junit;
//Step 3
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.bridgelabz.cabinvoice.CabInvoiceGenerator;
import com.bridgelabz.cabinvoice.InvoiceSummary;
import com.bridgelabz.cabinvoice.Ride;
public class CabInvoiceGeneratorTest {
	CabInvoiceGenerator cabInvoiceGenerator;
	@Before
	public void setUp() throws Exception {
		cabInvoiceGenerator=new CabInvoiceGenerator();
	}
	@Test
	public void givenDistanceAndTime_shouldReturnTotalFare() {
		double distance=2.0;
		int time=2;
		double fare=cabInvoiceGenerator.calculateFare(distance,time);
		assertEquals(22,fare,0.0);
	}
	@Test
	public void givenLessDistanceOrTime_shouldReturnMinFare() {
		double distance=0.1;
		int time=2;
		double fare=cabInvoiceGenerator.calculateFare(distance,time);
		assertEquals(5,fare,0.0);
	}
	@Test
	public void givenMultipleRides_shouldReturnInvoiceSummary() {
		Ride[] rides= { new Ride(2.0,2), new Ride(0.1,2)};
		InvoiceSummary invoiceSummary=cabInvoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary=new InvoiceSummary(2,27);
		assertEquals(expectedInvoiceSummary,invoiceSummary);				
	}
}
