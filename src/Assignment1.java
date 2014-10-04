
public class Assignment1 {
	public static void main(String[] args) {     // main method 
		long startingDistance = 406547;  // Declare a constant variable starting distance by Kilometers.
		int KmtoCM = 100000;            // Declare a constant variable-transfer coefficient from kilometers to centimeters.
		startingDistance = startingDistance*KmtoCM;  // calculation of unit transform.
		int yearOfInterest = 1841;      //declare a constant variable year i chosen.
		int startingyear =2014;
		int yeardifference = yearOfInterest-startingyear; // declare a variable year difference.
				double lunarDrift = 3.8;   //declare a constant variable coefficient of lunar drift.
				long resultingDistance = (long) (startingDistance+(lunarDrift*yeardifference));
				double difference = lunarDrift*yeardifference; // calculate differences of distance.
				int cmtometer = 100;  // Declare a transfer coefficient from centimeters to meters.
				System.out.println("Hello. Welcome to lunar drift calculator!");
				System.out.println("Distance of earth to moon in year 2014 is" + startingDistance/cmtometer +"meters.");
				System.out.println("Distance of earth to moon in year"+ yearOfInterest + "was" + resultingDistance/cmtometer + "meters.");
				System.out.println("History: In 1502 when the Italian navigator Amerigo Vespucci recognized the South American continent.");
				System.out.println("Difference between moon in year 2014  and year" + yearOfInterest + "is" + difference/cmtometer + "meters.");
				System.out.println("Done!");
	}
	


}
