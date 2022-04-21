
import javax.swing.JOptionPane;
public class Consulta extends Cajero {
    
    @Override
    public void Transacciones(){
       JOptionPane.showMessageDialog(null,"SALDO ACTUAL\n"+getSaldo());
        
    }
    
}
