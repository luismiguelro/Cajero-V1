
import javax.swing.JOptionPane;


public class Depositar extends Cajero {

    @Override
    public void Transacciones() {
        
        Depositar();
        
        //para tomar lo del saldo y asi poder sumar
        transacciones=getSaldo();
        
        //enviar actulizacion de nuevo saldo
        setSaldo(transacciones + deposito);
        
        JOptionPane.showMessageDialog(null,"DEPOSITASTE \n "+deposito+" \nNUEVO SALDO \n"+getSaldo());
    }
    
}
