package dc_93_多线程_线程等待和唤醒;

public class Input implements Runnable {
	private Resource resource;

	public Input(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			synchronized (resource) {
				if (resource.flag) {
					try {
						resource.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (i % 2 == 0) {
					this.resource.name = "张三";
					this.resource.sex = "男";
				} else {
					this.resource.name = "lisi";
					this.resource.sex = "nv";
				}
				resource.flag = true;
				resource.notify();
				
			}
			i++;
		}
	}

}
