package poo.aula11;

/**
 *
 * @author gabriel@lumertz.dev
 * 
 */
public class Aula11 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Gabriel");
        a1.setIdade(34);
        a1.setSexo("Masculino");
        
        System.out.println(a1.toString());
    }
}
