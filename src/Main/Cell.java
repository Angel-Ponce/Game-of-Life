/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author angel_p11
 */
public class Cell extends JLabel {

    private boolean state;
    private int xPos, yPos;

    public Cell(boolean state, int xPos, int yPos) {
        this.state = state;
        this.xPos = xPos;
        this.yPos = yPos;
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
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
            this.setBackground(new Color(0, 0, 0));
        } else {
            this.setBackground(new Color(60, 63, 65));
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

    private void events() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("[x = " + xPos + "] [y = " + yPos + "]");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(new Color(0, 0, 0));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(new Color(60, 63, 65));
            }
        });
    }

}
