package dc_93_多线程_线程等待和唤醒;

public class Output implements Runnable {
	private Resource resource;

	public Output(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (resource) {
				if (!resource.flag) {
					try {
						resource.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(this.resource.name + "..." + this.resource.sex);
				resource.flag = false;
				resource.notify();
			}
		}
	}
}
