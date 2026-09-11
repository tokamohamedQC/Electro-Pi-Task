import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class RelatedActions {

    public WebDriverWait waitElement(WebDriver driver){
        return new WebDriverWait(driver, 10);
    }

    public String readStringFile(int row, int column) throws Exception {
        File src = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\TestData.xlsx");
        FileInputStream testData = new FileInputStream(src);
        XSSFWorkbook x = new XSSFWorkbook(testData);
        XSSFSheet sheet = x.getSheetAt(0);
        String testDataInput = sheet.getRow(row).getCell(column).getStringCellValue();
        return testDataInput;
    }

}
