/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscoteraDiscos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ListaCantantesFamosos {
    
  ArrayList<CantanteFamoso> cantantes;

    public ListaCantantesFamosos() {
        cantantes = new ArrayList<CantanteFamoso>();
    }

    public void AgregarCantanteFamoso(CantanteFamoso Cantante) {
        cantantes.add(Cantante);
    }

    public void listarCantanteFamoso() {
        CantanteFamoso cantante;
        Iterator<CantanteFamoso> continuar = cantantes.iterator();
        while (continuar.hasNext()) {
            cantante = continuar.next();
            System.out.println(" Cantante: " +  cantante.getNombre()+ "\n Albun mas Vendido: " + cantante.getDiscoConMasVentas());
            System.out.println(" ");
        }
    }
    
    
   
}