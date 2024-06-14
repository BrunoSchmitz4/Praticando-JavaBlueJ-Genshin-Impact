
/**
 * Escreva uma descrição da classe Visao aqui.
 * 
 * @author (Bruno Schmitz da Silva)
 * @version (1.0)
 */
public class Vision
{
    protected static String vision_name = "";
    protected static Element element;

    public Vision(String vision_name, Element element)
    {
        this.vision_name = vision_name;
        this.element = element;
    }

    public boolean setVisionName(String vision_name) {
        if (this.vision_name.length() >= 3 && vision_name.length() >= 3) {
            System.out.println("Nome da visão atualizada de " + this.vision_name 
            + " para " + vision_name);
            this.vision_name = vision_name;
            return true;
        }
        return false;
    }
    
    public String getNomeVisao() {
        if(this.vision_name.length() >= 3) return this.vision_name;
        return "Visão sem nome!";
    }
    
    public boolean setElement(String element) {
        if (this.element.setElement_name(element)) return true;
        return false;
    }
    
    public String getElement() {
        if(element.getElement_name().length() >= 2) return "" + this.element;
        return "Elemento sem nome!";
    }
}
