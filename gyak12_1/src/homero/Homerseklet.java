package homero;

public class Homerseklet {
	
	private double temperature;
	private Mertekegyseg meter;
	
	public Homerseklet(double temperature, Mertekegyseg meter) {
		super();
		this.temperature = temperature;
		this.meter = meter;
	}

	public Homerseklet(double temperature) {
		this(temperature, Mertekegyseg.CELSIUS);
	}

	@Override
	public String toString() {
		return "Homerseklet [temperature=" + temperature + ", meter=" + meter + "]";
	}
	
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public Mertekegyseg getMeter() {
		return meter;
	}

	public void setMeter(Mertekegyseg meter) {
		this.meter = meter;
	}
	
	public static Homerseklet konvHomerseklet(Homerseklet ho, Mertekegyseg target) {
		if (ho.getMeter() == target) {
			return new Homerseklet(ho.getTemperature(), target);
		} else if (ho.getMeter() == Mertekegyseg.CELSIUS && target == Mertekegyseg.KELVIN) {
			return new Homerseklet(ho.getTemperature() + 273.15, target);
		} else {
			return new Homerseklet(ho.getTemperature() - 273.15, target);
		}
	}

}
