package designpatterns.creationalpatterns;

public class Mobile {

    private int id;
    private String name;

    private Mobile(MobileBuilder mobileBuilder) {
        System.out.println("mobile constructor");
    }


    static class MobileBuilder {
        boolean hasCamera;
        private int id;
        private String name;
        private double price;

        public MobileBuilder() {
            System.out.println("mobile builder - constructor");
        }

        private Mobile build() {
            return new Mobile(this);
        }

        /*public MobileBuilder getCamera(){

        }*/
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile(new MobileBuilder());
    }
}
