package com.car;

import java.awt.*;

public class RedCar {

    private static final int MOVE = 10;
    private int x, y;

    public RedCar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Drawing the car
    public void drawCar(Graphics g) {
        g.setColor(Color.GREEN); // Roof
        g.fillRect(x + 10, y - 20, 60, 20);
        g.setColor(Color.RED); // Body
        g.fillRect(x, y, 100, 30);
        g.setColor(Color.BLACK); // wheel
        g.fillOval(x + 10, y + 20, 15, 15); // left wheel
        g.fillOval(x + 75, y + 20, 15, 15); // right wheel
    }

    // Method that makes the car move and reposition the car if he has reached the maximum width
    public void move() {
        if (x == new Frame().FRAME_WIDTH + 100) {
            x = 0;
        } else {
            x += MOVE;
        }
    }
}
