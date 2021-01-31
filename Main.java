package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;


public class Main {

    public static void main(String[] args) {
        final String title = "Compound Interest Calculator";
        final int height = 600;
        final int width = 355;


        //Creating the frame.
        JFrame frame = new JFrame(title);
        JButton calculate = new JButton("Calculate");
        JButton graph = new JButton("Graph");

        calculate.setBounds(70, 400, 195, 50);
        frame.add(calculate);
        frame.setLayout(null);
        frame.setVisible(true);

        graph.setBounds(70, 450, 195, 50);
        frame.add(graph);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);

        //Creating the canvas.
        Canvas canvas = new Canvas();

        canvas.setSize(width, height);
        canvas.setBackground(Color.WHITE);
        canvas.setVisible(true);
        canvas.setFocusable(false);


        //Putting it all together.
        frame.add(canvas);

        canvas.createBufferStrategy(3);

        boolean running = true;

        BufferStrategy bufferStrategy;
        Graphics graphics;

        while (running) {
            bufferStrategy = canvas.getBufferStrategy();
            graphics = bufferStrategy.getDrawGraphics();
            graphics.clearRect(0, 0, width, height);

            graphics.setColor(Color.BLACK);

            graphics.setFont(new Font("Arial", Font.PLAIN, 15));
            graphics.drawString("*This is an Compound Interest Calculator.", 5, 15);
            graphics.setFont(new Font("Arial", Font.PLAIN, 20));
            graphics.drawString("Compound Interest Calculator:", 45, 75);

            bufferStrategy.show();
            graphics.dispose();
        }




    }
}