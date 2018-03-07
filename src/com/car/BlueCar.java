package com.car;

import javax.swing.*;
import java.awt.*;

public class BlueCar extends JApplet {

    private static final int MOVE = 10;
    private int x, y;

    public BlueCar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Drawing the car
    public void drawCar(Graphics g) {
        g.setColor(Color.PINK); // Roof
        g.fillRect(x + 30, y - 20, 60, 20);
        g.setColor(Color.BLUE); // Body
        g.fillRect(x, y, 100, 30);
        g.setColor(Color.BLACK); // wheel
        g.fillOval(x + 10, y + 20, 15, 15); // left wheel
        g.fillOval(x + 75, y + 20, 15, 15); // right wheel
    }

    // Method that makes the car move and reposition the car if he has reached the maximum width
    public void move() {
        if (x == -100) {
            x = new Frame().FRAME_WIDTH;
        } else {
            x -= MOVE;
        }
    }
}