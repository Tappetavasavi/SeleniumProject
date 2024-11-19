package genericUtility;

    import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
		/**
		 * this is for fetch the single data from excel sheet
		 * @param SheetName
		 * @param RowNum
		 * @param CellNum
		 * @return 
		 * @throws Exception
		 */
	public class ExcelUtility {
		public String getDataFromExcel(String SheetName,int RowNum,int CellNum)throws Exception
		{
			
			FileInputStream fis=new FileInputStream(IpathConstant.excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Cell c=wb.getSheet(SheetName).getRow(RowNum).getCell(CellNum);
			DataFormatter df=new DataFormatter();
			String value=df.formatCellValue(c);
			System.out.println(value);
			
			return value;
		}
		/**
		 * this is for fetch the multipleData from excel file
		 * @param SheetName
		 * @param StratRowIndex
		 * @param StartCellIndex
		 * @return
		 * @throws Exception
		 */
		public String getMultipleDataFromExcel(String SheetName,int StartRowIndex,int StartCellIndex)throws Exception
		{
			FileInputStream fis=new FileInputStream(IpathConstant.excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(SheetName);
			System.out.println(sh.getLastRowNum());
			DataFormatter df=new DataFormatter();
			for(int i=StartRowIndex;i<=sh.getLastRowNum();i++)
			{
				Row r=sh.getRow(i);
				for(int j=StartCellIndex;j<r.getLastCellNum();j++)
				{
					Cell c=r.getCell(j);
					String value=df.formatCellValue(c);
					System.out.println(value);
				}
			}
			
			return SheetName;
		}
		/**
		 * this is for write the data in excel file
		 * @param SheetName
		 * @param rowIndex
		 * @param CellIndex
		 * @param value
		 * @throws Exception
		 * @throws Exception
		 */
		public void WriteDataToExcel(String SheetName,int rowIndex,int CellIndex,String value) throws Exception, Exception
		{
			FileInputStream fis=new FileInputStream(IpathConstant.excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(SheetName);
			sh.createRow(rowIndex).createCell(CellIndex).setCellValue(value);
			sh.getRow(1).createCell(1).setCellValue(value);
			FileOutputStream fos=new FileOutputStream(IpathConstant.excelPath);
			wb.write(fos);
		}
		

	}

