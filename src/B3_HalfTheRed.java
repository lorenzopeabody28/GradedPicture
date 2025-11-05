public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;
    int random;
    int picture;

    public void go() {
        plane.loadBackGround("STP.jpeg");
        //  plane.showBackGround();

        for (int y = 0; y < 600; y = y + 1) {
            for (int x = 0; x < 600; x = x + 1) {
                plane.teleport(x, y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(x * 3 - 2, y * 3 - 2);
                plane.setPixelColor(red, x/3, blue);
                plane.teleport(x * 3 - 1, y * 3 - 1);
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

                }

                //if (blue > 50 && green > 50) {
                   // plane.setPixelColor(67, 1, 125);
                //}
                //else {
                   // plane.setPixelColor(red, green, x / 4);
               // }

                //plane.teleport(100, 100);
                //random = plane.random(0, 2);// doesn't include second number
                // plane.isTrail = true;
                // plane.pausetime = 0;
                // if (random == 0) {
                //     plane.circle(100);
                //  } else {
                //     plane.house(100);
                // }

            }
        }
    }




