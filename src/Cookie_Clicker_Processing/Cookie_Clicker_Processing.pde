int cookies = 0;
boolean x;
void setup() {
size(500,500);
textSize(30);
}

void draw() {
  background(255,255,255);
if(mousePressed==true){
fill(77,50,5);
ellipse(250,250,190,190);
}else {
fill(77,50,5);
ellipse(250,250,200,200);
fill(0,0,0);
}
text(cookies + " Cookies",190,50);
}

void mouseClicked() {
  if(dist(250,250,mouseX,mouseY)<100){
cookies = cookies+1;
  }
}