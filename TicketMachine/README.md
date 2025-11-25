# Ticket Machine

<img src="../imgs/tm.png" width="150" alt="Ticket Machine Image">

A ticket machine is a device similar to an ATM. <br>
It was introduced by Indian Railways to make purchasing train tickets easier. <br>


# Trie-based Autocomplete
The program reads user input one character at a time and uses a trie to compute the valid next characters. This provides an intelligent, auto-complete–style keyboard experience.

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

[console] A
============KEYBOARD============
                    
                [L] 
            [M] 
[console] L
============KEYBOARD============
                    
                  
        [B]   

```
