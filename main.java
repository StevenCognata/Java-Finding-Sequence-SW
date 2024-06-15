import java.util.*;

public class FindRepeatedSequences{

   public static Set<String> findRepeatedSequences(String s, int k) {
      Set<String> seen = new HashSet<>();
      Set <String> repeated = new HashSet<>();

      for(int i = 0; i < s.length() - k; i++){
         String sequence = s.substring(i, i + k);
         if(seen.contains(sequence)){
            repeated.add(sequence);
         }
         seen.add(sequence);
      }

    
    return repeated;
   }
}
