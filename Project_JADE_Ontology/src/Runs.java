import jade.content.Predicate;

public class Runs implements jade.content.Predicate {
    private Milage _milage;
    private Car _car;

    public Milage getMyMilaage() {
        return _milage;
    }

    public void setMyMilaage(Milage myMilaage) {
        this._milage = myMilaage;
    }

    public Car get_car() {
        return _car;
    }

    public void set_car(Car _car) {
        this._car = _car;
    }
}
