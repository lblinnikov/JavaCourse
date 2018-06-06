package random.mytraining;

public class PassengerCar extends Car {

    public PassengerCar(String licencePlate, String productionYear, String make, String model, String VIN, String holder,
                        String owner, String type, String variant, String version, Integer fullWeight, Integer selfWeight,
                        String category, Integer powerToWeightRatio, Integer displacement, Integer maxPower, String fuelType,
                        String color, String seatCount, String standingCount) {
        super(licencePlate, productionYear, make, model, VIN, holder,
                owner, type, variant, version, fullWeight, selfWeight,
                category, powerToWeightRatio, displacement, maxPower, fuelType,
                color, seatCount, standingCount);
    }

    @Override
    public String getLicencePlate() {
        return licencePlate;
    }

    @Override
    public String getProductionYear() {
        return productionYear;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getVIN() {
        return VIN;
    }

    @Override
    public String getHolder() {
        return holder;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getVariant() {
        return variant;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public Integer getFullWeight() {
        return fullWeight;
    }

    @Override
    public Integer getSelfWeight() {
        return selfWeight;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public Integer getPowerToWeightRatio() {
        return powerToWeightRatio;
    }

    @Override
    public Integer getDisplacement() {
        return displacement;
    }

    @Override
    public Integer getMaxPower() {
        return maxPower;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSeatCount() {
        return seatCount;
    }

    @Override
    public String getStandingCount() {
        return standingCount;
    }
}
