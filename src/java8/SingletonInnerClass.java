package java8;

public class SingletonInnerClass {

    private SingletonInnerClass(){}
    private static class SingletonInnerClassInner {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }
    public static SingletonInnerClass getInstance() {
       return SingletonInnerClassInner.INSTANCE;
    }

}


