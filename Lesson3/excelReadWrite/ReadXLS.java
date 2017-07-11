package excelReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadXLS {
	/*public void readXLS() throws IOException{
		Workbook wb = new HSSFWorkbook(new FileInputStream("D:/Учеба/read.xls"));
		double result = wb.getSheetAt(0).getRow(0).getCell(0).getNumericCellValue();
		System.out.println(result);
		}

		public static void main(String[] args) throws IOException{
ReadXLS One = new ReadXLS();
One.readXLS();
}*/
		public void readXLS() throws IOException{
			int x=0;

			Workbook wb = new HSSFWorkbook(new FileInputStream("D:/Учеба/read.xls"));
			System.out.println("Data for " +(x+1)+" test is:");
			while (x<5){

			/*double result = wb.getSheetAt(0).getRow(0).getCell(x).getNumericCellValue();
			System.out.println(result);*/
				System.out.println(wb.getSheetAt(0).getRow(x).getCell(0).getNumericCellValue());
			x=x+1;
			}
	}

	public static void main(String[] args) throws IOException{
	ReadXLS One = new ReadXLS();
	One.readXLS();
	}	
/*public static void main(String[] args) throws IOException{
	FileInputStream fis= new FileInputStream("D:/Учеба/read.xls");
	Workbook wb = new HSSFWorkbook(fis);
	String result = wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
	System.out.println(result);
	System.out.println(wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue());
	fis.close();
}*/
}
	