class Main{
    public static void main(String[] args) {
        Car car = new Car("AMQ123", new Account("Marina", "2342342"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("AM098", new Account("Mar", "MMM"));
        car.passenger = 3;
        car2.printDataCar();
    }
}