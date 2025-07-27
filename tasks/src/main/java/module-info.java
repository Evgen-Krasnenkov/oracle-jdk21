module org.kras {
    exports com.name to greeting;
    uses com.trasnport.vehicle.cars.Car;
    requires com.transport.vehicle;
    requires java.logging;
    requires jdk.compiler;
    requires java.desktop;
}