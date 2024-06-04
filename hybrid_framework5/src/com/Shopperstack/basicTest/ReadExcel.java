package com.Shopperstack.basicTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameworkConstants{
	public static String readdata(String sheet,int row,int cell) throws Exception
	{
	FileInputStream fis=new FileInputStream(excel_path);
	Workbook book = WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Cell Cell = book.getSheet(sheet).getRow(row).getCell(cell);
	String value = Cell.getStringCellValue().toString();
	return value;
	}
}
