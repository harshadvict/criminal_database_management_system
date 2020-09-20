package service;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import controller.displaySearchResult;
import model.criminalPerson;

//class readCriminarecord extends the abstract class abstractReadCriminalRecord

public class readCriminalrecord extends abstractReadCriminalRecord{
	
	//readRecord method is used to read the value from the file
   public void readRecord(){
	  try {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
		for(Row row:sheet) {
			for(Cell cell:row) {
				switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
				{  
				case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
				//getting the value of the cell as a number  
				System.out.print((int)(cell.getNumericCellValue())+ "\t\t\t");   
				break;  
				case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
				//getting the value of the cell as a string  
				System.out.print(cell.getStringCellValue()+ "\t\t\t");  
				break;  
			}
		}
			System.out.println();
	  }
	  }catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 
  }
 
   @Override
   public boolean readRecord(int id) {
	   
	// to return to the called method to know whether result is fetched or not
			boolean report=false;
		
			 try {
					FileInputStream fis=new FileInputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
					HSSFWorkbook wb=new HSSFWorkbook(fis);
					HSSFSheet sheet=wb.getSheetAt(0);
					FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
					
					for(Row row:sheet) {
						if(row.getRowNum()>0) {
						if(row.getCell(0).getNumericCellValue()==id)
						{
							report =true;
						for(Cell cell:row) 
							{
							switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
							{  
							case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
							//getting the value of the cell as a number  
							System.out.print((int)cell.getNumericCellValue()+ "\t\t");   
							break;  
							case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
							//getting the value of the cell as a string  
							System.out.print(cell.getStringCellValue()+ "\t\t");  
							break;  
							}
						 }
					}
					}
						System.out.println();
				  }
				  }catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
	  return report;
	 
}

   @Override
   public boolean readRecord(String name) {
	// to return to the called method to know whether result is fetched or not
				boolean report=false;
				 try {
						FileInputStream fis=new FileInputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
						HSSFWorkbook wb=new HSSFWorkbook(fis);
						HSSFSheet sheet=wb.getSheetAt(0);
						FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
						System.out.println("for checking it is going inside the function");
						for(Row row:sheet) {
							if(row.getRowNum()>0) {
							 System.out.println("inside if statement");
							for(Cell cell:row) {
								if(cell.getColumnIndex()==1 &&cell.getStringCellValue().equals(name)) {
									report=true;
									for(Cell cell1:row) {
										switch(formulaEvaluator.evaluateInCell(cell1).getCellType())  
										{  
										case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
										//getting the value of the cell as a number  
										System.out.print((int)cell1.getNumericCellValue()+ "\t\t");   
										break;  
										case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
										//getting the value of the cell as a string  
										System.out.print(cell1.getStringCellValue()+ "\t\t");  
										break;  
									}
								}
								
							}
						}
					}
							System.out.println();
				  }
					}catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	return report;
}
}
