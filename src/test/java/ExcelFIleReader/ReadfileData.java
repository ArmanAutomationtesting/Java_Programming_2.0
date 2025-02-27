//package ExcelFIleReader;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.formula.SheetRange;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class ReadfileData {
//
//    public static void main(String[] args) throws IOException {
//
//        FileInputStream fileInputStream  = new FileInputStream("C:\\Users\\ahmad\\Downloads\\ArmanTestDataFile.xlsx");
//        Workbook workbook = new XSSFWorkbook(fileInputStream){
//
//        };
//
//        Sheet sheet = workbook.getSheetAt(0);
//
//        for (Row row : sheet){
//
//            for(Cell cell : row){
//                cell.getStringCellValue();
//                System.out.println(cell);
//            }
//        }
//    }
//}
