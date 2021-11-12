package com.bridgelabz.cabinvoice;
//Step 3
public class CabInvoiceGenerator {
	public static final int MINIMUM_COST_PER_KM=10;
	public static final int COST_PER_TIME=1;
	public static final int MINIMUM_FARE=5;
	public double calculateFare(double distance, int time) {
		double totalFare=distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
		return Math.max(totalFare, MINIMUM_FARE);
	}
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare=0;
		for(Ride ride:rides) {
			totalFare+=this.calculateFare(ride.distance,ride.time);
		}
		return new InvoiceSummary(rides.length,totalFare);
	}
}
