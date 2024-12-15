public class Vehicle {
    DriveStrategy _driveObj;

    public Vehicle(DriveStrategy driveObj) {
        _driveObj = driveObj;
    }

    public void drive() {
        this._driveObj.drive();
    }
}
