public class B0_BasicLoop extends World {


    public void go() {
        plane.isTrail=true;
        plane.pausetime = 0;
        plane.trailWidth=1;
        plane.teleport(0,1);

        for (int x = 0; x < 255; x = x + 1) { //x controls how many rows
            plane.teleport(0, x);

            for (int y = 0; y < 127; y = y + 1) { //y controls how many columns
                System.out.println("y: " + y); //y parameter must be half of x's parameter
                plane.startingAngle(0);
                plane.setColor(y+1, x,50);
                plane.square(1);
                plane.move(1);
            }
        }
    }
    public void rcolor (){
        int rcolor;
                rcolor=plane.random(0,255);
                plane.setColor(rcolor, rcolor, rcolor);

    }
    public void rowofsquares(){
        for (int x = 0; x < 10; x = x + 1) {
            System.out.println("x: " + x);
            plane.isTrail = false;
            plane.startingAngle(0);
            plane.square(100);
            plane.move(100);

    }
}
}
