class FinalizeExample {
    private int num;

    public FinalizeExample(int n) {
        num = n;
        System.out.println("Object " + num + " created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called for object " + num);
        super.finalize();
    }
}

public class FinalizeExampleDemo {
    public static void main(String[] args) {
        System.out.println("Creating objects...");
        FinalizeExample obj1 = new FinalizeExample(1);
        FinalizeExample obj2 = new FinalizeExample(2);

        System.out.println("Making objects eligible for GC...");
        obj1 = null;
        obj2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method");
    }
}
