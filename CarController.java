public class CarController {
	Car model;
	CarView view;
	
	
	public CarController (Car model, CarView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setCarModel(String carModel) {
		model.setModel(carModel);
	}
	
	public void setCarChassis(String chassis){
		model.setChassis(chassis);
	}
	
	public String getCarModel() {
		return model.getModel();
	}
	
	public String getCarChassis() {
		return model.getChassis();
	}
	
	public void updateView(){
		view.printCarDetails(model.getModel(),model.getChassis());
	}
}