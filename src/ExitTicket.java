public class ExitTicket extends World {

    int random;
// todo: add a for loop that runs 4 times (optinal number 0-4, or 1-5)
    // put the distance stuff in the for loop
    // add a plane.turn(90); after the distance move
    public void go() {

        plane.isTrail = true;
        for(int x = 0; x<4; x=x+1){
            random = plane.random(1, 100);
            plane.move(random);
            plane.turn(90);
        }
    }


}
//make a method called us
