package dc_64_FIleÎÄ¼ş¹ıÂËÆ÷;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		return pathname.getName().toLowerCase().endsWith("Test.java");
	}

}
