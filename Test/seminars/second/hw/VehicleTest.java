package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach void setUp(){
        car = new Car("Ford", "Focus",2008);
        motorcycle = new Motorcycle("Honda","Shadow aero", 2023 );
    }

//  Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя
//  оператор instanceof).
    @Test
    public void testCarIsInstanceOfVehicle(){
        assertTrue(car instanceof Vehicle);
    }

//   Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarHasFourWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

//   Проверить, что объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotorcycleHasTwoWheels(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

// Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarHasSpeed60InTestDriveMode(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

// Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод
// testDrive()).
    @Test
    public void testMotorcycleHasSpeed75InTestDriveMode(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

//  Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
//  машина останавливается (speed = 0).
    @Test
    public void testCarStopsInParkMode(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

//  Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
//  мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcycleStopsInParkMode(){
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}