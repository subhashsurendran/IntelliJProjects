import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Mpasfdd {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            //System.out.println(line);

            String split[] = line.split(";");

            int targetSum = Integer.parseInt(split[1]);

            String [] integerVals = split[0].split(",");
            int [] pairArray = new int [integerVals.length];
            for(int i =0;i<integerVals.length; i++){

                pairArray[i] = Integer.parseInt(integerVals[i]);
            }

            HashMap<Integer, Integer> pairedMap = targetPair(pairArray, targetSum);

            for(Map.Entry<Integer,Integer> entry : pairedMap.entrySet()){

                System.out.print(entry.getKey()+","+entry.getValue()+";");
            }

        }
    }

    static HashMap<Integer, Integer> targetPair(int [] inputArray, int targetSum){

        HashMap<Integer, Integer> returnMap = new HashMap<>();



        for(int i =0;i<inputArray.length; i++){

            if(returnMap.containsKey(targetSum-i)){
                returnMap.get(targetSum -inputArray[i]);
            }
            else {
                returnMap.put(inputArray[i], i);
            }
        }
        return returnMap;
    }
}