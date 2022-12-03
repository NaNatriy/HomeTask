public class Main {
    public static void main(String[] args) {
        int a1 = 6;
        int b1 = 2;
        int a2 = 8;
        int b2 = 4;
        if (a1>a2 && b1>a2 || a1>b2 && b1<b2){
            System.out.println("Пересечений нет");
        }else{
            if (a1>=a2 && a1<=b2){
                if (a1>a2 && b1<b2 && a1<b2 && b1>a2) {
                System.out.println(a1+" "+b1);}
                else if (a1>a2 && b1>b2 && a1<b2 && b1>a2) {
                System.out.println(a1+" "+b2);
                } else if (a1>a2 && b1<a2 && a1<b2 && b1<b2){
                System.out.println(a2+" "+a1);
                } else if (a1==a2 && b1<a2 && b1<b2) {
                System.out.println(a1);
                } else if (a1==b2 && b1>b2 && b1>a2) {
                System.out.println(b2);}
                else if (a1==a2 && b1==b2) {
                System.out.println(a1+" "+b1);}
            } else if (b1>=a2 && b1<=b2){
                if (a1>a2 && b1<b2 ){
                    System.out.println(a1+" "+b1);}
                else if (a1<a2 && b1<b2 && b1>a2){
                    System.out.println(a2+" "+b1);}
                else if (a1>b2 && b1<b2 && a1>a2){
                    System.out.println(b1+" "+b2);}
                else if (b1==a2 && a1<a2 && a1<b2){
                    System.out.println(b1);}
                else if (b1==b2 && a1>b2){
                    System.out.println(b2);}
                else if (a1==a2 && b1==b2){
                    System.out.println(a1+" "+b1);}
            } else if (a2>=a1 && a2<=b1){
                if (a2>a1 && b2<b1 && a2<b1 && b2>a1){
                    System.out.println(a2+" "+b2);}
                else if (a2>a1 && b2>b1 && a2<b1 && b2>a1){
                    System.out.println(a2+" "+b1);}
                else if (a2>a1 && b2<a1 && a2<b1 && b2<b1){
                    System.out.println(a1+" "+a2);}
                else if (a1==a2 && b2<a1 && b2<b1){
                    System.out.println(a2);}
                else if (a1==b2 && b2>b1 && b2>a1){
                    System.out.println(b2);}
                else if (a1==a2 && b1==b2){
                    System.out.println(a1+" "+b1);}
            } else if (b2>=a1 && b2<=b1){
                if (a2>a1 && b2<b1 ) {
                    System.out.println(a2+" "+b2);}
                else if (a2<a1 && b2<b1 && b2>a1){
                    System.out.println(a1+" "+b2);}
                else if (a2>b1 && b2<b1 && a2>a1){
                    System.out.println(b2+" "+b1);}
                else if (b1==a2 && a2<a1 && a2<b1){
                    System.out.println(b1);}
                else if (b1==b2 && a2>b1){
                    System.out.println(b2);}
                else if (a1==a2 && b1==b2){
                    System.out.println(a1+" "+b1);}
            }
        }
    }
}
