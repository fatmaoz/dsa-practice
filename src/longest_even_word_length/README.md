1. Longest Even Length Word
   Consider a string, sentence, of words separated by spaces where each word is a substring consisting of English alphabetic letters only. Find the first word in the sentence that has a length which is both an even number and greater than or equal to the length of any other word of even length in the sentence. If there are multiple words meeting the criteria, return the one which occurs first in the
   sentence.
   Example
   sentence = "Time to write great code"
   The lengths of the words are 4, 2, 5, 5, 4, in order. The longest even length words are Time and code. The one that occurs first is Time, the answer to return
   Function Description
   Complete the function longestEven Word in the editor below.
   longestEvenWord has the following parameter(s):
   string sentence: a sentence string
   Returns:
   string: the word that is first occurrence of a string with maximal even number length, or the string '00' (zero zero) if there are no even length words
   Constraints
   • 1 ≤ length of sentence≤ 105
   • The sentence string consists of spaces and letters in the range ascii[a-z, A-Z, ] only.
   Input Format for Custom Testing
   ▾ Sample Case 0
   Sample Input 0
   STDIN
   Function
   It is a pleasant day today →
   sentence = "It is a pleasant day today"