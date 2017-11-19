class Car {
    
    private int modelYear = -1;
    private String manufacturer;
    private String modelName;
    private String licensePlate = "";
    
    public Car(String manufacturer, String modelName) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
    }
    
    public Car(String manufacturer, String modelName, int modelYear, String licensePlate) {
        this(manufacturer, modelName);
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
    }

    public Car(String manufacturer, String modelName, int modelYear) {
        this(manufacturer, modelName);
        this.modelYear = modelYear;
    }

    public Car(String manufacturer, String modelName, String licensePlate) {
        this(manufacturer, modelName);
        this.licensePlate = licensePlate;
    }

    
    public String toString() {
        return modelYear + " " +manufacturer + " " + modelName + " " + licensePlate;
    }

    public static void main(String[ ] args) {
        System.out.println(new Car("nissan", "200sx"));
        System.out.println(new Car("nissan", "200sx", 1984));
        System.out.println(new Car("nissan", "200sx", "AMATS8"));
        System.out.println(new Car("nissan", "200sx", 1984, "AMATS8"));
        
        return;
    }
}
