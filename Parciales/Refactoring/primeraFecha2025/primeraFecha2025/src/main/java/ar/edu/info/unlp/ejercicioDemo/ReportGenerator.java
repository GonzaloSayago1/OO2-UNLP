package ar.edu.info.unlp.ejercicioDemo;

import java.util.stream.Collectors;

public class ReportGenerator {
    private Tipo type;
    
    public ReportGenerator(Tipo type) { 
        this.type = type; 
    }
    
    private DocumentFile crearDocumento(Document document)
    {
    	DocumentFile docFile = new DocumentFile();
        docFile.setTitle(document.getTitle());
        String authors = document.getAuthors().stream()
                .collect(Collectors.joining(", "));;
        docFile.setAuthor(authors);
        return docFile;
    }
    
    public void generateReport(Document document) {
    	DocumentFile docFile = this.crearDocumento(document);
    	this.type.generateReport(document, docFile);
    	this.saveExportedFile(docFile);
    }

    // Método auxiliar para guardar el archivo exportado
    private void saveExportedFile(DocumentFile docFile) {
        System.out.println("Guardando archivo: " + docFile.getTitle() + " con tipo: " + docFile.getContentType());
    }
}
