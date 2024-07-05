// Question 2
// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.


//Solution

public class LastWordLength{
    public static void main (String[]args)
    {
        String s = "Hello, I'm in danger";
        System.out.println(s);

        int lengthOfLastWord = getLengthOfLastWord(s);
        System.out.println("Length of last word: " +lengthOfLastWord);
    }

        public static int getLengthOfLastWord(String s)
        {
            if(s == null || s.length() == 0)
            {
                return 0;
            }

            //This line trims any trailing spaces
            s = s.trim();


            //This line finds the last space in the trimmed string
            int lastSpaceIndex = s.lastIndexOf(' ');

             // The last word is from the character after the last space to the end of the string
            return s.length() - lastSpaceIndex - 1;
        }
    }


