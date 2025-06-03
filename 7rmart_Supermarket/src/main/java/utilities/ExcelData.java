package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getstring(int a, int b, String sheet)throws IOException

	{
		f=new FileInputStream ("C:\\Users\\amal4\\eclipse-workspace\\7rmart_Supermarket\\src\\test\\resources\\TestLoginData.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow r;
		r=s.getRow(a);
		XSSFCell c;
		c=r.getCell(b);
		return c.getStringCellValue();
		}
	
	public static String getInteger(int a, int b, String sheet)throws IOException

	{
		f=new FileInputStream ("C:\\Users\\amal4\\eclipse-workspace\\7rmart_Supermarket\\src\\test\\resources\\TestLoginData.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow r;
		r=s.getRow(a);
		XSSFCell c;
		c=r.getCell(b);
		int e;
		e=(int) c.getNumericCellValue();
		return String.valueOf(e);
		}
}



