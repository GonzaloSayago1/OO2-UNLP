package ar.edu.info.unlp.ejercicioDemo;

public abstract class Tipo {
	protected abstract void configureMetadata(Document document, DocumentFile docFile);
	protected abstract byte[] setContent(Document document, DocumentFile docFile);
	
	public void generateReport(Document document, DocumentFile docFile) {
		this.configureMetadata(document, docFile);
	    docFile.setContent(this.setContent(document, docFile)); 
	}
}
