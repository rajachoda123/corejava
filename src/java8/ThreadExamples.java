package java8;

class ThreadExamples extends Thread {
	public void run() {
		System.out.println("thread is running...");
		for(int i =0;i<10;i++) {
			System.out.println("i is " + i+ currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		ThreadExamples t1 = new ThreadExamples();
		ThreadExamples t2 = new ThreadExamples();
		ThreadExamples t3 = new ThreadExamples();
		t1.start();
		t2.start();
		t3.start();
		
	}
}
