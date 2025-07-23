package com.trasnport.vehicle.cars;

/*

Choose the correct module-info.java file for the Car interface:

requires com.transport.vehicle.cars;
exports com. transport.vehicle.cars;
provides com. transport.vehicle.cars.imp1.CarImpl for com.transport.vehicle.cars.Car; provides com.transport.vehicle.cars.Car with com.transport.vehicle.cars.impl.CarImpl;
exports com. transport.vehicle;
requires com. transport.vehicle.cars.car:
exports com. transport.vehicle.cars.Car;
 */

public interface Car {
    int getSpeed();
}
