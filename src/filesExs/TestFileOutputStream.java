package filesExs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\output.txt");
		FileOutputStream fos = new FileOutputStream(file);
		try {
			fos.write("krishns,28,1313".getBytes());
			fos.write("\r\n".getBytes());
			fos.write("where ae you?".getBytes());
		} catch (Exception ex) {

		} finally {
			fos.close();
		}
	}
}
