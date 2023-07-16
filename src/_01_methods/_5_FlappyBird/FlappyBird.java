package _01_methods._5_FlappyBird;

import java.awt.Color;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    int x = 50;
    int y = 300;
    int pipeX = 600;
    int birdYVelocity = -10;
    int gravity = 1;
    int upperPipeHeight = (int) random(100, 400);
    int pipeGap = (int) random(150, 300);
    int lowerY = upperPipeHeight + pipeGap;
    int score = 0;
    


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
    	rect(pipeX, 0, 50,upperPipeHeight);
    	rect(pipeX, lowerY, 50, 525);
    	pipeX-=10;
    	teleportPipes();
    	skyGround();
    	Score(score);
    	if (intersectsPipes()) {
    		JOptionPane.showMessageDialog(null, "YOU DIED!!!");
    		JOptionPane.showMessageDialog(null, "BETTER LUCK NEXT TIME!!!");
    		System.exit(0);
    	}
    	
    	
    }
    public void teleportPipes() {
    	if(pipeX <= -50) {
    		score+=1;
    		pipeX = 800;
    	    upperPipeHeight = (int) random(100, 400);
    	    pipeGap = (int) random(150, 300);
    	    lowerY = upperPipeHeight + pipeGap;
    	}
    }
    public void skyGround() {
    	fill(0, 0, 0);
    	stroke(0, 0, 0);
    	rect(0, HEIGHT-10, WIDTH, 10);
    	rect(0, 0, WIDTH, 10);
    	if(y >= HEIGHT) {
    		JOptionPane.showMessageDialog(null, "YOU FELL!!!");
    		JOptionPane.showMessageDialog(null, "BETTER LUCK NEXT TIME!!!");
    		System.exit(0);
    	}
    	if(y <= 0) {
    		JOptionPane.showMessageDialog(null, "STOP TRYING TO GLITCH OUT OF THE GAME, DYE!!!");
    		JOptionPane.showMessageDialog(null, "BETTER LUCK NEXT TIME!!!");
    		System.exit(0);
    	}
    }
    public void Score(int variable) {
    	fill(255, 255, 255);
    	text("Score = "+variable, 10, 30);
    }
    
    boolean intersectsPipes() { 
        if (y < upperPipeHeight && x > pipeX && x < (pipeX+50)){
           return true; }
       else if (y>lowerY && x > pipeX && x < (pipeX+50)) {
           return true; }
       else { return false; }
    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
