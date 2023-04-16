package poo.aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Azul", 0.5f);
        
//        c1.setModelo("BIC");
//        c1.modelo = ("BIC");
////        O atributo modelo é público
        
//        c1.setPonta(0.5f);
////        c1.ponta = 1.5f;
////        O atributo ponta é privado
        
        c1.status();
        
//        System.out.println("Tenho uma caneta " + c1.getModelo() + " de poonta " + c1.getPonta());
        
        
    }
}
