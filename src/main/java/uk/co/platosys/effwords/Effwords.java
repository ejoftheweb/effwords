package uk.co.platosys.effwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class Effwords {
    public static final int EFF_SHORTLIST=0;
    public static final int EFF_LONGLIST=1;
    public static final int EFF_DEFAULTLIST=2;






    public static String getWord(int wordlist, int index) throws EffwordException {
        try {
           List<String> words;

            switch (wordlist){
                case EFF_SHORTLIST:
                    words=EffwordLists.getShortWordList();
                    break;
                case EFF_LONGLIST:
                    words= EffwordLists.getLongWordList();
                    break;
                case EFF_DEFAULTLIST:
                    words= EffwordLists.getDefWordList();
                    break;
                default:
                    words= EffwordLists.getDefWordList();
                    break;

            }
            return words.get(index % words.size());

        }catch (Exception x){
            throw new EffwordException("problem getting word", x);
        }
    }


}
