public class A1_HowToMove extends World {




    public void go() {
        square(100);
        rteleport();
        square(250);
        //for(int x=0;x<5;x=x+1){
       // System.out.println("x: " + x);
      //  rteleport();
      //  house(100);
    }


    //this makes a square
    public void square(int size){
        plane.pausetime = 1;
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.turn(270);
        plane.move(size);
        plane.turn(270);
        plane.move(size);
        plane.turn(270);
        plane.move(size);
        plane.turn(270);
        plane.move(size);
    }
    public void triangle(int size){
        plane.pausetime = 0;
        plane.isTrail = true;
        plane.startingAngle(240);
        plane.move(size);
        plane.turn(120);
        plane.move(size);
        plane.turn(120);
        plane.move(size);

    }
    public void house(int size){
        triangle(size);
        square(size);

    }
    public void rwidth(){
        int width;
        width=plane.random(0,10);
        plane.trailWidth = width;
    }
    public void rcolor(){
        int color;
        color=plane.random(0,255);
        plane.setColor(color, color,color);
    }
    public void rteleport(){
        int teleport;
        teleport=plane.random(0,1000);
        plane.teleport(teleport,teleport);
    }


}

