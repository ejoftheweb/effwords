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
    private static final String SHORTFILENAME = "shortwordlist";
    private static final String LONGFILENAME="longwordlist";
    private static final String DEFFILENAME="defwordlist";

    public static String getWord(int wordlist, int index) throws EffwordException {
        try {
            String filename="";
            File file;
            switch (wordlist){
                case EFF_SHORTLIST:
                    filename = SHORTFILENAME;
                    break;
                case EFF_LONGLIST:
                    filename = LONGFILENAME;
                    break;
                case EFF_DEFAULTLIST:
                    filename=DEFFILENAME;
                    break;
                default:
                    filename = DEFFILENAME;
                    break;

            }
            List<String> words = loadWordList(filename);
            return words.get(index % words.size());

        }catch (Exception x){
            throw new EffwordException("problem getting word", x);
        }
    }

    private static List<String> loadWordList(String filename) throws EffwordException {

        List<String> wordList=new ArrayList<>();
        ClassLoader classLoader = Effwords.class.getClassLoader();

        File wordListFile = new File(classLoader.getResource(filename).getFile());
        try {
            BufferedReader bufferedReader = new BufferedReader( new FileReader(wordListFile));
            String line;
            while ((line=bufferedReader.readLine())!=null){
                //System.out.println((line));
                String word = line.split("\t")[1];
                wordList.add(word);
                //System.out.println(word);
            }

            return wordList;
        }catch(Exception x){
            throw new EffwordException("loading wordlist", x);
        }

    }
}
