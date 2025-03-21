public class BitwiseExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise Complement: " + (~a));
        System.out.println("Left shift: " + (a << 2));
        System.out.println("Right shift: " + (a >> 2));
        System.out.println("Unsigned right shift: " + (a >>> 2));
    }
}
