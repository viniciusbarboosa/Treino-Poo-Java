package poo;
public class ContaBanco {

  public int numConta;
  protected String tipo;
  private String dono;
  private double saldo;
  private boolean status;
  
 public void estadoAtual(){
     System.out.println("Numero da Conta "+this.getNumConta());
     System.out.println("Tipo da Conta "+this.getTipo());
     System.out.println("Dono da Conta "+this.getDono());
     System.out.println("Saldo da Conta "+this.getSaldo());
     System.out.println("Status da Conta "+this.getStatus());
 }
  
  
  
  public void ContaBanco(){
    this.saldo=0;
    this.status=false;
    
}
  public void abrirConta(String a){
      this.setTipo(a);
      this.setStatus(true);
      if(a=="CC"){
          this.setSaldo(50);
      }else if(a=="CP"){
          this.setSaldo(150);
      }
      System.out.println("Conta Aberta");
      
  }
 
  
  public void fecharConta(){
     if(this.getSaldo()>0){
    System.out.println("Nao e possivel fechar conta ainda tem dinherio");  
     }else if (this.getSaldo()<0){
         System.out.println("Nao e possivel fechar conta ainda tem divida");
     }else{
         this.setStatus(false);
     }
  }
  
  public void depositar(double numero){
if(this.getStatus()){
    this.setSaldo(this.getSaldo()+ numero);
    System.out.println("Deposito realizado com sucesso "+this.getSaldo());
}else{
    System.out.println("Impossivel depositar");
}  
  }
  
    public void sacar(double numero){
 if(this.getStatus()){
    if(this.getSaldo()>=numero){
           this.setSaldo(this.getSaldo()-numero);
           System.out.println("Saque realizado");
            }else{
        System.out.println("Saldo Insuficiaente");
    }
     }else{
     System.out.println("Impossivel sacar conta fechada");
 }
 
  }
  public void pagarMensal(){
     int numero=0;
     if(this.getTipo()=="CC"){
       numero=12; 
     }else if(getTipo()=="CP"){
       numero=20;
     }
    if(this.getStatus()){
      this.setSaldo(this.getSaldo()-numero);
      System.out.println("Mensalidade paga");
    }else{
        System.out.println("Impossivel paga conta fechada");  
    } 
     
  }
  public int getNumConta(){
      return numConta;   
  }
  public void setNumConta(int numero){
     this.numConta=numero;
  }
    public void setDono(String nome){
     this.dono=nome;
  }

  public String getDono(){
      return dono;   
  }

 public void setTipo(String nome) {
        this.tipo=nome;
    }
 public String getTipo() {
    return tipo;    
    }
  public void setStatus(boolean a) {
      this.status=a;   
    }
   public boolean getStatus() {
       return status;
    }
   public void setSaldo(double numero) {
      this.saldo=numero;
    }
   public double getSaldo() {
        return saldo;
    }
  
  
    
}
