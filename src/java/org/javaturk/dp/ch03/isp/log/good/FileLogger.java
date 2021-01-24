package org.javaturk.dp.ch03.isp.log.good;

import java.io.File;

public interface FileLogger extends Logger {
	
	void openFile(File file, boolean create);

	void closeFile();
}
