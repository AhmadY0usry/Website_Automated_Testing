package Test_Data;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    static FileInputStream fis=null;
    public FileInputStream getFileInputStream()
    {
        String filePath=System.getProperty("user.dir")+ "\\UserData.xlsx";
        File srcFile=new File(filePath);
        try {
            fis=new FileInputStream(srcFile);
        } catch (FileNotFoundException e) {
            System.out.println("Test data file not found");
            System.exit(0);
        }
        return fis;
    }

    public Object[][] getDataFromExcelFile() throws IOException {

            fis=getFileInputStream();
            XSSFWorkbook wb= new XSSFWorkbook(fis);
            XSSFSheet sheet =wb.getSheetAt(0);
            int TotalNumOfRows=(sheet.getLastRowNum()+1);
            int TotalNumOfColumns= 4;
            String [][] arrayExcelData  = new String[TotalNumOfRows][TotalNumOfColumns];
            for(int i =0 ;i < TotalNumOfRows; i++) {
                for (int j = 0; j < TotalNumOfColumns; j++)
                {
                    XSSFRow row = sheet.getRow(i);
                    arrayExcelData[i][j]=row.getCell(j).toString();
                }
            }
            wb.close();
        return arrayExcelData;
    }

}
