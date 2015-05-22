package com.madsim.leap.tests;

import com.onformative.leap.LeapMotionP5;

import processing.core.PApplet;
import processing.core.PImage;

public class LeapImageTest01 extends PApplet {
	
	private static final long serialVersionUID = 1L;

	private LeapMotionP5 leap;
	
	public void setup() {
		size(640, 480);
		
		leap = new LeapMotionP5(this);
	}
	
	public void draw() {
		PImage l_img = leap.getLeftImage();
		if(l_img != null) {
			image(l_img, 0, 0, 640, 480);
		}
	}

}
