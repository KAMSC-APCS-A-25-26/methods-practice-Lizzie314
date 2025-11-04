import java.util.Scanner;

public class TripPlanner
{
    public static void main(String[] args)
    {
        double distance, averageSpeed, fuelEfficiency, pricePerGallon;
        Scanner sc = new Scanner(System.in);
        // TODO: Get user input for trip details
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallon
        System.out.println("Enter trip distance (miles): ");
        distance = sc.nextDouble();
        System.out.println("Enter average speed (mph): ");
        averageSpeed = sc.nextDouble();
        System.out.println("Enter fuel efficiency (miles per gallon): ");
        fuelEfficiency = sc.nextDouble();
        System.out.println("Enter fuel price per gallon ($): ");
        pricePerGallon = sc.nextDouble();
        System.out.println("Results: ");
        displayResults(calculateTravelTime(distance, averageSpeed), calculateFuelNeeded(distance, fuelEfficiency), calculateTripCost(distance, fuelEfficiency, pricePerGallon));

        // TODO: Calculate travel time using a return method
        
        // TODO: Calculate fuel needed using a return method
        
        // TODO: Calculate trip cost using a return method
        
        // TODO: Display results using a void method
        
    }
    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double distance, double averageSpeed)
    {
        double time = distance / averageSpeed;
        return time;
    }
    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(double distance, double fuelEfficiency)
    {
        double fuel = distance / fuelEfficiency;
        return fuel;
    }
    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double distance, double fuelEfficiency, double pricePerGallon)
    {
        double cost = distance / fuelEfficiency * pricePerGallon;
        return cost;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double time, double fuel, double cost)
    {
        System.out.print("Travel Time: ");
        System.out.printf("%.2f",time);
        System.out.println(" hours");
        System.out.print("Fuel Needed: ");
        System.out.printf("%.2f",fuel);
        System.out.println(" gallons");
        System.out.print("Trip Cost: $");
        System.out.printf("%.2f",cost);   
    }
}
