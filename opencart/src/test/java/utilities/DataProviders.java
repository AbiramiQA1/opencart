package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider1
	@DataProvider(name="LoginData")
	
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\Opencart_LoginData.xlsx";
		ExcelUtility E=new ExcelUtility(path);
		int totalRow=E.getRowCount("Sheet1");
		int totalColumn=E.getCellCount("Sheet1", 1);
		
		String d[][]=new String[totalRow][totalColumn];
		
		for(int i=1;i<totalRow;i++)
		{
			for(int j=0;j<totalColumn;j++)
			{
		       d[i-1][j]=E.getCellData("Sheet1", i, j).trim();
		       System.out.println("Row " + i + " Col " + j + " = " + d[i-1][j]);
			}
		}
		return d;
		
	}
}
