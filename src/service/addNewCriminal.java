package service;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.criminalPerson;
public class addNewCriminal extends adstractAddNewCriminal {
	FileOutputStream fileout;
	@Override
	public
	boolean addCriminal(criminalPerson obj) {
		
	if(fileout!=null) {
			
		System.out.println("doing if part");
		
		HSSFWorkbook workbook =new HSSFWorkbook();
		HSSFSheet sheet =workbook.createSheet();
		HSSFRow hrow =sheet.createRow(0);
		hrow.createCell(0).setCellValue("Id");
		hrow.createCell(1).setCellValue("Fname");
		hrow.createCell(2).setCellValue("Lname");
		hrow.createCell(3).setCellValue("age");
		hrow.createCell(4).setCellValue("Height");
		hrow.createCell(5).setCellValue("offence");
		hrow.createCell(6).setCellValue("dob");
		hrow.createCell(7).setCellValue("no of crime");
		hrow.createCell(8).setCellValue("punishment");
		hrow.createCell(9).setCellValue("current status");
		
		int i =1;
			HSSFRow row=sheet.createRow(i);
			row.createCell(0).setCellValue(obj.getCriminalId());
			row.createCell(1).setCellValue(obj.getCriminalFirstName());
			row.createCell(2).setCellValue(obj.getCriminalLastName());
			row.createCell(3).setCellValue(obj.getCriminalAge());
			row.createCell(4).setCellValue(obj.getCriminalHeight());
			row.createCell(5).setCellValue(obj.getOffenceType());
			row.createCell(6).setCellValue(obj.getCriminaldob());
			row.createCell(7).setCellValue(obj.getNoOfCrimes());
			row.createCell(8).setCellValue(obj.getPunishment());
			row.createCell(9).setCellValue(obj.getCurrentStatus());
			
		
		try {
			fileout = new FileOutputStream("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls");
			workbook.write(fileout);
			fileout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	

	
	else {
		try {
			System.out.println("doing else part");
			FileInputStream in=new FileInputStream("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls");
			HSSFWorkbook workbook1 =new HSSFWorkbook(in);
			HSSFSheet sheet =workbook1.getSheetAt(0);
			int row=sheet.getLastRowNum()+1;
			HSSFRow row1=sheet.createRow(row);
			row1.createCell(0).setCellValue(obj.getCriminalId());
			row1.createCell(1).setCellValue(obj.getCriminalFirstName());
			row1.createCell(2).setCellValue(obj.getCriminalLastName());
			row1.createCell(3).setCellValue(obj.getCriminalAge());
			row1.createCell(4).setCellValue(obj.getCriminalHeight());
			row1.createCell(5).setCellValue(obj.getOffenceType());
			row1.createCell(6).setCellValue(obj.getCriminaldob());
			row1.createCell(7).setCellValue(obj.getNoOfCrimes());
			row1.createCell(8).setCellValue(obj.getPunishment());
			row1.createCell(9).setCellValue(obj.getCurrentStatus());
			fileout=new FileOutputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
			workbook1.write(fileout);
			fileout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	}
	
}

 