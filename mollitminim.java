public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        System.out.println(obj.getValue());  // Output: 42
    }
}
