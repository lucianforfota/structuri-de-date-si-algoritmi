package recursivity;

public class Mario {
    public static void main(String[] args) {
        //draw(4);
        drawRecursive2(4);
    }

    public static void draw(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j< i+1; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void drawRecursive1(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("# ");
        }
        System.out.println();
        drawRecursive1(n-1);
    }


    public static void drawRecursive2(int n){
        if (n == 0){
            return;
        }
        drawRecursive2(n-1);
        for (int i = 0; i < n; i++) {
            System.out.print("# ");
        }
        System.out.println();
    }

}
