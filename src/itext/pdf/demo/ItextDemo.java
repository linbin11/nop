package itext.pdf.demo;

import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class ItextDemo {
	public static void main(String[] args) {
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("src/testPdf.pdf"));
			document.open();
			// 生成字体
			BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", false);
			// 标题字体
			Font f30 = new Font(bfChinese, 30, Font.NORMAL, BaseColor.BLACK);
			// 正文字体
			Font f12 = new Font(bfChinese, 12, Font.NORMAL, BaseColor.BLACK);
			Font f6 = new Font(bfChinese, 6, Font.NORMAL, BaseColor.BLACK);
			Font f8 = new Font(bfChinese, 8, Font.NORMAL, BaseColor.BLACK);
			document.add(new Paragraph("林斌斌", f12));
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
