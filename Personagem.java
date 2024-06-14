
/**
 * Classe abstrata de personagem
 * 
 * @author (Bruno Schmitz da Silva) 
 * @version (1.0)
 */
public class Personagem
{
    private static String name;
    private static Vision visao;
    private static Nation nacao;
    private static String constelacao;
    private static double vida_base;
    private static double atk_base;
    private static double def_base;
    private static double proficiencia;
    private static double recarga_energia = 100.0;
    private static double taxa_critica = 50.0;
    private static double dano_critico = 100.0;
    
    public Personagem(
    String name, Vision visao, Nation nacao, String constelacao,
    double vida_base, double atk_base, double def_base, double proficiencia,
    double recarga_energia, double taxa_critica, double dano_critico)
    {
        this.name = name;
        this.visao = visao;
        this.nacao = nacao;
        this.constelacao = constelacao;
        this.vida_base = vida_base;
        this.atk_base = atk_base;
        this.def_base = def_base;
        this.proficiencia = proficiencia;
        this.recarga_energia = recarga_energia;
        this.taxa_critica = taxa_critica;
        this.dano_critico = dano_critico;
    }
    
    public boolean setName(String name) {
        if (name.length() >= 2) {
            this.name = name;
            return true;
        }
        return false;
    }
    
    public String getName() {
        if (this.name.length() >= 2) return this.name;
        return "Personagem sem nome!";
    }
    
    public boolean setVisaoName(String visao_name) {
        if (this.visao.setVisionName(visao_name)) return true;
        return false;
    }
    
    public String getVisao() {
        if (this.name.length() >= 2) return this.name;
        return "Personagem sem nome!";
    }
    
    public boolean setNation(String nation) {
        if (this.nacao.setNationName(nation)) return true;
        return false;
    }
}
