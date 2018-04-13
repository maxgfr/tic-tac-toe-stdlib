package tictactoe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;

/**
 *
 * @author golfier
 */
public class Main {
   
    public static void main(String[] args) {
        Espace e = Espace.getInstance();
        Rond r = new Rond(Color.RED);
        Carre c = new Carre(Color.BLUE);
        Joueur j1 = new Joueur (1,"Maxime",r);
        Joueur j2 = new Joueur (2,"Nobody",c);
        e.initEspace();
        e.play(j1,j2);
        System.exit(0);
    }
}