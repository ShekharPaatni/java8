import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @author Chandra Shekhar Paatni on 2/9/19
 */
public class WordDocument {
    public static void main(String[] args) throws IOException {
        String columnOne = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String columnTwo = "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        String columnThree = "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
        String columnFour  = "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        FileOutputStream out = new FileOutputStream(new File("create_table.docx"));
        XWPFDocument xwpfDocument = new XWPFDocument();
        CTSectPr sectPr = xwpfDocument.getDocument().getBody().addNewSectPr();
        CTPageMar pageMar = sectPr.addNewPgMar();
        pageMar.setLeft(BigInteger.valueOf(0L));
        pageMar.setTop(BigInteger.valueOf(0L));
        pageMar.setRight(BigInteger.valueOf(0L));
        pageMar.setBottom(BigInteger.valueOf(0L));
        XWPFTable table = xwpfDocument.createTable(1, 4);
        XWPFTableRow tableRow = table.getRow(0);
        tableRow.getCell(0).setText(columnOne);
        tableRow.getCell(1).setText(columnTwo);
        tableRow.getCell(2).setText(columnThree);
        tableRow.getCell(3).setText(columnFour);
        xwpfDocument.write(out);
        out.close();

    }
}
