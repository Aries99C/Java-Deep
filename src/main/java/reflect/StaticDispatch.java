package reflect;

import reflect.entry.AnotherDerived;
import reflect.entry.Base;
import reflect.entry.Derived;

public class StaticDispatch {
    public void invokeFunc(Base base) {
        System.out.println("Base");
    }

    public void invokeFunc(Derived derived) {
        System.out.println("Derived");
    }

    public void invokeFunc(AnotherDerived anotherDerived) {
        System.out.println("Another Derived");
    }

    public static void main(String[] args) {
        Base base = new Base();
        Base derived = new Derived();
        Base another = new AnotherDerived();

        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.invokeFunc(base);
        staticDispatch.invokeFunc(derived);
        staticDispatch.invokeFunc(another);
    }
}
