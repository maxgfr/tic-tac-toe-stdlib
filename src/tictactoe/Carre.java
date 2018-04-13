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
public class Carre extends Figure {
    
    Color couleur;

    public Carre(Color couleur){
        this.couleur = couleur;
    }

    @Override
    public void draw(int x, int y){
        StdDraw.setPenColor(couleur);
        StdDraw.line(x, y, x + 1, y + 1);
        StdDraw.line(x, y + 1, x + 1, y);
    }

    
}
