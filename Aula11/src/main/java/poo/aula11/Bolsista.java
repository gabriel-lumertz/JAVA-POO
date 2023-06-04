package poo.aula11;

/**
 *
 * @author gabriel@lumertz.dev
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
