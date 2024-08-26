package recursivity;

public class Sum {

    public static void main(String[] args) {

    }

    public static int sum(int k){
        //suma numerelor pana la 10 e suma pana la 9 + 10
                //suma ana la 9 e suma pana la 8 + 9
                //suma pana la 0 e 0
                //suma pana la k e suma pana la k-1 + k

        if (k == 0){
            return 0;
        }else {
            return k + sum(k-1);
        }
    }
}
