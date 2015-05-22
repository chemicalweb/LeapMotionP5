package com.madsim.leap.tests;

import com.onformative.leap.LeapMotionP5;

import processing.core.PApplet;
import processing.core.PImage;

public class LeapImageTest01 extends PApplet {
	
	private static final long serialVersionUID = 1L;

	private LeapMotionP5 lmp5;
	
	public void setup() {
		size(800, 600);
		
		lmp5 = new LeapMotionP5(this);
	}
	
	public void draw() {
		PImage img = lmp5.getImage();
		if(img != null) {
			image(img, 0, 0);
		}
	}

}
