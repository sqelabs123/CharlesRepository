package com.Utility.Bill.Re_Usable; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell; 
import org.apache.poi.xssf.usermodel.XSSFRow; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

public class Testdata { 
	
 public FileInputStream fis =null; 
 public FileOutputStream fileOut = null; 
 private XSSFWorkbook workbook = null; 
 private XSSFSheet sheet = null; 
 private XSSFRow row = null; 
 private XSSFCell cell = null; 
 String path = null;
 public static String id;
 public static int password;
//define a test result data object
 public static Map<String, Object[]> testresultdata;

 //Constructor 
 public Testdata() throws IOException{ 
  //path = System.getProperty("user.dir") + "\\TestData\\Testdata1.xlsx"; 
	 path="E:\\MeterReadImportTemplate\\Meter Read Import Template.csv";
  fis = new FileInputStream(path); 
  workbook = new XSSFWorkbook(fis); 
  sheet = workbook.getSheetAt(0); 
 } 
 
 
 //Provides total number of rows in sheet - testcase 
 public int getSheetRows(String sheetName){ 
  int index = workbook.getSheetIndex(sheetName); 
  sheet = workbook.getSheetAt(index); 
  return(sheet.getLastRowNum() + 1); 
 } 
 
 
 //Provide total number of columns in sheet - testcase 
 public int getSheetColumns(String sheetName){ 
  int index = workbook.getSheetIndex(sheetName); 
  sheet = workbook.getSheetAt(index); 
  row = sheet.getRow(0); 
  return(row.getLastCellNum()); 
 } 
 
 
 //Provide cell string value - testdata 
 public String get_string_CellData(String sheetName, int colNum, int rowNum){ 
  int index = workbook.getSheetIndex(sheetName); 
  sheet = workbook.getSheetAt(index); 
  row = sheet.getRow(rowNum); 
  cell = row.getCell(colNum); 
  return cell.getStringCellValue(); 
   
 } 
 
 //Provide cell numeric value - testdata 
 public int get_numeric_CellData(String sheetName, int colNum, int rowNum){ 
  int index = workbook.getSheetIndex(sheetName); 
  sheet = workbook.getSheetAt(index); 
  row = sheet.getRow(rowNum); 
  cell = row.getCell(colNum); 
  return (int) (cell.getNumericCellValue()); 
  
  
  
  
 } 
 
 //Provide cell value - testdata 
 public String getCellData(String sheetName, String colName, int rowNum){ 
  int colNum =-1; 
  int index = workbook.getSheetIndex(sheetName); 
  sheet = workbook.getSheetAt(index); 
  for(int i=0; i<getSheetColumns(sheetName); i++){ 
   row = sheet.getRow(0); 
   cell = row.getCell(i); 
   if(cell.getStringCellValue().equals(colName)){ 
    colNum = cell.getColumnIndex(); 
    break; 
   } 
  } 
  row = sheet.getRow(rowNum); 
  cell = row.getCell(colNum); 
  return(cell.getStringCellValue()); 
 }  
 
 //Set data in cell
 public void setCellData(String sheetName, int colNum, int rowNum, String str){ 
  int index = workbook.getSheetIndex(sheetName); 
  sheet = workbook.getSheetAt(index); 
  row =sheet.getRow(rowNum); 
  cell = row.createCell(colNum); 
  cell.setCellValue(str); 
   
  try { 
   fileOut = new FileOutputStream(path); 
   try { 
    workbook.write(fileOut); 
    fileOut.close(); 
   } catch (IOException e) { 
    // TODO Auto-generated catch block 
    e.printStackTrace(); 
   } 
    
  } catch (FileNotFoundException e) { 
   // TODO Auto-generated catch block 
   e.printStackTrace(); 
  } 
   
 } 
   /*
 public   void main() throws IOException{ 
  Testdata reader = new Testdata(); 
  //System.out.println(reader.getSheetRows("LoginTest")); 
  //System.out.println(reader.getSheetRows("SignUpTest")); 
  //System.out.println(reader.getSheetColumns("LoginTest")); 
    id=reader.get_string_CellData("LoginTest", 0, 1);
  System.out.println("123");
  password=reader.get_numeric_CellData("LoginTest", 1, 1);
  System.out.println(id+" "+password);
  //System.out.println(reader.getCellData("LoginTest", "password", 1)); 
  //System.out.println(reader.getCellData("SignUpTest", "lastname", 3)); 
  //reader.setCellData("LoginTest", 1, 1, "Hello World"); 
 }  */
} 