public class Main {
    public static void main(String[] args) {
        int a1 = 0;
        int b1 = 5;
        int a2 = 1;
        int b2 = 4;
        if (a1 > b2 && b1 > b2 || a1 < a2 && b1 < a2) {
            System.out.println("Пересечения нет");
        } else {
            if (a2 < a1) {
                if (b2 < a1) {
                    System.out.println("Пересечения нет");
                } else if (b2 == a1) {
                    System.out.println(b2);
                } else if (a1 < b2) {
                    System.out.println(a1 + " " + b2);
                } else if (b2 > b1) {
                    System.out.println(a1 + " " + b1);
                }
            } else if (a2 == a1) {
                if (b2 <= b1) {
                    System.out.println(a2 + " " + b2);
                } else {
                    System.out.println(a2 + " " + b1);
                }
            } else if (a2 < b1) {
                if (b2 <= b1) {
                    System.out.println(a2 + " " + b2);
                } else {
                    System.out.println(a2 + " " + b1);
                }
            } else if (a2 == b1) {
                System.out.println(a2);
            } else if (b2 == a1) {
                System.out.println(a1);
            }
        }
    }
}

