package ДЗ;

public class PassengerType  extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
