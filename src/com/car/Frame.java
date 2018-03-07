package com.car;

import javax.swing.*;

public class Frame {

    final int FRAME_WIDTH = 500;
    final int FRAME_HEIGHT = 500;

    public void run() {
        JFrame frame = new JFrame();

        // Add Class rendering to interact with the frame
        frame.add(new Rendering());

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        frame.setTitle("Car Animation");


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);

        // center the gui
        frame.setLocationRelativeTo(null);
    }
}
