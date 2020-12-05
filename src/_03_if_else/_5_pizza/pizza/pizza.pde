PImage pepperoni;
void setup() {
  pepperoni = loadImage("pepperoni.png");
    size(300,300);
    background(200,200,200);
}
void draw() {
  // hi miranda!  yummy pizza!  maybe add more pepperoni, and move around
  // their locations to make it look better.  you can alos resize them
  // if they look too big...any questions so far? no thank  YUMMY!
  // ok - now it says: only show toppings once mouse is pressed - know how
  // to do that?
    fill(#E8BF6C);
    ellipse(150,150,280,280);
    fill(#E3454A);
    ellipse(150,150,260,260);
    fill(#F2D584);
    ellipse(150,150,250,250);
if (mousePressed){
  image(pepperoni,153,155);
    image(pepperoni,50,40);
    image(pepperoni,140,40);
    image(pepperoni,180,80);
    image(pepperoni,80,180);
    image(pepperoni,19,114);
    image(pepperoni,100,110);
  //only show toppingis pressed YES - so move the lines of code from above that
  //showed the toppings - put that code inside here instead
  // ALMOST1  now get rid of the lines above 
  //do I go to the next thing YES do i just exit SAVE first. do i go to file and then save
}
}
