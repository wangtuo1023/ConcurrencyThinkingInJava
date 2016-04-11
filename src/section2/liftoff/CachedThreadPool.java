package section2.liftoff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 火箭发射，通过ExecutorService中的CachedThreadPool管理Thread </br>
 * Java编程思想（第4版）.第21章并发.第2节基本的线程机制.P656
 * 
 * @author WANGTUO-PC
 * @since 2016.04.10
 */
public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}
