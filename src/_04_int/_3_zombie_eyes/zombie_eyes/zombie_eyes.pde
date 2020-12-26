
//int currentX = 0, currentY = 0;
void setup() {
PImage face = loadImage("zombie.jpeg");
size(500,500);
face.resize(500,500);
image(face, 0, 0);

}
void draw() {
  // Place 2 ellipses over the irises of the eyes in the draw method. 
  // you need to experiment with the location of the circles (x,y) and
  // the size of the circles - width, height.  so that they cover the eyes
  // in the image
  // also, give the circles a color using command: fill (red,green, blue).
  // pick values for r, g, b that you like.  ok?
ellipse(315,200, 155, 155);
ellipse(130, 185, 130, 130);
fill(#F54825);
ellipse(315,200,77,77);
ellipse(130,185,65,65);
fill(#FFFFFF);
// Use mouseX and mouseY to change the color of the irises when the mouse moves. 
String mouseX="#F54825";
String mouseY="#FFFFFF";
if (mouseX.equals("#F54825"))     {
  if (mouseY.equals("#FFFFFF"))   {
    println("#F54825");
  }
  else {
   println("#FFFFFF");
  }
}
}
