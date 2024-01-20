package dz;

public class VehicleTypeByBodyTypes extends VehicleType {
    public VehicleTypeByBodyTypes(String attribute) {
        super(attribute);
    }
    public String getTypeName() {
        return attribute;
    }
}
