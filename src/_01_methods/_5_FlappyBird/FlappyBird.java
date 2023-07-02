package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 50;
    int y = 300;
    int x1 = 600;
    int y1 = 50;
    int birdYVelocity = -10;
    int gravity = 1;
    int upperPipeHeight = (int) random(100, 400);


    @Override
    public void settings() {
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
    	
    }


    @Override
    public void draw() {
    	background(100, 0, 255);
    	fill(255, 0, 0);
    	stroke(255, 0, 0);
    	ellipse(x, y, 50, 50);
    	y+=birdYVelocity;
    	birdYVelocity+=gravity;
    	if(mousePressed == true) {
    		birdYVelocity=-10;
    	}
    	fill(0, 255, 0);
    	stroke(0, 255, 0);
    	rect(x1, y1, 50,upperPipeHeight);
    	x1-=10;
    	teleportPipes();
    	
    }
    public void teleportPipes() {
    	if(x1 <= 0) {
    		x1 = 800;
    	    upperPipeHeight = (int) random(100, 400);
    	}
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
