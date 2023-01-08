import java.util.LinkedHashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {

        // Creating LinkedHashMap for Key and Value output

        Map<String, Integer> myMap = new LinkedHashMap<String, Integer>();

        //You can edit the string for testing

        String s = "The quick brown fox ver the lazy dog. " +
                "The quick brown fox ver the lazy dogThe quick brown fox ver the lazy dog";

        //Dividing words from string

        String[] pairs = s.split(" ");


        for (int i = 0; i < pairs.length; i++)
        {


            int count = 1;
            String pair = pairs[i];
            //Starting from checking if the word is not yet in the Hashmap
            if (myMap.containsKey(pair))
            {
                count = myMap.get(pair);
                myMap.replace(pair, count + 1);
            }

            //If the word is not yet in the Hashmap, adding the word
            else
            {
                myMap.put(pair, count);
            }

        }
        //Printing Hashmap
        System.out.println("{");
        myMap.forEach((key, value) -> System.out.println("'" + key + "'" + ":" + " " + value + ","));
        System.out.println("}");

    }
}