# effwords
java implementation of EFF diceware wordlists


This doesn't have any randomness in it. It's just a utility to look up a word from one of the three wordlists, based on the idea 
of Arnold Reinhold's Diceware, created by EFF and published 
here: https://www.eff.org/deeplinks/2016/07/new-wordlists-random-passphrases

To use with Gradle:
in repositories {
 maven { url "https://jitpack.io" }
}
dependencies {
   compile 'com.github.ejoftheweb:effwords:v0.2'
}
In code:
    String string = Effwords.getWord(int list, int index)
   where list is one of Effwords.EFF_SHORTLIST, EFF_LONGLIST or EFF_DEFLIST, selecting the shorter, longer
   or alternative shorter EFF lists respectively, and
   index is an integer which, for effectiveness, should be randomly generated. It depends how paranoid you want to be 
   and what your assessment of the security risk is, but you should be aware that probably the second most vulnerable part
   of any cryptosystem (after the human part) is machine-generated "random" numbers - which is the whole point of
   Diceware's use of dice.
