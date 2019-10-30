/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscoteraDiscos;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Usuario {

    public static void main(String[] args) {

        String cantante, disco;
        ListaCantantesFamosos listacantate = new ListaCantantesFamosos();

        AgregarCantante entrada = new AgregarCantante();

        CantanteFamoso cantante1 = new CantanteFamoso("Twice", "Fancy");
        CantanteFamoso cantante2 = new CantanteFamoso("Exo", "Love Shot");
        CantanteFamoso cantante3 = new CantanteFamoso("Michael Jackson", "How is it?");
        CantanteFamoso cantante4 = new CantanteFamoso("Sabaton", "No Bullets Fly");
        CantanteFamoso cantante5 = new CantanteFamoso("Ricardo Arjona", "5to Piso");
        CantanteFamoso cantante6 = new CantanteFamoso("BTS", "El Gran Showman");

        listacantate.AgregarCantanteFamoso(cantante1);
        listacantate.AgregarCantanteFamoso(cantante2);
        listacantate.AgregarCantanteFamoso(cantante3);
        listacantate.AgregarCantanteFamoso(cantante4);
        listacantate.AgregarCantanteFamoso(cantante5);
        listacantate.AgregarCantanteFamoso(cantante6);

        System.out.println("Datos Actaules: ");
         System.out.println(" ");
        listacantate.listarCantanteFamoso();
        String continuar;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre de un cantante: ");
            cantante = entrada.AgregarCantante();
            System.out.println("Ingrese su disco mas vendido: ");
            disco = entrada.AgregarCantante();
            listacantate.AgregarCantanteFamoso(new CantanteFamoso(cantante, disco));
            System.out.println("Lista Actualizada: ");
            listacantate.listarCantanteFamoso();
            System.out.println("¿Deseas agregar mas artistas(S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

    }

}
