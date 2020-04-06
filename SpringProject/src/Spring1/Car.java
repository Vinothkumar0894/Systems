package Spring1;

public class Car {
	private String vehicle;
	private String car;
	private String engine;
public Car(String vehicle,String car,String engine) {
	super();
		this.vehicle=vehicle;
		this.car=car;
		this.engine=engine;
		}
	public String toString() {
		return vehicle+" "+car+" "+engine;
	}
	}



