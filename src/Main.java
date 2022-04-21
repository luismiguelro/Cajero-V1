public class Main {
    public static void main(String []args){
        //MOSTRAR SALDO ACTUAL, NO AFECTA FUNCIONAMIENTO
        Cajero mensajero = new Consulta();
        mensajero.setSaldo(50000);
        
        //Llamar metodo que tiene toda la logica
        mensajero.Operaciones();
    }
    
}
