
//int currentX = 0, currentY = 0;
void setup() {
PImage face = loadImage("zombie.png");
size(500,500);
face.resize(480,480);
image(face, 0, 0);

}
void draw() {
  // Place 2 ellipses over the irises of the eyes in the draw method. 
  // you need to experiment with the location of the circles (x,y) and
  // the size of the circles - width, height.  so that they cover the eyes
  // in the image
  // also, give the circles a color using command: fill (red,green, blue).
  // pick values for r, g, b that you like.  ok?
ellipse(315,206, 155, 155);
ellipse(120, 185, 130, 130);
fill(#F54825);

// Use mouseX and mouseY to change the color of the irises when the mouse moves. 

// also Draw black pupils on top of the irises.
}
