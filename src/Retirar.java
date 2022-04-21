
import javax.swing.JOptionPane;
public class Retirar extends Cajero {
    
    //Metodo polimorfismo
    @Override
    public void Transacciones (){
        //Invocar metodo
        Retirar();
        
        //Verificar
        if (retiro <=getSaldo()){
            
            //Variable transacciones
            transacciones = getSaldo();
            setSaldo(transacciones-retiro);
            JOptionPane.showMessageDialog(null,"RETIRASTE\n"+retiro+"\nSALDO NUEVO\n"+getSaldo());
        }
        else{
            JOptionPane.showMessageDialog(null,"Saldo insuficiente para retirar :(");
        }   
    }
    
}
