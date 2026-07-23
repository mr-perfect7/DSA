package SystemDesign.GoogleDocs;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> elements = new ArrayList<>();
    public void addElement(DocumentElement element){
        elements.add(element);
    }
    public void render(){
        for(DocumentElement el:elements){
            el.render();
        }
    }
    public List<DocumentElement> getELements(){
        return elements;
    }
}
