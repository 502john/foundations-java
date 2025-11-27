import java.util.*;

public class TrieNode
{
    TrieNode[] children = new TrieNode[26];
    Set<Character> childrenSet = new HashSet<>();
    int words_associated = 0;
    boolean end_of_word = false;
}