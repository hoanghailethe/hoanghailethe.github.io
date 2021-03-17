import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome Mr.Manager!");
        System.out.println("LET'S BUILD YOUR BARCA TEAM! And conquer the Champion Leaugue");
        //Set up a Team and Print out
        Team one = new Team();
        one.addAllTeam();
        System.out.println("All BARCA players : ");
        for (int i = 0 ; i < one.allPlayers.size(); i++) {
            System.out.println(one.allPlayers.get(i).toString());
        }

        System.out.println();
        System.out.println("BUILDING 3-3-2 line up");
        one.buildTeam();
        System.out.println("Print SELECTED TEAM: ");
        for (int i = 0 ; i < one.selectedTeam.size(); i++) {
            System.out.println(one.selectedTeam.get(i).toString());
        }

        System.out.println();
        System.out.println("Do you wan to build OWN Line up team? ");
        System.out.print("Type (Y/N): ");
        Scanner scan = new Scanner (System.in);
        String choice = scan.nextLine();

        while(choice.equals("Y")) {
            try {
                System.out.println("START building your own SELECTED TEAM!");
                System.out.print("Type number of Defender:");
                int defender = Integer.parseInt(scan.nextLine());
                System.out.print("Type number of Midfielder:");
                int midfielder = Integer.parseInt(scan.nextLine());
                System.out.print("Type number of Fowarder:");
                int forwarder = Integer.parseInt(scan.nextLine());

                List<Player> teamSelect =  one.teamSelect(defender, midfielder, forwarder);

                System.out.println();
                System.out.println("Here is your SELECTED TEAM : ");
                for (int i = 0 ; i < teamSelect.size(); i++) {
                    System.out.println(teamSelect.get(i).toString());
                }

                System.out.println("-------------------");
                System.out.println("Do you wan to Continue? ");
                System.out.print("Type (Y/N): ");
                choice = scan.nextLine();

                if(choice.equals("N")){
                    System.out.println("Goodbye Manager! You are Great!");
                    System.exit(0);
                }
            } catch (RuntimeException e) {
                //TODO: handle exception
                System.out.println("OPs! You dont have enough players (DF,MF, FW) for this line-up! ");
            }
            
        }
    }
}
