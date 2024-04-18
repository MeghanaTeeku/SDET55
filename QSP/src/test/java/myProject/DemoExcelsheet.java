package myProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoExcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

//		FileInputStream fs = new FileInputStream("G:\\Test Yantra\\Book1.xlsx");
//		Workbook wb = WorkbookFactory.create(fs);
//		Sheet sh = wb.getSheet("Sheet1");
//		Row ro = sh.getRow(0);
//		Cell cel = ro.getCell(0);
//		String val = cel.getStringCellValue();
//		System.out.println(val);
		
		FileInputStream fs = new FileInputStream("G:\\Test Yantra\\Book1.xlsx");
		 Workbook wb = WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet("Sheet1");
		int rcount = sh.getLastRowNum();
		short celcount = sh.getRow(0).getLastCellNum();
		for(int i=0;i<=rcount;i++)
		{
			for(int j=0;j<celcount;j++)
			{
			String	val=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(val+" ");
				}
			System.out.println(" ");
		}
	}
}

