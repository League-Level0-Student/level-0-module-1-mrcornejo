PImage pepperoni;
void setup() {
  pepperoni = loadImage("pepperoni.png");
    size(300,300);
    background(200,200,200);
}
void draw() {
    fill(#E8BF6C);
    ellipse(150,150,280,280);
    fill(#E3454A);
    ellipse(150,150,260,260);
    fill(#F2D584);
    ellipse(150,150,250,250);
    image(pepperoni,200,200);
    image(pepperoni,200,200);
    image(pepperoni,200,200);
    image(pepperoni,200,200);
    image(pepperoni,200,200);
}
