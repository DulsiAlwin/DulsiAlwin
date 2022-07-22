package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ActiXL implements FrameworkConstantActi {
	public String readxl(String Sheet,int row, int column) throws EncryptedDocumentException, IOException {
	FileInputStream fis =new FileInputStream("XLPATH");
	Workbook wb= WorkbookFactory.create(fis);
	return wb.getSheet(Sheet).getRow(row).getCell(column).toString();	
}
}
