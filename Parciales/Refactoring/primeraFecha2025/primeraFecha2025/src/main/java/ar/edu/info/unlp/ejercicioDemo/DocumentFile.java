package ar.edu.info.unlp.ejercicioDemo;

public class DocumentFile {
    private String title;
    private String author;
    private String contentType;
    private String pageSize;
    private String sheetName;
    private byte[] content;

    // Métodos utilizados en el bloque PDF
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    // Método utilizado en el bloque XLS
    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    // Método utilizado en ambos bloques para guardar el binario
    public void setContent(byte[] content) {
        this.content = content;
    }

    // Agrego los getters por si los necesitas en tu refactoring
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContentType() { return contentType; }
    public String getPageSize() { return pageSize; }
    public String getSheetName() { return sheetName; }
    public byte[] getContent() { return content; }
}
