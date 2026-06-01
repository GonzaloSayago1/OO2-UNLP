package ar.edu.info.unlp.ejercicioDemo;

public class PDFExporter {
    
    public byte[] generatePDFFile(Document document) {
        // Aquí iría la lógica real usando librerías como iText o Apache PDFBox.
        // Para compilar y probar tu refactoring, devolvemos un arreglo de bytes simulado.
        
        String simulatedPdfContent = "Contenido PDF de: " + document.getTitle();
        return simulatedPdfContent.getBytes();
    }
}
