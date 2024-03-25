package springs.springcoffee.entities;

public enum Sensitivity {
    GLUTEN("gluten", 1),
    LACTOSE("lactose", 2),
    NUTS("nuts", 3),
    SUGAR("sugar", 4),
    CELERY("celery", 5),
    CILANTRO("cilantro", 6),
    DAIRY("dairy", 7);

    private String name;
    private int clinicalSerialNumber;

    Sensitivity(String name, int clinicalSerialNumber) {
        this.name = name;
        this.clinicalSerialNumber = clinicalSerialNumber;
    }

    public String getName() {
        return name;
    }

    public int getClinicalSerialNumber() {
        return clinicalSerialNumber;
    }

    @Override
    public String toString() {
        return "Sensitivity{" +
                "name='" + name + '\'' +
                ", clinicalSerialNumber=" + clinicalSerialNumber +
                '}';
    }
}
