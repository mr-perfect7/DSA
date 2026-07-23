package SystemDesign.GoogleDocs;

public class SaveToFile implements Persist{
    public void save(Document doc){
        System.out.println("DOCUMENT SAVED TO FILE");
        System.out.println(doc);
    }
}
