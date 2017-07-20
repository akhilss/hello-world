package org.chitoor;

import java.util.*;

/**
 * Created by asrini on 7/20/2017.
 */
public class PanagramDetector {

    private static final String SAMPLE = "alerted,altered,redealt,related,nectars,recants,sourest,toruses,spore,rope,spire,granites,ingrates,bluets,beats,asher,relapse,repeals";

    private static Collection<Set<String>> getPanagrams(String wordsCsv){
        Map<String, Set<String>> panagramGroups = new HashMap<>();
        String[] words = wordsCsv.split(",");
        for(String word: words){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String newWord = new String(charArray);
            if(panagramGroups.containsKey(newWord)){
                panagramGroups.get(newWord).add(word);
            } else {
                Set<String> panagrams = new HashSet<>();
                panagrams.add(word);
                panagramGroups.put(newWord, panagrams);
            }

        }
        return panagramGroups.values();
    }

    public static void main(String[] args) {
        System.out.println(getPanagrams(SAMPLE));
        if(getPanagrams(SAMPLE).size()==11){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
