package pg68;

public class Multi {

	public void run() {
		System.out.println("thread is Running");
	}

	public static void main(String[] args) {
		Multi t1 = new Multi();
		t1.run();

	}

}
