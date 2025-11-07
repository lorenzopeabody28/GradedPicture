public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("STP.jpeg");  //loads the background, which image will be enlarged

        for (int y = 0; y < 600; y = y + 1) {       //in RunMyProgram the height and width of the world was changed to 600 by 600
            for (int x = 0; x < 600; x = x + 1) {   //this nested for loops create large enough x and y to enlarge image
                plane.teleport(x, y);           //this takes the 1st pixel of the image
                red = plane.howMuchRed();           //the red, green, and blue variables take the original color from the original image
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(x * 3 - 2, y * 3 - 2);   //lines 15-32 fill in the enlarged pixel, as a single pixel was turned into 9, there are 8 different teleports to fill in those 8 newly created pixels
                plane.setPixelColor(red, x/3, blue);        //there is a plane.setPixelColor() after each teleport as each time it has to set that pixels color
                plane.teleport(x * 3 - 1, y * 3 - 1);      //in the plane.setPixelColor() the green variable is substituted for x/3 creating a magenta filter over the image
                plane.setPixelColor(red, x/3, blue);
                plane.teleport(x * 3, y * 3);
                plane.setPixelColor(red, x/3, blue);
                plane.teleport(x * 3 - 1, y * 3 - 2);
                plane.setPixelColor(red, x/3, blue);
                plane.teleport(x * 3 - 2, y * 3 - 1);
                plane.setPixelColor(red, x/3, blue);
                plane.teleport(x * 3 - 2, y * 3 - 3);
                plane.setPixelColor(red, x/3, blue);
                plane.teleport(x * 3 - 3, y * 3 - 2);
                plane.setPixelColor(red, x/3, blue);
                plane.teleport(x * 3 - 1, y * 3 - 3);
                plane.setPixelColor(red, x/3, blue);
                plane.teleport(x * 3 - 3, y * 3 - 1);
                plane.setPixelColor(red, x/3, blue);
                IfElse();   //if else statement changing 1 of the 9 pixels white or gray
                }




            }
        RepeatR();  //this is the Rhombus repeating pattern method, that will go over the image after and create the pattern
        circle2(50); //runs circle method, with the circles having a radius of 50
        }

    public void Rhombus () {   //this method creates a Rhombus
        plane.trailWidth = 3;
        plane.pausetime = 0;
        plane.isTrail = true;
        plane.setColor(200, 25, 5);
    plane.startingAngle(67);
    plane.move(50);
    plane.turn(135);
    plane.move(50);
    plane.turn(45);
    plane.move(50);
    plane.turn(135);
    plane.move(50);
    }
    public void RepeatR () {        //this method takes the Rhombus and uses it to create a cool pattern over the image
        for(int z = 0; z < 14; z = z+1) {
        for(int w = 0; w < 15; w = w+1)
        {
            plane.teleport(40*w, 46*z);
        Rhombus();
    }
    }
}
public void IfElse() {
        if (red + blue + green > 400) {         // if red blue and green color values are higher than 400
            plane.setPixelColor(255,255,255);  // then 1 of the 9 pixels will be turned white
    }
        else {                                      //otherwise
            plane.setPixelColor(150,150,150);   // 1 of the 9 pixels will be turned gray
        }

}
public void circle2 (int size) {        // this method creates 2 blue circles at the top of the person's head, that look like mickey mouse ears
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.pausetime = 0;
        plane.setColor(30, 75, 200);
        for(int v = 0; v < 72; v = v + 1) {
            plane.teleport(225,80);
            plane.move(size);
            plane.turn(5);
        }
    for(int u = 0; u < 72; u = u + 1) {
        plane.teleport(425,80);
        plane.move(size);
        plane.turn(5);
    }
}
}




