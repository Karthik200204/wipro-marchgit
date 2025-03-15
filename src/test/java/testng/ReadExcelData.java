package testng;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
 
public class ReadExcelData {
	@Test
	public void readExcel() throws IOException,FileNotFoundException
	{
		//FIS to locate the path of the excel sheet
		FileInputStream fis = new FileInputStream("C:\\Users\\karthik reddy\\OneDrive\\Desktop\\AutomationData.xlsx");
		//Identify the workbook in the excel
		    XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Selenium");//Selenium sheet
			//workbook.getSheetAt(0);//selenium sheet
			int rows=sheet.getPhysicalNumberOfRows();//identify the no of records having the data
			System.out.println("Total no of records/rows in Selenium sheet is: "+rows);
			//Logic to find the no of columns
			int columns = sheet.getRow(1).getPhysicalNumberOfCells();
			System.out.println("Total no of columns in Selenium sheet is: "+columns);
			//print a particular cell value
			XSSFCell cellValue= sheet.getRow(1).getCell(0);
			System.out.println(cellValue);
			//print all the cell values using the loops
			System.out.println("All the cell values in the sheet present are:");
			for (int i = 0; i < rows; i++) {
			    XSSFRow row = sheet.getRow(i);
			    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			        XSSFCell cell = row.getCell(j);
			        System.out.print(cell + "\t");
			    }
			    System.out.println( );
			    }
			workbook.close();
	}
 
}
