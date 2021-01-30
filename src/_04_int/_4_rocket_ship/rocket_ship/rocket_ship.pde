int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    background(0, 0, 40); 
    
}

void draw() {
     background(0, 0, 40); 
    y = y - 30;
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    //moon
    fill(#E3E0E0);
    ellipse(64,64,140,140);
    fill(#D3D1D1);
    ellipse(50,30,36,36);
    fill(#D3D1D1);
    ellipse(110,60,20,20);
    fill(#D3D1D1);
    ellipse(50,90,15,15);
    //stars 
    fill(#F8FA9F);
    ellipse(200,47,12,12);
    fill(#F8FA9F);
    ellipse(750,120,12,12);
    fill(#F8FA9F);
    ellipse(275,200,12,12);
    fill(#F8FA9F);
    ellipse(500,30,12,12);
    fill(#F8FA9F);
    ellipse(500,300,12,12);
    fill(#F8FA9F);
    ellipse(180,460,12,12);
    fill(#F8FA9F);
    ellipse(530,460,12,12);
}
