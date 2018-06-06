package random.mytraining;

abstract class Car implements Vehicle {

    protected String licencePlate;
    protected String productionYear;
    protected String make;
    protected String model;
    protected String VIN;
    protected String holder;
    protected String owner;
    protected String type;
    protected String variant;
    protected String version;
    protected Integer fullWeight;
    protected Integer selfWeight;
    protected String category;
    protected Integer powerToWeightRatio;
    protected Integer displacement;
    protected Integer maxPower;
    protected String fuelType;
    protected String color;
    protected String seatCount;
    protected String standingCount;

    public Car(String licencePlate, String productionYear, String make, String model, String VIN, String holder, String owner,
               String type, String variant, String version, Integer fullWeight, Integer selfWeight, String category,
               Integer powerToWeightRatio, Integer displacement, Integer maxPower, String fuelType, String color,
               String seatCount, String standingCount) {
        this.licencePlate = licencePlate;
        this.productionYear = productionYear;
        this.make = make;
        this.model = model;
        this.VIN = VIN;
        this.holder = holder;
        this.owner = owner;
        this.type = type;
        this.variant = variant;
        this.version = version;
        this.fullWeight = fullWeight;
        this.selfWeight = selfWeight;
        this.category = category;
        this.powerToWeightRatio = powerToWeightRatio;
        this.displacement = displacement;
        this.maxPower = maxPower;
        this.fuelType = fuelType;
        this.color = color;
        this.seatCount = seatCount;
        this.standingCount = standingCount;
    }
}
