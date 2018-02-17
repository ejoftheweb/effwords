package uk.co.platosys.effwords;

import java.util.ArrayList;
import java.util.List;

public class EffwordLists {





            public static  List<String> getShortWordList(){
                List<String> list = new ArrayList<>();
                list=loadList(list, ShortWords.SHORTWORDS0);
                list=loadList(list, ShortWords.SHORTWORDS1);
                return list;
            }
            public static  List<String> getDefWordList(){
                List<String> list = new ArrayList<>();
                list=loadList(list, DefWords.DEFWORDS0);
                list=loadList(list, DefWords.DEFWORDS1);
                return list;
            }
    public static  List<String> getLongWordList(){
        List<String> list = new ArrayList<>();
        list=loadList(list, LongWords.LONGWORDS0);
        list=loadList(list, LongWords.LONGWORDS1);
        list=loadList(list, LongWords.LONGWORDS2);
        list=loadList(list, LongWords.LONGWORDS3);
        list=loadList(list, LongWords.LONGWORDS4);
        list=loadList(list, LongWords.LONGWORDS5);
        list=loadList(list, LongWords.LONGWORDS6);
        return list;
    }
          private static List<String> loadList(List<String> listToLoad, String[] words){
                for(String word:words){
                    listToLoad.add(word);
                }
                return listToLoad;
          }
}
