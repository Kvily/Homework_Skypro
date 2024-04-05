package course2.lesson3_polymorphism_interfaces;

public class Car extends Transport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
      super.service();
        checkEngine();
    }
}
