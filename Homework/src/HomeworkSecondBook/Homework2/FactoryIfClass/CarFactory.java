package HomeworkSecondBook.Homework2.FactoryIfClass;
//Задание
// Сделать фабрику по производству машин по Диаграмме классов на слайде 22!

    public class CarFactory {

        public static Car buildCar(CarType model) {
            Car car =null;
            if (model == CarType.LUXURY){
                car =new LuxuryCar(CarType.LUXURY);
            }
            if (model == CarType.SEDAN){
                car =new SedanCar(CarType.SEDAN);
            }
            if (model == CarType.SMALL){
                car =new SmallCar(CarType.SMALL);
            }
            return car;
        }
        public static void main(String[] args) {

        CarFactory.buildCar(CarType.SMALL);
            CarFactory.buildCar(CarType.SEDAN);
           CarFactory.buildCar(CarType.LUXURY);

        }
}
