/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import edu.princeton.cs.introcs.StdDraw;

/**
 *
 * @author golfier
 */
public class Espace {

    private static Espace instance = null;
    private int [][] espace;
    private int nb_tours;
    
    
    protected Espace() {
       this.espace = new int[3][3];
       this.nb_tours = 0;
    }
    
    public static Espace getInstance() {
       if(instance == null) {
          instance = new Espace();
       }
       return instance;
    }
    
    public void initEspace () {
        StdDraw.setScale(0, 3);
        StdDraw.setPenRadius(0.008);
        for (int c = 0; c <= 3; c++) {
            StdDraw.line(c, 0, c, 3);
        }
        for (int c = 0; c <= 3; c++) {
            StdDraw.line(0, c, 3, c);
        }
    }
    
    public void play (Joueur j1, Joueur j2) {
        int x,y;
        while (nb_tours < 9) {
            /* TOUR */
            if (nb_tours % 2 == 1) {
                if (StdDraw.mousePressed()) {
                    x = (int) Math.floor(StdDraw.mouseX());
                    y = (int) Math.floor(StdDraw.mouseY());
                    if (this.espace[x][y] == 0) {
                        j1.draw(x,y);
                        this.espace[x][y] = j1.id_joueur;
                        StdDraw.show(500);
                        nb_tours++;
                    }
                    if (hasWon(j1.id_joueur)) {
                        System.out.println("Joueur "+j1.nom+" a gagné !");
                        return;
                    }
                }
                
            } else {
                if (StdDraw.mousePressed()) {
                    x = (int) Math.floor(StdDraw.mouseX());
                    y = (int) Math.floor(StdDraw.mouseY());
                    if (this.espace[x][y] == 0) {
                        j2.draw(x,y);
                        this.espace[x][y] = j2.id_joueur;
                        StdDraw.show(500);
                        nb_tours++;
                    }
                }
                if (hasWon(j2.id_joueur)) {
                        System.out.println("Joueur "+j2.nom+" a gagné !");
                        return;
                }
            }
            
        }
        System.out.println("Personne n'a gagné...");
    }
    
    public boolean hasWon (int id_joueur) {
        return this.espace[0][0] == id_joueur && this.espace[0][1] == id_joueur && this.espace[0][2] == id_joueur || 
                this.espace[1][0] == id_joueur && this.espace[1][1] == id_joueur && this.espace[1][2] == id_joueur ||
                this.espace[2][0] == id_joueur && this.espace[2][1] == id_joueur && this.espace[2][2] == id_joueur || 
                this.espace[0][0] == id_joueur && this.espace[1][0] == id_joueur && this.espace[2][0] == id_joueur ||
                this.espace[0][1] == id_joueur && this.espace[1][1] == id_joueur && this.espace[2][1] == id_joueur ||
                this.espace[0][2] == id_joueur && this.espace[1][2] == id_joueur && this.espace[2][2] == id_joueur ||
                this.espace[0][0] == id_joueur && this.espace[1][1] == id_joueur && this.espace[2][2] == id_joueur ||         
                this.espace[2][0] == id_joueur && this.espace[1][1] == id_joueur && this.espace[0][2] == id_joueur;
    }

    
}

