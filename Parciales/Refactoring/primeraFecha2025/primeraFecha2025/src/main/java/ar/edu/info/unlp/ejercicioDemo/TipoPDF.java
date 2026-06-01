package ar.edu.info.unlp.ejercicioDemo;

public class TipoPDF extends Tipo{
	@Override
	protected void configureMetadata(Document document, DocumentFile docFile)
	{
		docFile.setContentType("application/pdf");
		docFile.setPageSize("A4");
	}
	
	@Override
	protected byte[] setContent(Document document, DocumentFile docFile) {
		return new PDFExporter().generatePDFFile(document);
	}
	
}
