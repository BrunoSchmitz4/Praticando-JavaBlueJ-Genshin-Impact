
/**
 * Escreva uma descrição da classe Nation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Nation
{
    private String nation_name;
    public Nation(String nation_name)
    {
        this.nation_name = nation_name;
    }
    
    public boolean setNationName(String nation_name) {
        if (nation_name.length() >= 6) {
            System.out.println("Nome da visão atualizada de " + this.nation_name 
            + " para " + nation_name);
            this.nation_name = nation_name;
            return true;
        }
        return false;
    }
    
    public String getNationName() {
        if (this.nation_name.length() >= 6) return this.nation_name;
        return "Nação sem nome!";
    }
}
