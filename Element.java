
/**
 * Escreva uma descrição da classe Element aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Element
{
    private static String element_name;
    public Element(String element_name)
    {
        this.element_name = element_name;
    }
    
    public boolean setElement_name(String element_name) {
        if (element_name.length() >= 2) {
            this.element_name = element_name;
            return true;
        }
        return false;
    }
    
    public String getElement_name() {
        if (element_name.length() >= 2) return element_name;
        return "Elemento sem nome!";
    }
}
