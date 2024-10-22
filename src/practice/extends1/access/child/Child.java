package practice.extends1.access.child;

import practice.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; //상속 관계 ore 같은 패키지
        //defaultValue = 1;
        //privateValue = 1;

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();

        printParent();
    }
}
