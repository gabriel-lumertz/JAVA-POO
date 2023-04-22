package poo.aula05;

/**
 *
 * @author gabriel@lumertz.dev
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    protected float mensalidade;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("-----------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
                setSaldo(50);
            } else if ("CP".equals(t)) {
                setSaldo(150);
            }
        
        System.out.println("Conta aberta com sucesso.");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Saque o valor antes de fechar a conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Saldo devedor, não é possível fechar a conta.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    
    public void depositar(float valor) {
        if (getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Déposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    
    public void sacar(float valor) {
        if (getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de ." + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            } 
        } else{
            System.out.println("Impossíel sacar de uma conta inativa.");
        }
    }
    
    public void pagarMensalidade() {
        int v = 0;
        
        if ("CC".equals(this.getTipo())){
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());            
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }
    
    public void setNumConnta(int n) {
        this.numConta = n;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setMensalidade(float m) {
        this.saldo = m;
    }
    
    public float getMensalidade() {
        return this.mensalidade;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public boolean getStatus() {
        return this.status;
    }
}
