import java.util.*;
public class Main 
{

    // Code to format return array to qwerty keyboard
    public static char[][] QWERTY = 
    {
        { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P' },
        { 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L' },
        { 'Z', 'X', 'C', 'V', 'B', 'N', 'M' }
        
    };
    public static void print_qwerty(List<Character> opt)
    {
        HashSet<Character> opt_set = new HashSet<>(opt);
        System.out.println("============KEYBOARD============");
        for (char[] row : QWERTY )
        {
            StringBuilder sb = new StringBuilder();
            for (char c : row)
            {
                if ( opt_set.contains(c) )
                {
                    sb.append("[");
                    sb.append(c);
                    sb.append("] ");
                }
                else
                {
                    sb.append("  ");
                }
            }

            System.out.println(sb.toString());
        }


    }
    ////////////////////////////////////////////////////


    public static void main(String[] args)
    {
        String[] cities = new String[] {
            "ALBANY",
            "AMHERST",
            "BATAVIA",
            "BINGHAMTON",
            "BRONX",
            "BROOKLYN",
            "BUFFALO",
            "CHEEKTOWAGA",
            "ELMIRA",
            "FLUSHING",
            "HEMPSTEAD",
            "ITHACA",
            "JAMAICA",
            "KINGSTON",
            "LONGISLANDCITY",
            "MOUNTVERNON",
            "NEWROCHELLE",
            "NEWYORK",
            "NIAGARAFALLS",
            "PITTSFORD",
            "POUGHKEEPSIE",
            "QUEENS",
            "REGOPARK",
            "ROCHESTER",
            "SCHENECTADY",
            "STATENISLAND",
            "SYRACUSE",
            "TROY",
            "UTICA",
            "WESTBURY",
            "WHITEPLAINS",
            "YONKERS"
        };
        








        TicketMachine tm = new TicketMachine(cities);
        Scanner scan = new Scanner(System.in);

        System.out.println("Available Destinations:");
        for (String str : cities)
        {
            System.out.print(str + ", ");
        }
        System.out.println("");

        System.out.println("\n Type in character by character:");
        List<Character> output = tm.question();
        print_qwerty(output);

        while (true)
        {
            String line = scan.nextLine();
            char c = line.charAt(0);
            output = tm.question(c);
            if (output.size() < 1)
            {
                break;
            }
            print_qwerty(output);
            
            
        }
        scan.close();

        
    }
}
