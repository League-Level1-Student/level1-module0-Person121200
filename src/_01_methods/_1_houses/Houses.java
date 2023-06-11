package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	Random rand = new Random();
		
	public void house(String height, Color color) {
		
		int small = 0;
		if(height.equalsIgnoreCase("small")) {
			 small = 50;
		}
		if(height.equalsIgnoreCase("medium")) {
			 small = 100;
		}
		if(height.equalsIgnoreCase("big")) {
			 small = 150;
		}
		rob.setPenColor(color);
		rob.setAngle(0);
		rob.penDown();
		rob.move(small);
		if (height.equalsIgnoreCase("big")){
			flatroof();
		}
		else {
			pointyroof();
		}
		
		rob.setAngle(180);
		rob.move(small);
		rob.setAngle(90);
		rob.move(20);
	}
	
	public void flatroof() {
		rob.setAngle(90);
		rob.move(50);
	}
	
	public void pointyroof() {
		rob.setAngle(45);
		rob.move(35);
		rob.setAngle(135);
		rob.move(35);
	}
	
	public void run() {
		rob.setWindowColor(Color.BLACK);
		rob.setX(50);
		rob.setY(500);
		rob.setSpeed(30);
		for(int i = 1; i <= 9; i++) {
			int sizes = rand.nextInt(3);
			if(sizes == 0) {
				
			house("small", Color.blue);
		}
			else if(sizes == 1) {
				
			house("medium", Color.RED);
		}
			else if(sizes == 2) {
			house("big", Color.green);
		}

		// Check the recipe to find out what code to put here
		
		}
		
	}
}
