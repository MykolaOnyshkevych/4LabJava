package ua.lviv.iot.gym.model;

public class AbstractExerciseMachine {
	private double pricePerHour;
	private double durationInMinutes;
	private String producingCountry;

	public AbstractExerciseMachine() {
	}
	public AbstractExerciseMachine(double pricePerHour, double durationInMinutes, String producingCountry,
			String model) {
		this.pricePerHour = pricePerHour;
		this.durationInMinutes = durationInMinutes;
		this.producingCountry = producingCountry;
		this.model = model;
	}
	public double getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	public double getDurationInMinutes() {
		return durationInMinutes;
	}
	public void setDurationInMinutes(double durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	public String getProducingCountry() {
		return producingCountry;
	}
	public void setProducingCountry(String producingCountry) {
		this.producingCountry = producingCountry;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	private String model;

}
