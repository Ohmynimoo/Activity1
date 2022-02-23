    import java.util.*;

 // An efficient Java program to remove all spaces
// from a string
public class RemovingWhiteSpaceFromString {
 
// Function to remove all spaces
// from a given string
static int removeSpaces(char []str)
{
    // To keep track of non-space character count
    int count = 0;
 
    // Traverse the given string.
    // If current character
    // is not space, then place
    // it at index 'count++'
    for (int i = 0; i<str.length; i++)
        if (str[i] != ' ')
            str[count++] = str[i]; // here count is
                                    // incremented
         
    return count;
}
 
// Driver code
public static void main(String[] args)
{
    char str[] = "j i r o n n i e m o ".toCharArray();
    int i = removeSpaces(str);
    System.out.println(String.valueOf(str).subSequence(0, i));
}
}
