/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author golfier
 */
public class Joueur {
    
    String nom;
    Figure figure;
    int id_joueur;

    public Joueur(int id_joeur, String nom, Figure f){
        this.nom=nom;
        this.figure = f;
        this.id_joueur = id_joeur;
    }
    
    public void draw (int x, int y) {
        this.figure.draw(x,y);
    }
}
