
import javax.swing.JOptionPane;

//Funciones principal

//Clase abstracto
public abstract  class Cajero {
    
    //Atributos protected para heredar
    protected int transacciones, retiro,deposito;
    //Convertir tipo estatico
    
    //Saldo= AMBITO GLOBAL
    
    //no se necesita crear objeto, solo se inicializa una vez
    //depende del lugar donde fue declarada
    private static int saldo;
    
    //Metodo de las operaciones
    public void Operaciones (){
        int opcion=0;
        String menu="*****CAJERO****\n" +
                    "1. Consultar saldo\n" +
                    "2. Retirar en Efectivo\n" +
                    "3. Depositar\n" +
                    "0. Salir";
        
        do{
            
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch(opcion){
            //Creacion polimorfismo 
            case 1: Cajero consulta =new Consulta();
            //se llamada metodo abstracto
            consulta.Transacciones();
            break;
            case 2: Cajero retirar = new Retirar();
            retirar.Transacciones();
                break;
            case 3: Cajero depositar=new Depositar();
            depositar.Transacciones();
                break;
            case 0: JOptionPane.showMessageDialog(null,"Gracias, vuelva pronto :)");
                break;
            default: JOptionPane.showMessageDialog(null,"LA OPCIÓN "+opcion+" NO EXISTE");
                break;
        }
        }while(opcion!=0);
    }
    //Metods get y setter
    
    // metodo abstracto, tiene polimorfismo, el cual se va a modificar de cualquier forma
    
    public abstract void Transacciones();
    
      //set y get transaccion
    public int getTransaccion() {
        return transacciones;
    }

    public void setTransaccion(int transaccion) {
        this.transacciones = transaccion;
    }
    
    //Metodo para solicitar cantidad a retirar 
    public void Retirar (){
       retiro=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto a retirar"));
    }
    
    //set y get retiro
    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }
    
      //Metodo para solicitar cantidad a retirar 
    public void Depositar (){
       deposito=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto a depositar"));
    }

    //set y get deposito
    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
    
      //set y get saldo
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
    
}
