package lamdaExpression;

public class LambdaIntro {
    public static void main(String[] args) {
        //Lambda is an instance of the Functional Interface

//        Moveable moveXmile = new DistantMover();
//        moveXmile.move(15);
//
//        Moveable moveShort = new ShortDistanceMover();
//        moveShort.move(5);

//        moveAction(moveXmile);
//        moveAction(moveShort);

        Moveable moveXmile = new Moveable() {
            //in this example we use Anonymous Inner Class
            @Override
            public void move(int mile) {
                System.out.println("moving " + mile);

            }
        };

        //use Lambda

        Moveable movewithLambda = (int mile) -> {
            System.out.println("moving " + mile);
        };
        //Lambda is an instance of the Functional Interface Moveable


        Moveable moveShort = mile ->
                System.out.println("moving short mile " + mile); //replacing entirely Anonymous inner class
        moveAction(mile ->
                System.out.println("moving short mile " + mile));
        moveAction(movewithLambda);

        System.out.println("___________________");

        Measurable m1 = () -> System.out.println("measuring Table"); //created m1 object using Lambda
        Measurable m2 = () -> System.out.println("measuring Desk");
        Measurable m3 = () -> {
            System.out.println("measuring Furniture 1 ");
            System.out.println("measuring Furniture 2");
        };

        m1.measure();
        m2.measure();
        m3.measure();

        System.out.println("____________");

        Computable adder = (num1, num2) -> System.out.println("adding result " + (num1 + num2));
        adder.compute(34,4);

        Computable multiplier = (num1, num2) -> System.out.println("multiplier result " + (num1 * num2));
        multiplier.compute(34,4);


        System.out.println("______________");

        Flyable drone = mile -> mile >10;

        System.out.println(drone.flyHigh(12)); //returning true

        Flyable plane = mile -> mile < 10 && mile % 5 ==0;
        System.out.println(plane.flyHigh(8));  //false

    }

    public static void moveAction(Moveable moveable) {
        moveable.move(100);
    }
}
