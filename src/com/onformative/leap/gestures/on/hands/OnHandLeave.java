package com.onformative.leap.gestures.on.hands;

import com.leapmotion.leap.Frame;
import com.onformative.leap.LeapMotionP5;
import com.onformative.leap.gestures.Gesture;

public class OnHandLeave extends Gesture {
  public OnHandLeave(LeapMotionP5 leap) {
    super(leap);
    // TODO Auto-generated constructor stub
  }

  public boolean check() {
    Frame lastFrame = leap.getLastFrame();
    Frame currentFrame = leap.getFrame();
    int lastFrameHandCount = leap.getHandCount(lastFrame);
    int currentFrameHandCount = leap.getHandCount(currentFrame);
    if (lastFrameHandCount > currentFrameHandCount) {
      return true;
    }

    return false;
  }

  public String getShortname() {
    return "onhandleave";
  }
}