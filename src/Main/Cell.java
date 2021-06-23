/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
//import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author angel_p11
 */
public class Cell extends JLabel {

    private boolean state;
    private int xPos, yPos;
    private final Color live = new Color(0, 0, 0);
    private final Color dead = new Color(60, 63, 65);

    public Cell(boolean state, int xPos, int yPos) {
        this.state = state;
        this.xPos = xPos;
        this.yPos = yPos;
        super.setOpaque(true);
        this.chooseBackgroud();
        this.events();
    }

    public boolean getState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
        this.chooseBackgroud();
    }

    private void chooseBackgroud() {
        if (state) {
            this.setBackground(live);
        } else {
            this.setBackground(dead);
        }
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public ArrayList<Cell> getNeighbors(Cell[][] cells) {
        ArrayList<Cell> neighbors = new ArrayList();
        try {
            neighbors.add(cells[xPos - 1][yPos - 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Nothing
        }
        try {
            neighbors.add(cells[xPos][yPos - 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Nothing
        }
        try {
            neighbors.add(cells[xPos + 1][yPos - 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Nothing
        }
        try {
            neighbors.add(cells[xPos - 1][yPos]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Nothing
        }
        try {
            neighbors.add(cells[xPos + 1][yPos]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Nothing
        }
        try {
            neighbors.add(cells[xPos - 1][yPos + 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Nothing
        }
        try {
            neighbors.add(cells[xPos][yPos + 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Nothing
        }
        try {
            neighbors.add(cells[xPos + 1][yPos + 1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //Nothing
        }
        return neighbors;
    }

    private void events() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("[x = " + xPos + "] [y = " + yPos + "]");
                if (getState()) {
                    setState(false);
                } else {
                    setState(true);
                }
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(live);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                chooseBackgroud();
            }
        });
    }

}
