package ДЗ;

public class AdsService {
    private VehicleAd[] adList;

    public void setAdList(VehicleAd[] adList) {
        this.adList = adList;
    }

    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByBodyTypes(VehicleTypeByBodyTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByBodyTypes().equals(vehicleType)) {
                System.out.println("Advertisement ID: " + ad.getId() + " matches the filter. Vehicle type: "
                        + vehicleType.getTypeName() + ", filter attribute: " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Advertisement ID: " + ad.getId() + " does not match the filter. Vehicle type: "
                        + vehicleType.getTypeName() + ", filter attribute: " + vehicleType.getAttributeOfType() +
                        ", as it has vehicle type: " + ad.getVehicleTypeByBodyTypes().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByFuelTypes(VehicleTypeByFuelTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByFuelTypes().equals(vehicleType)) {
                System.out.println("Advertisement ID: " + ad.getId() + " matches the filter. Vehicle type: "
                        + vehicleType.getTypeName() + ", filter attribute: " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Advertisement ID: " + ad.getId() + " does not match the filter. Vehicle type: "
                        + vehicleType.getTypeName() + ", filter attribute: " + vehicleType.getAttributeOfType() +
                        ", as it has vehicle type: " + ad.getVehicleTypeByFuelTypes().getTypeName());
            }
        }
    }
}