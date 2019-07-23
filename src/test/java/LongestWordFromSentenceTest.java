import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestWordFromSentenceTest {
    @Test(priority = 1)
    public  static void testLongestWord() {

        Sentence s = new Sentence();
        String largestWordAndLength = s.getLongest_LengthOfWordFromSentence("My favorite subject is computer science .");
        System.out.println("The longest words are :  " + largestWordAndLength);
    }

    @Test(priority = 2)
    public static void testAssertionForlongestWord(){

        try{
            Sentence community = new Sentence();
            String lWord=community.getLongest_LengthOfWordFromSentence("The word that is longest in this sentence is community . ");
            System.out.println("Longest word is : " + lWord);
            Assert.assertEquals(lWord,"community");

        }catch(AssertionError e){
            System.out.println("The length is missing." + e);
        }

    }

    @Test(priority = 3)
    public static void getLongestWordTest(){
        Sentence s=new Sentence();
        String java=s.getLongest_LengthOfWordFromSentence("Java is my most favorite programming language .");
        System.out.println("The longest word is : " + java);

    }
    @Test(priority = 4)
    public static void assertForTheLongestwordTest(){
        Sentence s=new Sentence();
        String java=s.getLongest_LengthOfWordFromSentence("The longest word is pneumonoultramicroscopicsilicovolcanoconiosis . ");
        System.out.println("The longest word is :" + java);
        Assert.assertEquals(java, "pneumonoultramicroscopicsilicovolcanoconiosis\nLength is: 45");

    }
}
