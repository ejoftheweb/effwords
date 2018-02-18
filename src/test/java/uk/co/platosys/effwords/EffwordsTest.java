package uk.co.platosys.effwords;

import org.junit.Test;

public class EffwordsTest {
    int giantNegInt = -2147483646;
    int giantPosInt = 2147483630;
    int closeInt = 7776;
    int closeInt2=7777;
    int closeInt3=7775;
    @Test
    public void TestIntget (){
        try {
            System.out.println(Effwords.getWord(Effwords.EFF_LONGLIST, giantNegInt));
            System.out.println(Effwords.getWord(Effwords.EFF_LONGLIST, giantPosInt));
            System.out.println(Effwords.getWord(Effwords.EFF_LONGLIST, closeInt));
            System.out.println(Effwords.getWord(Effwords.EFF_LONGLIST, closeInt2));
            System.out.println(Effwords.getWord(Effwords.EFF_LONGLIST,closeInt3));

        }catch (Exception x){
            System.out.println(x.getClass()+"\n"+x.getMessage());
        }
    }
}
