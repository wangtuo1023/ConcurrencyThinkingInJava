package section2.liftoff;

/**
 * 火箭发射 </br> Java编程思想（第4版）.第21章并发.第2节基本的线程机制.P655
 * 
 * @author WANGTUO-PC
 * @since 2016.04.10
 */
public class MainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LiftOff launch = new LiftOff();
		launch.run();
	}

}
