/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscoteraDiscos;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class AgregarCantante {
    


    private String entradaTeclado;
    Scanner sc = new Scanner(System.in);

    public AgregarCantante() {
        entradaTeclado = "";
    }

    public String AgregarCantante() {
        entradaTeclado = sc.nextLine();
        return entradaTeclado;
    }
    public String getEntrada() {
        return entradaTeclado;
    }

}
