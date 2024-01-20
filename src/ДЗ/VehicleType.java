package ДЗ;

public class VehicleType {
    protected String attribute;

    public VehicleType(String attribute) {
        this.attribute = attribute;
    }
    public String getAttributeOfType() {
        return attribute;
    }
    public String getTypeName() {
        return "Название какого-либо типа транспортного средства";
    }
}