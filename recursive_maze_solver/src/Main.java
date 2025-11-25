import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main 
{
    public static void main(String[] args) 
    {
        if (args.length < 3) 
        {
            System.out.println("Usage: java Main <filename> <star_char> <end_char>");
            System.exit(1);
        }

        String file_name = args[0];
        char start_char = args[1].charAt(0);
        char end_char = args[2].charAt(0);
        

        // Ingest the array 
        File file = new File(file_name);
        try {

            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                
                // Dimensions found on first line
                int rows = scan.nextInt();
                int cols = scan.nextInt();
                scan.nextLine();


                char[][] maze = new char[rows][cols];
                List<String> tempList = new ArrayList<>();
                while (scan.hasNextLine()) 
                {
                    String line = scan.nextLine();
                    tempList.add(line);
                    
                }

            
                
                for (int i = 0; i < tempList.size()  ; i++)
                {
                    char[] temp = tempList.get(i).toCharArray();
                    maze[i] = temp;
                }





                

                MazeSolver solver = new MazeSolver(rows, cols, maze, start_char, end_char );
                solver.find_solution();


                
            }
            scan.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
                                

    
}

