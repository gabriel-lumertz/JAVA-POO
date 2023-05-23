package poo.aula06;

/**
 *
 * @author gabriel@lumertz.dev
 */
public interface Controlador {    
    public abstract void ligar();
    public abstract void deseligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
