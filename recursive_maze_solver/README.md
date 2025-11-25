# Recursive Maze Solver
This program loads a maze from a text file, finds the start '+' and end '-', and uses recursive depth-first search with backtracking to find a path. The solved maze is printed to stdout.

# Directory Structure
```css
recursive_main_solver/
├── src/
│   ├── Main.java
│   ├── MazeSolver.java
│
└── mazes/
    ├── maze.txt

```

# Usage
Main.java expects 
1. \<filename> 
2. <star_char> 
3. <end_char>

```bash
cd recursive_main_solver/src
javac Main.java MazeSolver.java
java Main ../mazes/maze.txt + - 

```

# Output
In the case a solution is found
```css
Solution Found
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
++X+++++++++++X+++++++++........X+++....X
X+X+XXXXX XXX+X+X XXXXX+XXXXXXX.X+X+XXX.X
X+++....X   X+++X     X+++++X...X+X+++X.X
X XXXXXXXXX XXXXXXXXX XXXXX+XXXXX+XXX+X.X
X   X     X   X     X     X+++..X+X+++X.X
XXX X X XXXXX X X X XXX X XXX+XXX+X+XXX.X
X   X X     X X X X   X X   X+++++X+++X.X
X XXXXXXXXX X XXX XXXXX X XXXXXXXXXXX+XXX
X   X   X   X   X   X   X       X   X+++X
X X X X X XXXXX X X X XXXXXXX XXX X XXX+X
X X   X X X   X   X X   X+++X   X X   X+X
X XXXXX X X X XXXXXXXXX X+X+XXX X XXXXX+X
X     X   X X   X       X+X+..X   X+++++X
X XXX XXXXX XXX XXXXXXXXX+X+XXXXXXX+XXXXX
X   X     X X X     X+++++X+++++..X+++++X
X X XXX XXX X XXXXX X+XXXXXXXXX+X.XXXXX+X
X X   X     X X     X+++++++X+++X.....X+X
X XXX XXXXXXX X XXXXXXXXXXX+X+XXXXXXXXX+X
X   X   X   X   X     X X+++X+X+++++X+++X
X X XXX X X XXXXX X X X X+XXX+X+XXX+X+XXX
X X   X X X     X X X X X+..X+X+X+++X+++X
X XXX X X XXXXX XXX X X X+XXX+X+X+XXXXX+X
X   X X   X   X   X X   X+++X+++X+X+++++X
XXX X XXXXX X XXX X XXXXXXX+XXXXX+X+XXXXX
X   X       X   X   X+++++++....X+X+++++X
X XXX XXXXXXXXXXXXXXX+XXXXXXXXXXX+XXXXX+X
X X X     X   X     X+..X.......X+++++++X
X X XXXXX X X X X XXX+X.X.XXXXX.XXXXXXXXX
X       X   X X X   X+X...X.....X+++++..X
XXXXXXX XXXXX X XXX X+XXXXXXXXXXX+XXX+X.X
X     X X   X X   X X+++++++++++X++.X+X.X
X X X X X X X XXX X XXXXXXX XXX+XX+XX+XXX
X X X X   X X   X X     X X   X+X++.X+++X
X X X XXXXXXXXX X XXXXX X XXX X+X+X.XXX+X
X X X X         X X   X X     X+++X...X+X
X X XXX XXXXXXXXXXX X X XXXXXXXXXXXXX.X+X
X X     X     X   X X X   X       X...X+X
X XXXXXXX XXX X X X X X X X XXXXX XXXXX+X
X           X   X   X   X   X     X    +-
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
```

In the case a solution is not found:
```css
No solution found.

```
