import java.util.ArrayList;
import java.util.List;

public class Team {
    //number of each Position in selected Start position
    private int GKNumber = 1;
    private int DFNumber = 4;
    private int MFNumber = 4;
    private int FWNumber = 2;

    ArrayList<Player> allPlayers = new ArrayList<>();
    ArrayList<Player> selectedTeam = new ArrayList<>();

    public Team(){
        //default
    }

    public List <Player> teamSelect (int defender, int midfielder, int forwarder) {
        DFNumber = defender;
        MFNumber = midfielder; 
        FWNumber = forwarder;
        buildTeam();
        return selectedTeam;
    }

    //Create and Add all players into allPlayers List
    Player p1 = new Player(1,"Marc-André ter Stegen",Position.GK);
    Player p2 = new Player(2,"Sergiño Dest",Position.DF);
    Player p3 = new Player(3,"Gerard Piqué",Position.DF);
    Player p4 = new Player(4,"Ronald Araújo",Position.DF);
    Player p5 = new Player(5,"Sergio Busquets",Position.MF);
    Player p6 = new Player(6,"Antoine Griezmann",Position.FW);
    Player p7 = new Player(7,"Miralem Pjanić",Position.MF);
    Player p8 = new Player(8,"Martin Braithwaite",Position.FW);
    Player p9 = new Player(9,"Lionel Messi",Position.FW);
    Player p10 = new Player(10,"Ousmane Dembélé",Position.FW);
    Player p11 = new Player(11,"Riqui Puig",Position.MF);
    Player p12 = new Player(12,"Neto",Position.GK);
    Player p13 = new Player(13,"Clément Lenglet",Position.DF);
    Player p14 = new Player(14,"Pedri",Position.MF);
    Player p15 = new Player(15,"Francisco Trincão",Position.FW);
    Player p16 = new Player(16,"Jordi Alba",Position.DF);
    Player p17 = new Player(17,"Matheus Fernandes",Position.MF);
    Player p18 = new Player(18,"Sergi Roberto",Position.DF);
    Player p19 = new Player(19,"Frenkie de Jong",Position.MF);
    Player p20 = new Player(20,"Ansu Fati",Position.FW);
    Player p21 = new Player(21,"Samuel Umtiti",Position.DF);
    Player p22 = new Player(22,"Junior Firpo",Position.DF);

    public void addAllTeam() {
        this.allPlayers.add(p1);
        this.allPlayers.add(p2);
        this.allPlayers.add(p3);
        this.allPlayers.add(p4);
        this.allPlayers.add(p5);
        this.allPlayers.add(p6);
        this.allPlayers.add(p7);
        this.allPlayers.add(p8);
        this.allPlayers.add(p9);
        this.allPlayers.add(p10);
        this.allPlayers.add(p11);
        this.allPlayers.add(p12);
        this.allPlayers.add(p13);
        this.allPlayers.add(p14);
        this.allPlayers.add(p15);
        this.allPlayers.add(p16);
        this.allPlayers.add(p17);
        this.allPlayers.add(p18);
        this.allPlayers.add(p19);
        this.allPlayers.add(p20);
        this.allPlayers.add(p21);
        this.allPlayers.add(p22);
    }

    public void buildTeam() {
        selectedTeam.clear();
        //Create LIST of each Position
        ArrayList <Player> GKsList = new ArrayList<>();
        ArrayList <Player> DFsList = new ArrayList<>();
        ArrayList <Player> MFsList = new ArrayList<>();
        ArrayList <Player> FWsList = new ArrayList<>();
        for (int i = 0; i < allPlayers.size(); i++) {
            Player player = allPlayers.get(i);
            if (player.getPosition().equals(Position.GK)) {
                GKsList.add(player);
            }
            if (player.getPosition().equals(Position.DF)) {
                DFsList.add(player);
            }
            if (player.getPosition().equals(Position.MF)) {
                MFsList.add(player);
            }
            if (player.getPosition().equals(Position.FW)) {
                FWsList.add(player);
            }
        }

        //Get a Random Player and Put in other until Enough for requirement
        for (int i = 1; i<= GKNumber; i++) {
            int rand = (int) ( Math.random()*GKsList.size() )  ;
            Player player = GKsList.get(rand);
            selectedTeam.add(player);
            GKsList.remove(player);
        }
        for (int i = 1; i<= DFNumber; i++) {
            int rand = (int) (Math.random()*DFsList.size()) ;
            Player player = DFsList.get(rand);
            selectedTeam.add(player);
            DFsList.remove(player);
        }
        for (int i = 1; i<= MFNumber; i++) {
            int rand = (int) ( Math.random()*MFsList.size()) ;
            Player player = MFsList.get(rand);
            selectedTeam.add(player);
            MFsList.remove(player);
        }
        for (int i = 1; i<= FWNumber; i++) {
            int rand = (int) ( Math.random()*FWsList.size())  ;
            Player player = FWsList.get(rand);
            selectedTeam.add(player);
            FWsList.remove(player);
        }
    }

    public int getGKNumber() {
        return GKNumber;
    }

    public void setGKNumber(int GKNumber) {
        this.GKNumber = GKNumber;
    }

    public int getDFNumber() {
        return DFNumber;
    }

    public void setDFNumber(int DFNumber) {
        this.DFNumber = DFNumber;
    }

    public int getMFNumber() {
        return MFNumber;
    }

    public void setMFNumber(int MFNumber) {
        this.MFNumber = MFNumber;
    }

    public int getFWNumber() {
        return FWNumber;
    }

    public void setFWNumber(int FWNumber) {
        this.FWNumber = FWNumber;
    }

    
}
