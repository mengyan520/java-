package dc_57_自定义异常;
/*
 * Exception或继承RuntimeException
 * */
public class FuShuException extends RuntimeException {

	public FuShuException() {
		super();
	}

	public FuShuException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FuShuException(String message, Throwable cause) {
		super(message, cause);
	}

	public FuShuException(String message) {
		super(message);
	}

	public FuShuException(Throwable cause) {
		super(cause);
	}
	
}
