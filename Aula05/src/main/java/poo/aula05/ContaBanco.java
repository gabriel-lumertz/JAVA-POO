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
    
    public ContaBanco(int n, String t, String d) {
        this.numConta = n;
        this.tipo = t;
        this.dono = d;
        this.saldo = 0;
        this.status = false;
    }
    
    
    public void abrirConta(String t, boolean s) {
        setTipo(t);
        setStatus(s);
        if (t == "CC") {
                setSaldo(150);
            } else if (t == "CP") {
                setSaldo(50);
            }
    }
    
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Saque o valor antes de fechar a conta.");
        } else if (saldo < 0) {
            System.out.println("Saldo devedor, não é possível fechar a conta.");
        } else {
            setStatus(false);
        }
        
        this.status = false;
    }
    
    public void depositar(float valor) {
        if (getStatus() == true) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar.");
        }
    }
    
    public void sacar(float valor) {
        if (getStatus() == true) {
            if (getSaldo() > 0) {
                setSaldo(getSaldo() - valor);
            }
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void pagarMensal() {
        float m;
        
        if (getTipo() == "CC"){
            m =12;
        } if (getTipo() == "CP") {
            m = 20;
        }
        
        if (getStatus() == true) {
            if (getSaldo() > m) {
                setSaldo(getSaldo() - m);
            }
        } else {
            System.out.println("Saldo insuficiente");
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
