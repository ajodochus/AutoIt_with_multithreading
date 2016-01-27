import java.io.File;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class AutoItBuilder {
	AutoItX x;
	public AutoItBuilder() throws InterruptedException {
		String jacobDllVersionToUse;
		
		if (jvmBitVersion().contains("32")) {
			jacobDllVersionToUse = "jacob-1.18-x86.dll";
		} else {
			jacobDllVersionToUse = "jacob-1.18-x64.dll";
		}

		File file = new File("lib", jacobDllVersionToUse);
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

		AutoItX x = new AutoItX();
		
	

	}
	
	public AutoItX getAutoItX(){
		return x;
		
	}

	public static String jvmBitVersion() {
		return System.getProperty("sun.arch.data.model");
	}
}
