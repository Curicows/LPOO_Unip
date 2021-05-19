package lpoo_unip;

import java.util.Scanner;
import models.Veiculo;
import models.Multa;
import models.Motorista;
import java.util.ArrayList;

public class MenuBase {
    
    private Scanner sca;
    private static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    private static ArrayList<Multa> multas = new ArrayList<Multa>();
    private static ArrayList<Motorista> motoristas = new ArrayList<Motorista>();

    public MenuBase() {
        this.sca = new Scanner(System.in);
    }

    public static ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public static void appendVeiculos(Veiculo veiculo) {
        MenuBase.veiculos.add(veiculo);
    }

    public static ArrayList<Multa> getMultas() {
        return multas;
    }

    public static void appendMultas(Multa multas) {
        MenuBase.multas.add(multas);
    }

    public static ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public static void appendMotoristas(Motorista motoristas) {
        MenuBase.motoristas.add(motoristas);
    }

    
    
    public Scanner getSca() {
        return sca;
    }

    public void setSca(Scanner sca) {
        this.sca = sca;
    }
}
