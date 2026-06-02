package ar.edu.info.unlp.ejercicioDemo;

public class TipoXLS extends Tipo{
	@Override 
	protected void configureMetadata(Document document, DocumentFile docFile)
	{
		docFile.setContentType("application/vnd.ms-excel");
        docFile.setSheetName(document.getSubtitle());
	}
	
	@Override
	protected byte[] setContent(Document document, DocumentFile docFile) {
		return new ExcelWriter().generateExcelFile(document);
	}
}
