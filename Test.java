public class Test {
	public static void main(String[] args) {
		
		//Create a car
		Car model = new Car();
		model.setModel("Trueno GT-Apex");
		model.setChassis("AE-86");
		
		//Create a view to print car model and chassis code to console
		CarView view = new CarView();
		CarController controller = new CarController(model,view);
		
		//Print model data
		controller.updateView();
		
		//Update model data and print
		controller.setCarModel("Levin GT-Apex");
		controller.updateView();
	}
}