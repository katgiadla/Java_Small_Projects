public class Runs implements jade.content.Predicate {
    private Milage _milage;
    private Car _car;

    public Milage getMilage() {
        return _milage;
    }

    public void setMilage(Milage _milage) {
        this._milage = _milage;
    }

    public Car getCar() {
        return _car;
    }

    public void setCar(Car _car) {
        this._car = _car;
    }
}
