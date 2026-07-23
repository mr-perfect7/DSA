package SystemDesign.GoogleDocs;
public class DocumentEditor {
    private Document currentDocument;
    private Persist storagPersist;

    public DocumentEditor(Persist storagPersist){
        this.currentDocument = new Document();
        this.storagPersist = storagPersist;
    }

}
