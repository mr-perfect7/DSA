package SystemDesign.GoogleDocs;

public class ImageElement implements DocumentElement {
   private String path;
   public ImageElement(String path){
    this.path = path;
   }
   public void render(){
    System.out.println("Image Element : "+path);
    }
}
