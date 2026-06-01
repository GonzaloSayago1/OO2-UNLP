package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReportGeneratorTest {
	ReportGenerator generatorPDF, generatorXLS;
	Document document;
	
	@BeforeEach
	void setUp()
	{
		document = new Document("informe");
		document.addAuthor("Carlos");
		document.addAuthor("Ana");
		
		generatorPDF = new ReportGenerator(new TipoPDF());
		generatorXLS = new ReportGenerator(new TipoXLS());
	}
	
	@Test
	void testPDF()
	{
		generatorPDF.generateReport(document);
	}
	
	@Test
	void testXLS()
	{
		generatorXLS.generateReport(document);
	}
}
