package poo.aula13;

/**
 *
 * @author gabriel@lumertz.dev
 */
public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero.");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
