package ExcelFIleReader;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadfileData {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream  = new FileInputStream(new File("C:\\Users\\ahmad\\Downloads\\ArmanTestDataFile.xlsx"));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        fileInputStream.close();

        Sheet sheet2 = workbook.createSheet("Hello");


        for (Row row : sheet2){

            for(Cell cell : row){
                cell.getStringCellValue();
                System.out.println(cell);
            }
        }
    }
}
