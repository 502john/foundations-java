public class MazeSolver {
    int num_rows;
    int num_cols;
    int start_pos[];

    char maze[][];
    char start_char;
    char end_char;

    public MazeSolver(int num_rows, int num_cols, char maze[][], char start_char, char end_char) 
    {
        this.num_rows = num_rows;
        this.num_cols = num_cols;
        this.maze = maze;
        this.start_char = start_char;
        this.end_char = end_char;
        this.start_pos = find_start_pos();
        verify_end_char();

    }

    public void find_solution()
    {
        if (dfs(this.start_pos[0], this.start_pos[1]))
        {   
            System.out.println("Solution Found");
            print_maze();
        }
        else
        {
            System.out.println("No solution Found");
        }
    }

    public void print_maze() {
        char [][] arr = this.maze;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x]);
            }
            System.out.println();
        }
    }

    private boolean dfs(int curr_row, int curr_col)
    {
        char [][] arr = this.maze;

        // Base Case
        if(arr[curr_row][curr_col] == this.end_char)
        {
            return true;
        }

        // Right, Down, Left, Up
        if (is_safe(curr_row, curr_col))
        {
            arr[curr_row][curr_col] = '+';

            if (dfs(curr_row, curr_col + 1))
            {
                return true;
            }

            if (dfs(curr_row + 1, curr_col))
            {
                return true;
            }

            if (dfs(curr_row , curr_col - 1))
            {
                return true;
            }
            
            if (dfs(curr_row - 1, curr_col))
            {
                return true;
            }
            
            arr[curr_row][curr_col] = '.';
            return false;
        
            
            
        }
        //
        return false;

        

    }

    // Helper Methods
    private int[] find_start_pos()
    {
        int[] res = new int[2];
        int num_found = 0;
        char [][] arr = this.maze;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (arr[y][x] == '+')
                {
                    num_found += 1;
                    res[0] = y;
                    res[1] = x;
                }
            }
        }

        if (num_found != 1)
        {
            throw new IllegalStateException("Maze must contain exactly 1 start_symbol but found " + num_found);
        }

        return res;
    }

    private void verify_end_char()
    {
        int num_found = 0;
        char [][] arr = this.maze;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (arr[y][x] == '+')
                {
                    num_found += 1;
                }
            }
        }

        if (num_found != 1)
        {
            throw new IllegalStateException("Maze must contain exactly 1 end_symbol but found " + num_found);
        }

    }




    private boolean is_safe(int curr_row, int curr_col )
    {
        // Since we are marking our array with the start_char, ensure we are only stepping onto the initial star_char
        char [][] arr = this.maze;
        boolean is_in_bounds = (curr_row >= 0) && (curr_col >=0) && (curr_row < num_rows) &&  (curr_col < num_cols);
        boolean is_good_char =  (arr[curr_row][curr_col] == ' ') || (arr[curr_row][curr_col] == this.end_char);
        boolean is_start_char = (arr[curr_row][curr_col] == this.start_char) && (curr_row == start_pos[0] && curr_col == start_pos[1]);

        return is_in_bounds & (is_good_char || is_start_char );

    }


}