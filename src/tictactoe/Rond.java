/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/**
 *
 * @author golfier
 */
public class Rond extends Figure {
    

    Color couleur;

    public Rond(Color couleur){
        this.couleur = couleur;
    }


    @Override
    public void draw(int x, int y){
        StdDraw.setPenColor(couleur);
        StdDraw.circle(x + 0.5, y + 0.5, 0.5);
    }
  
}
