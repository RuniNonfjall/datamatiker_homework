package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int width = 10;
        int height = 10;
        BufferedImage img = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
        int x= 4;
        int y= 4;
        int color=-65536;

        Color myColor = new Color(255, 0, 255);
        color = myColor.getRGB();

        //int color= Color.RED.getRGB();
        //System.out.println(color);

        img.setRGB(x,y,color);
        ImageIO.write(img,"png", new File("image.png"));

    }
}
