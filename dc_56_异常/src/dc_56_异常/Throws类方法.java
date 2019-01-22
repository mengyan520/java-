package dc_56_异常;

public class Throws类方法 {

	public static void main(String[] args) {
		try {
			int[] p= null;
			if (p==null) {
				throw new NullPointerException("出现空指针异常了，请检查对象是否为null");
			}
		} catch (NullPointerException e) {
			String message = e.getMessage();
			System.out.println("message:"+message ); 
			
			String result = e.toString();
			System.out.println(result);	
			
			e.printStackTrace(); 
		}
	}

}
