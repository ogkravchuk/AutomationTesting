package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Test {
	public static void main(String[] args) throws IOException {
		Workbook wb = new HSSFWorkbook();
		Sheet sheet=wb.createSheet("mySheet");
		FileOutputStream fos = new FileOutputStream("my.xls");
		wb.write(fos);
		fos.close();
}
}
