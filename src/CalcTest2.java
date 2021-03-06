import java.io.File;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class CalcTest2 {

	public static boolean appFound = false;
	
	public CalcTest2() throws InterruptedException {
		String jacobDllVersionToUse;
		
		if (jvmBitVersion().contains("32")) {
			jacobDllVersionToUse = "jacob-1.18-x86.dll";
		} else {
			jacobDllVersionToUse = "jacob-1.18-x64.dll";
		}

		File file = new File("lib", jacobDllVersionToUse);
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

		AutoItX x = new AutoItX();
	
			if (x.winExists("Untitled - Notepad")) {
				System.out.println("found notepad");
				x.winClose("Untitled - Notepad");
				appFound = true;
			} else {
				System.out.println("notepad not found");
				Thread.sleep(1000);			
			}


		// x.run("calc.exe");
		// x.winWaitActive("Calculator");

	}

	public static String jvmBitVersion() {
		return System.getProperty("sun.arch.data.model");
	}
}
