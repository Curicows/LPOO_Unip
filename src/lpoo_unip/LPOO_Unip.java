package lpoo_unip;

import models.Veiculo;
import models.Automovel;
/**
 *
 * @author giova
 */
public class LPOO_Unip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo[] teste = new Veiculo[50];
        teste[0] = new Automovel("Ford","ka","C5S-D5E8");
        System.out.println(teste[0].getModelo());
        teste[0].acelerar();
        System.out.println("adasdas");
        System.out.println("jfhodigsdif");
    }
    
}
