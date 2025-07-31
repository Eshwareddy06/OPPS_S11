package Task_1;

public class ControlStructures {
	public static void main(String[] args) {
        int[] numbers={10,20,30,45,50,60,55,65,96};
        for (int i=0; i < numbers.length; i++){
            if (numbers[i]%2==0) {
                System.out.println("Even number:"+numbers[i]);
            }
        }
    }

}
