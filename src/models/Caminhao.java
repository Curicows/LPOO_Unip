package models;

/**
 *
 * @author giova
 */
public class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo, String placa) {
        super(marca,modelo,placa,"caminhao");
    }
    
    @Override
    public void acelerar() {
        System.out.println("VRUUUUMMMM!!");
    }

    @Override
    public void buzinar() {
        System.out.println("BIBI");
    }
    
}
