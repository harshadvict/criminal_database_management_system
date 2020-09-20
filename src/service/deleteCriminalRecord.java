package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class deleteCriminalRecord extends abstractDeleteRecord{

	@Override
	public void deleteTheRecord(int id) {
		System.out.println("inside the function");
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		
		for(Row row:sheet) {
			if(row.getRowNum()>0) {
			if(row.getCell(0).getNumericCellValue()==id)
			{
				sheet.removeRow(row);
				/*
				 * int rowIndex = row.getRowNum(); int lastRowNum = sheet.getLastRowNum();
				 * sheet.shiftRows(rowIndex-1,lastRowNum, -1); return;
				 */
			}
		}
		}
	fis.close();
	FileOutputStream fileout = new FileOutputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
	wb.write(fileout);
	fileout.close();
} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
}

}
