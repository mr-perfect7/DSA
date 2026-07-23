package SystemDesign.GoogleDocs;

public class SaveToDB implements Persist {
    public void save(Document doc){
        System.out.println("DATA SAVED TO DATABASE");
        System.out.println(doc);
    }
}
