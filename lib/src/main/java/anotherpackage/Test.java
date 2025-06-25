package anotherpackage;

import com.demo_2.lib.Cars;

public class Test {
    void justTesting(){
//        // 45. Modifiers Topic
//        Cars yellowCar = new Cars("Audi", 120, 2022);
//        yellowCar.model = "Audi";
//        yellowCar.speed = 120;
//        yellowCar.year = 2022;
//
//        yellowCar.accelerate();

        // 46. Encapsulation
        Cars yellowCar = new Cars("Audi", 120, 2023);
        yellowCar.model = "Audi";
        yellowCar.setYear(2023);
        yellowCar.setSpeed(300);
        yellowCar.accelerate();
    }
}
