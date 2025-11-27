# Ticket Machine Overview

<img src="../imgs/tm.png" width="150" alt="Ticket Machine Image">

A ticket machine is a device similar to an ATM. <br>
It was introduced by Indian Railways to make purchasing train tickets easier. <br>


This is a java implementation of the Ticket Machine built utilizing a trie structure. Users type a destination one letter at a time, and the system displays available next characters. When only one destination remains, the system auto completes the full option.

The goal of this project was to:
1. Gain experience utilizing a trie
2. Utilize a trie in a real world scenario






# Directory Structure
```css
TicketMachine/
├── src/
│   ├── Main.java
│   ├── TicketMachine.java
│   ├── TrieNode.java

```

# Usage
Compile 

```bash
cd TicketMachine/src
javac Main.java TicketMachine.java TrieNode.java


```

Run 

```bash
java Main

```

# Output
```css
Available Destinations:
ALBANY, AMHERST, BATAVIA, BINGHAMTON, BRONX, BROOKLYN, BUFFALO, CHEEKTOWAGA, ELMIRA, FLUSHING, HEMPSTEAD, ITHACA, JAMAICA, KINGSTON, LONGISLANDCITY, MOUNTVERNON, NEWROCHELLE, NEWYORK, NIAGARAFALLS, PITTSFORD, POUGHKEEPSIE, QUEENS, REGOPARK, ROCHESTER, SCHENECTADY, STATENISLAND, SYRACUSE, TROY, UTICA, WESTBURY, WHITEPLAINS, YONKERS, 

 Type in character by character:
============KEYBOARD============
[Q] [W] [E] [R] [T] [Y] [U] [I]   [P] 
[A] [S]   [F]   [H] [J] [K] [L] 
    [C]   [B] [N] [M] 
N
============KEYBOARD============
    [E]         [I]     
                  
              
I
NIAGARAFALLS

```

# Future Work:
1. Add back space functionality
2. Allow for full support of characters 
3. Add GUI


<br>
<br>

*** 


# Code Architecture

1. TrieNode
    ```java
    TrieNode[] children = new TrieNode[26];
    ```
    - **Description**: 
    <br>
    A bare bones TrieNode only requires knowing the location of it's children. In this way it's similar to a n-ary & binary tree. 
    
    - In this implementation we utilize a fixed size array, limiting us to 26 characters. This simplification was done for learning purposes.

    - For our use cases we included metadata in the node. We included
        1. A set that includes children for easier access
        2. A end of word boolean
        3. A count of associated words

<br>

2. buildTrie()
    - This builds our Trie structure. We initialize a root node. and pass an array of strings.
        ```text
            For each word
                For each character
                    
                    Start at root node
                    
                    If character is NOT present in children
                        create new TrieNode
                    
                    Update TrieNode metadata

                    continue iterating

        ```
<br>

3. TicketMachine
    - The Ticket Machine class is a wrapper for our TrieNode & contains our buildTrie, question and auto_complete functions.
    - We include a deque to store both our character inputs & the TrieNode's our user has visited. This supports our autocomplete function and will support our future backspace functionality.

<br>




3. question(char c)
    - Question takes in a character input, and moves a stored iterator through the TrieNode structure
    - If we detect that the count of associated words is one, and the current TrieNodes children set is one, we initialize the auto complete function. 
    - Returns an array of available characters
<br>

4. question()
    - This overloaded function does not take in an input and displays ONLY the available future characters.
<br>

5. auto_complete()
    - The auto complete functions by iterating through to the end of the only available word, appending input chars to a deque. 
    - We then utilize the deque to print the whole word. 


