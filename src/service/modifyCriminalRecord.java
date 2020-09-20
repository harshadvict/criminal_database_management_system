package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class modifyCriminalRecord extends abstractModifyrecord {
      
	//function to modify offence
	
	public void modifyTheRecord(int id,String offence) {
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
					for(Cell cell:row) 
						{
						if(cell.getColumnIndex()==5) {
							String temp=cell.getStringCellValue();
							System.out.println(offence);
							temp=temp.concat(","+offence);
							System.out.println(temp);
							cell.setCellValue(temp);
							System.out.println(cell.getStringCellValue());
						}
						  
						}
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

	
    public void modifyTheRecord1(int id1,int no) {
    	 System.out.println("inside the function");
			FileInputStream fis;
			try {
				fis = new FileInputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
			
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sheet=wb.getSheetAt(0);
			
			for(Row row:sheet) {
				if(row.getRowNum()>0) {
				if(row.getCell(0).getNumericCellValue()==id1)
				{
				for(Cell cell:row) 
					{
					if(cell.getColumnIndex()==7) {
					 double temp=cell.getNumericCellValue();
						System.out.println(no);
						temp=temp+(double)no;
						cell.setCellValue(temp);
						
					}
					  
					}
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
    
    
    public void modifyTheRecord2(int id2,String punishment) {
    	 System.out.println("inside the function");
			FileInputStream fis;
			try {
				fis = new FileInputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
			
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sheet=wb.getSheetAt(0);
			
			for(Row row:sheet) {
				if(row.getRowNum()>0) {
				if(row.getCell(0).getNumericCellValue()==id2)
				{
				for(Cell cell:row) 
					{
					if(cell.getColumnIndex()==8) {
						String temp=cell.getStringCellValue();
						temp=temp.concat(","+punishment);
						cell.setCellValue(temp);
						cell.setCellValue(temp);
						
					}
					  
					}
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
    
    public void modifyTheRecord3(int id3,String status) {
    	 System.out.println("inside the function");
			FileInputStream fis;
			try {
				fis = new FileInputStream(new File("C:\\Users\\HARSH\\Desktop\\New folder\\criminalDetail2.xls"));
			
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sheet=wb.getSheetAt(0);
			
			for(Row row:sheet) {
				if(row.getRowNum()>0) {
				if(row.getCell(0).getNumericCellValue()==id3)
				{
				for(Cell cell:row) 
					{
					if(cell.getColumnIndex()==9) {
						String temp=cell.getStringCellValue();
						temp=temp.concat(","+status);
						cell.setCellValue(temp);
						cell.setCellValue(temp);
						
					}
					  
					}
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
