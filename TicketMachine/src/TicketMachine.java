import java.util.*;


class TicketMachine
{
    private TrieNode root;
    private TrieNode curr;
    private Deque<TrieNode> input;

    public TicketMachine(String[] destinations)
    {
        root = new TrieNode();
        input = new LinkedList<>();

        this.input.add(root);
        this.curr = root;
        buildTrie(destinations);
    }

    private void buildTrie(String[] str_array)
    {


        for (String str : str_array)
        {
            TrieNode curr = root;

            char[] innerArr = str.toCharArray();
            for ( char ch : innerArr )
            {
                int index = ch - 'A';
                if (index < 0 || index >= 26)
                {
                    return;
                }
                
                if (curr.children[index] == null)
                {
                    curr.children[index] = new TrieNode();
                    curr.childrenSet.add(ch);

                }

                curr = curr.children[index];
            }

            curr.completeWord = true;
            

            
        }
    }

    // Does not Iterate
    public List<Character> question()
    {
        if ( curr == null)
        {
            return new ArrayList<>();
        }
        return new ArrayList<>(curr.childrenSet);


    }

    // Iterates
    public List<Character> question(char c) 
    {
        
        if (c == '\b') 
        { 
            if (input.size() <= 1) 
            {
                return new ArrayList<>();
            }

            input.removeLast();
            curr = input.peekLast();
            return new ArrayList<>(curr.childrenSet);
        }

        // if (c == '\n') 
        // {
        //     // Empty List
        //     return new ArrayList<>();
        // }

        if (c < 'A' || c > 'Z')
        {
            return new ArrayList<>();
        }

        if (curr == null) {
            input.push(null);
            return new ArrayList<>();
        }

        int index = c - 'A';
        if ( curr.children[index] == null)
        {
            return new ArrayList<>();
        }
        // Iterate
        curr = curr.children[index];

        List<Character> result = new ArrayList<>(curr.childrenSet);

        input.push(curr);

        return result;

        
    }



}
