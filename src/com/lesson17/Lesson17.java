package com.lesson17;

import com.lesson10hw.Passenger;
import com.shape.Circle;
import com.shape.MyCustomException;
import com.shape.Square;
import com.shape.Triangle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Lesson17 {
    public static void main(String[] args) throws MyCustomException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Triangle triangle = new Triangle(1, 1, 1);
        Class clazz = triangle.getClass();
        String classSimpleName = clazz.getSimpleName();
        String className = clazz.getName();
        System.out.println(classSimpleName);
        System.out.println(className);
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " Modifier: " + field.getModifiers()
                    + " type: " + field.getType());
        }
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("Name: " + method.getName() +
                    " return type: " + method.getReturnType() +
                    " parameter count: " + method.getParameterCount()
            );
        }
        Passenger passenger = new Passenger();


        System.out.println("Methods count: " + passenger.getClass().getMethods().length);
        Passenger instanceOfPassenger = (Passenger) getDefaultConstructor(passenger.getClass())
                .newInstance();
        System.out.println(instanceOfPassenger);

        final List<Square> squares = new ArrayList<>();
        final Constructor defaultForSquare = getDefaultConstructor(Square.class);
        for (int i = 0; i < 1000; i++) {
            squares.add((Square) defaultForSquare.newInstance());
        }
        System.out.println(squares.size()); // -> 1000;

        Circle circle = new Circle(8);
        // circle.mySuperSecretMethod();
        final Class<? extends Circle> circleClass = circle.getClass();
        final Method[] circleClassMethods = circleClass.getDeclaredMethods();
        Method secretMethod = null;
        for (Method method : circleClassMethods) {
            final String methodName = method.getName();
            if (methodName.toUpperCase().contains("SECRET")) {
                secretMethod = method;
                break;
            }
        }
        secretMethod.setAccessible(true);
        secretMethod.invoke(circle);

        //Create a new class with (Foo): 2 fields (String str, Double dbl), 2 constructors.
        // 1st constructor without parameters and 2nd with all parameters.
        // Create 2 instances of that class programmatically
        // via reflection(not explicitly call a constructor!),
        // use Class.newInstance() and its combination.

        Constructor constructor = null;
        constructor.newInstance();
        constructor.newInstance("FooString", 20d);

        Method MethodFoo = null;
        MethodFoo.getClass(LessonHW.Foo);

    }


    private static Constructor getDefaultConstructor(Class clazz) {
        for (Constructor constructor : clazz.getConstructors()) {
            if (constructor.getParameterCount() == 0) {
                return constructor;
            }
        }
        return null;
    }

}
