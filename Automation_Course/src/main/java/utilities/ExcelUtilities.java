package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String Getstring(int a, int b, String sheet)throws IOException

	{
		f=new FileInputStream ("C:\\Users\\amal4\\git\\repo1\\Automation_Course\\src\\test\\resources\\Test Data.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow r;
		r=s.getRow(a);
		XSSFCell c;
		c=r.getCell(b);
		return c.getStringCellValue();
		}
	
	public static String GetInteger(int a, int b, String sheet)throws IOException

	{
		f=new FileInputStream ("C:\\Users\\amal4\\git\\repo1\\Automation_Course\\src\\test\\resources\\Test Data.xlsx");
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


