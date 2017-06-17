package vehicles;

public class Vehicle {
	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	
	private String ChassisNo;
	private String model;
	
	//Constructor
	public Vehicle(String model) {
		numVehicles += 1;
		ChassisNo = "ch" + numVehicles;
		this.model = model;
		System.out.println("Vehicle manufactured");
	}
	
	// Nested static class
	public static class Engine extends Vehicle {
		private static final String MAKE="redicter";
		private static final int CAPACITY=1600;
		
		//constructor
		public Engine(String model) {
			super(model);
		}
		
		public static String getMake() {
			return MAKE;
		}
		
		public static int getCapacity() {
			return CAPACITY;
		}
	}
	
	//getter
	public String getChassisNo() {
		return ChassisNo;
	}
	public String getModel(){
		return model;
	}
	
	//setter
	public void setChassisNo(String cNo){
		ChassisNo = cNo;
	}
	public void setModel(String model){
		this.model = model;
	}
	
	public void setMake(String make){
		this.MAKE = make;
	}
	
	//toString
	public String toString(){
		return "The vehicle is manufactured by: " + Vehicle.MAKE + "\n" + 
				"The chassis number is: "+ this.ChassisNo + "\n" + 
				"The model type: "+ this.model + "\n" +
				"The engine make: " + Engine.getMake() + "\n" +
				"The engine capacity: " + Engine.getCapacity() +"cc";
	}

}
