package Quersumme;



public class Task3 {

    public static void main(String[] args) {

        int[] values = new int[28];

        for (int cnt = 0; cnt < 1000; cnt++){
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;

            for (int i = 0; i<numbers.length; i++){
                sum = sum + Character.getNumericValue(numbers[i]);
            }
            values[sum] += 1;
        }

        int biggestNumber = 0;
        int arrayIndex = 0;

        for (int i = 0; i< values.length; i++){
            if(values[i]>= biggestNumber){
                biggestNumber = values[i];
                arrayIndex = i;
            }
            System.out.println("Quersumme: " + i + " kommt " + values[i] + " vor ");
        }

        System.out.println("Diese Quersumme kommt am häufigsten vor: " + arrayIndex);


    }


}
