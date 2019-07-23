public class Sentence {
    public String getLongest_LengthOfWordFromSentence(String sentence) {

        System.out.println("You have entered: " + sentence);
        String[] str = sentence.split(" ");
        String wordStr = " ";
        int wordStrlength=0;
        for (int i = 0; i < str.length; i++)
            if (str[i].length() >=wordStr.length()) {
                wordStr = str[i];
                wordStrlength= str[i].length();
                for ( int k=i+1; k<str.length; k++){
                    if( str[i].length()==str[k].length()){
                        String newWord= str[k];

                        wordStr= str[i] + " "  + newWord;
                    }
                }

            } return wordStr + "\nLength is: " + wordStrlength ;
    }
}
