package deloitte.demo.day05.inherit;

public class SmartPhone extends FeaturePhone {

	public void camera() {
		System.out.println("Clicking pics...");
	}

	@Override
	public void music() {
		System.out.println("Playing DOLBY music...");
	}

}
