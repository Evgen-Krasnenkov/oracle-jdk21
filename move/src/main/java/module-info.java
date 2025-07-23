module com.transport.vehicle {
    exports com.trasnport.vehicle.cars;
    provides com.trasnport.vehicle.cars.Car with
            com.trasnport.vehicle.cars.impl.CarImpl,
            com.trasnport.vehicle.cars.impl.FastCar;
}