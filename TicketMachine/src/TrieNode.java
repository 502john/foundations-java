import java.util.*;

public class TrieNode
{
    TrieNode[] children = new TrieNode[26];
    Set<Character> childrenSet = new HashSet<>();
    boolean completeWord = false;
}