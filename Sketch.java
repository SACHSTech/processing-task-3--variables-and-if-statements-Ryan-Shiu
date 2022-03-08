import processing.core.PApplet;
  /**
  * A program Sketch.java that randomly draws an object on screen and adds dynamics depending on where.
  * @author: Ryan Shiu
  */

public class Sketch extends PApplet {
	float houseX = random(0, width);
  float houseY = random(0, height);
	
  public void settings() {
    // Size of sketch board
    size(400, 400);
  }
    
  public void setup() {
    // Background Colour
    background(66, 228, 253);
  }
  
  public void draw() {
    // Adding additional if statements with logical operators to give my drawing        dynamics
    if(houseX < 200 && houseY < 200){
      background(0, 0, 0);
      var blackBackgroundText = "House is in the top left corner";
      text(blackBackgroundText, 20, 300);
    }
    if(houseX > 200 || houseY > 200){
      var blackBackgroundText = "Quit moving the house";
      text(blackBackgroundText, 65, 300);
    }
    
    // Drawing the square of the house
    fill(165, 22, 23);
    rect(houseX, houseY,(float) (width/2.6),(float)     
    (height/2.6)); 

    // Drawing the chimney
    fill(198, 109, 71);
    rect((float) (houseX+100),(float) (houseY-100), width/16, height/8);
    
    // Drawing the top triangle of the house
    fill(165, 22, 23);
    triangle(houseX-25, houseY, houseX+75, houseY-100, houseX+175, houseY);

    // Drawing the Grass
    fill(0, 255, 0);
    rect(houseX-95, houseY+150, (float) (width/0.8),(float) (height/5.7));

    // Drawing the top window
    fill(204, 255, 255);
    ellipse(houseX + 75, houseY - 50, width/10, height/10);

    // Drawing the left window
    fill(204, 255, 255);
    rect(houseX + 15, houseY + 10, width/10, height/10);
    
    // Drawing the right window
    fill(204, 255, 255);
    rect(houseX + 95, houseY + 10, width/10, height/10);

    // Drawing the Door
    fill(204, 102, 0);
    rect(houseX + 58, houseY + 100,(float) (width/11.4),   
    height/8);

    // Setting time variables
    var currentHr = hour();
    var currentMin = minute();
    var currentSec = second();
  
    var currentTime = currentHr + ':' + nf(currentMin, 2) + ':' + 
    nf(currentSec, 2);

    noStroke();
    textSize(24);
    //Outputs the Time in the bottom right corner
    text(currentTime, 250, 370);
  }
}