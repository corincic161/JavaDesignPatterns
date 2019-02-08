package main.Manufacturers;

import main.Car;
import main.Enums.CarType;
import main.CarTypes.LuxuryCar;
import main.CarTypes.SavCar;
import main.CarTypes.SedanCar;
import main.Enums.Manufacturer;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.Calendar;
import java.util.Random;

public class AudiCarFactory {
    public static Car buildCar(CarType type){
        Car car;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int modelIndex = new Random().nextInt(99) * 100;

        switch (type){
            case SEDAN:
                car = new SedanCar(Manufacturer.AUDI, "S" + modelIndex, year);
                break;
            case SAV:
                car = new SavCar(Manufacturer.AUDI, "X" + modelIndex, year);
                break;
            case LUXURY:
                car = new LuxuryCar(Manufacturer.AUDI, "L" + modelIndex, year);
                break;
            default:
                throw new NotImplementedException();
        }
        return car;
    }
}
