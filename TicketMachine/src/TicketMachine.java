import java.util.*;


class TicketMachine
{
    private TrieNode root;
    private TrieNode curr;
    protected Deque<TrieNode> stack;
    protected Deque<Character> input_chars;

    public TicketMachine(String[] destinations)
    {
        root = new TrieNode();
        stack = new LinkedList<>();
        input_chars = new LinkedList<>();

        this.stack.add(root);
        this.curr = root;
        buildTrie(destinations);
    }

    private void buildTrie(String[] str_array)
    {


        for (String str : str_array)
        {
            TrieNode curr = this.root;
            
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
                curr.words_associated +=1;

                curr = curr.children[index];
            }

            curr.end_of_word = true;
            

            
        }
    }

    public void auto_complete()
    {
        if (curr.words_associated != 1)
        {
            return;
        }
        // Curr was already added, iterate until children finishes
        
        char c;
        int index;
        while (true)
        {
            if (curr.childrenSet.size() < 1 )
            {
                return;
            }
            // issue is here
            c =  new ArrayList<>(curr.childrenSet).get(0);

            index = c - 'A';
            System.out.print(c);
            System.out.println("");



            if (curr.end_of_word && curr.children[index] == null)
            {
                StringBuilder sb = new StringBuilder();
                while (input_chars.size() > 0 )
                {
                    sb.append(input_chars.getFirst());
                }
            }
            curr = curr.children[index];
            stack.push(curr);
        
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
        

        if (c < 'A' || c > 'Z')
        {
            return new ArrayList<>();
        }

        if (curr == null) {
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

        stack.push(curr);
        input_chars.push(c);

        if (result.size() == 1 && curr.words_associated == 1)
        {
            auto_complete();
            return new ArrayList<>();
        }

        return result;

        
    }



}
