
public class Player {
    private String fullName;
    Position position;
    int shirtNum;

    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public int getShirtNum() {
        return shirtNum;
    }


    public void setShirtNum(int shirtNum) {
        this.shirtNum = shirtNum;
    }


    public Player(int shirtNum, String fullName, Position position) {
        this.fullName = fullName;
        this.position = position;
        this.shirtNum = shirtNum;
    }


    public Position getPosition() {
        return position;
    }


    public void setPosition(Position position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "\n Shirt Number: " + shirtNum +"| Player's name: " + fullName + "| Player's position: " + position;
    }

    

}