package com.car;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Rendering extends JPanel {

    private BlueCar Bluecar = new BlueCar(100, 350);
    private RedCar Redcar = new RedCar(200, 410);

    public Rendering() {

        Timer BlueAction = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bluecar.move();
                repaint();
            }
        });
        Timer RedAction = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Redcar.move();
                repaint();
            }
        });
        BlueAction.start();
        RedAction.start();
    }

    // Override the method by adding our options.
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(myImage(), 0, 0, null);
        Bluecar.drawCar(g);
        Redcar.drawCar(g);
    }


    // Method that returns image if he found one/
    private Image myImage() {
        Image image = null;

        try {
            image = ImageIO.read(new File("src/road.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
}