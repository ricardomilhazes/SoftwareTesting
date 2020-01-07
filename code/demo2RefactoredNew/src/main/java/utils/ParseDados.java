package utils; /**
 * Classe que contém métodos para efetuar parsing de dados.
 *
 * 
 * 
 * 
 * @version 20190415
 */

import carros.*;
import utilizadores.Cliente;
import utilizadores.Proprietario;

import java.util.GregorianCalendar;
import java.util.Random;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ParseDados{

    private ParseDados(){}

    public static Proprietario parseProprietario(String linha){
        String nome;
        String nif;
        String email;
        String morada;
        String [] dados = linha.split(",");
        int ano = new Random().ints(1950, 2000).findFirst().getAsInt();
        int mes = new Random().ints(0, 11).findFirst().getAsInt();
        int dia = new Random().ints(0, 30).findFirst().getAsInt();
        GregorianCalendar date = new GregorianCalendar(ano, mes, dia);

        nome = dados[0];
        nif = dados[1];
        email = dados[2];
        morada = dados[3];

        Proprietario prop = new Proprietario(nome, nif, email, nif, morada, date);

        return prop.clone();
    }

    public static Cliente parseCliente(String linha){
        String nome;
        String nif;
        String email;
        String morada;
        String [] dados = linha.split(",");
        int ano = new Random().ints(1950, 2000).findFirst().getAsInt();
        int mes = new Random().ints(1, 12).findFirst().getAsInt();
        int dia = new Random().ints(1, 31).findFirst().getAsInt();
        GregorianCalendar date = new GregorianCalendar(ano, mes, dia);
        double x = 0.0;
        double y = 0.0;


        nome = dados[0];
        nif = dados[1];
        email = dados[2];
        morada = dados[3];

        try {
            x = Double.parseDouble(dados[4]);
            y = Double.parseDouble(dados[5]);
        }
        catch(InputMismatchException exc){
            //Adicionado por César
            return null;
        }

        Coordinate cords = new Coordinate(x,y);

        Cliente cli = new Cliente(nome, nif, email, nif, morada, date, cords, 0, 0, 0.0);

        return cli.clone();

    }

    public static Veiculo parseVeiculo(String linha){
        String [] dados = linha.split(",");

        switch(dados[0]){
            case "Electrico":
                Veiculo ce = parseCarroEletrico(linha);
                return ce.clone();
            case "Hibrido":
                Veiculo ch = parseCarroHibrido(linha);
                return ch == null ? null: ch.clone();
            case "Gasolina":
                Veiculo cg = parseCarroGasolina(linha);
                return cg.clone();
            default: return new Veiculo();
        }
    }

    private static CarroEletrico parseCarroEletrico(String linha){
        String marca;
        String nif;
        String matricula;
        String [] dados = linha.split(",");
        int velocidade;
        int autonomia;
        double x;
        double y;
        double preco;
        double consumo;

        marca = dados[1];
        matricula = dados[2];
        nif = dados[3];

        try {
            velocidade = Integer.parseInt(dados[4]);
            preco = Double.parseDouble(dados[5]);
            consumo = Double.parseDouble(dados[6]);
            autonomia = Integer.parseInt(dados[7]);
            x = Double.parseDouble(dados[8]);
            y = Double.parseDouble(dados[9]);
        }
        catch(InputMismatchException exc){return new CarroEletrico();}

        Coordinate cords = new Coordinate(x,y);

        return new CarroEletrico(marca, matricula, nif, velocidade, preco, consumo,
                autonomia, cords, true, 0, new ArrayList<ParDatas>());
    }

    private static CarroGasolina parseCarroGasolina(String linha){
        String marca;
        String matricula;
        String nif;
        String [] dados = linha.split(",");
        int velocidade;
        int autonomia;
        double x;
        double y;
        double preco;
        double consumo;

        marca = dados[1];
        matricula = dados[2];
        nif = dados[3];

        try {
            velocidade = Integer.parseInt(dados[4]);
            preco = Double.parseDouble(dados[5]);
            consumo = Double.parseDouble(dados[6]);
            autonomia = Integer.parseInt(dados[7]);
            x = Double.parseDouble(dados[8]);
            y = Double.parseDouble(dados[9]);
        }
        catch(InputMismatchException exc){return new CarroGasolina();}

        Coordinate cords = new Coordinate(x,y);

        return new CarroGasolina(marca, matricula, nif, velocidade, preco, consumo,
                autonomia, cords, true, 0, new ArrayList<ParDatas>());
    }

    private static CarroHibrido parseCarroHibrido(String linha){
        String marca;
        String matricula;
        String nif;
        String [] dados = linha.split(",");
        int velocidade;
        int autonomia;
        double x;
        double y;
        double preco;
        double consumo;

        marca = dados[1];
        matricula = dados[2];
        nif = dados[3];

        try {
            velocidade = Integer.parseInt(dados[4]);
            preco = Double.parseDouble(dados[5]);
            consumo = Double.parseDouble(dados[6]);
            autonomia = Integer.parseInt(dados[7]);
            x = Double.parseDouble(dados[8]);
            y = Double.parseDouble(dados[9]);
        }
        catch(InputMismatchException exc){return null;}

        Coordinate cords = new Coordinate(x,y);

        return new CarroHibrido(marca, matricula, nif, velocidade, preco, consumo,
                autonomia, cords, true, 0, new ArrayList<ParDatas>());
    }
}
