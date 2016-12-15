
public class Car extends Machine {
	
	String carName = "maschine type car";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public void wipeWindShild() {
		System.out.println("wiping wind shild");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("car sterted");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("car stopped");
		super.stop();
	}

	public void machineCarInfo(){
		System.out.println(name);
	}
	
	public void carInfo(){
		System.out.println(carName);
	}
	
	
}
