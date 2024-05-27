package arrays;

public class ArrayOperations {


    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void reverse(){
        for (int i = 0; i < numbers.length/2; i++) {
            //interschimba pozitiile opuse (in oglinda)
            swap( i, numbers.length-i-1);
        }
    }

    public void swap ( int index1, int index2 ){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2]= temp;
    }



}
