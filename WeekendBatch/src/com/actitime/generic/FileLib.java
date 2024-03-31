package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * It is a generic class to read data from property, excel and write data into excel
 * @author QSP
 */
public class FileLib {
/**
 * This is a generic method to read data from property file
 * @param key
 * @return It will return the value of mentioned key name
 * @throws IOException
 */
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
/**
 * It is a generic method to read data from excel based upon sheet name, row and cell index
 * @param sheet					@param row				@param cell
 * @return It will return the String cell value of particular cell mentioned
 * @throws EncryptedDocumentException		 @throws IOException
 */
public String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * It is a generic method to write String data into excel file
 * @param sheet  @param row					@param cell				@param value
 * @throws EncryptedDocumentException		@throws IOException
 */
public void writeDataIntoExcel(String sheet,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
}
}
