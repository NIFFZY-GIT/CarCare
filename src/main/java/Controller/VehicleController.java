
package Controller;

import Model.Vehicle;

public class VehicleController {

    Vehicle VehicleObj;

    public Vehicle addVehicle(String VID, String CoustomerName, String CustomerID, String CustomerMail, int Quantity, double VPrice) {
        VehicleObj = new Vehicle(VID, CoustomerName, CustomerID,CustomerMail, Quantity, VPrice);
        return VehicleObj;
    }
}
