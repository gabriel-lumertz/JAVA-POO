package poo.aula12;

/**
 *
 * @author gabriel@lumertz.dev
 */
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho() {
        System.out.println("Fazendo ninho.");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Som de ave.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Construindo ninho.");
    }
}
