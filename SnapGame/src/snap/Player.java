package snap;

public class Player {
    public String first;
    public String second;

    public String current;

    public Player (String first, String second) {
        this.first = first;
        this.second = second;
        this.current = first;
    }
    public String getCurrent() {
        return this.current;
    }

    public void toggleCurrent() {
        if (this.current == this.first) {
            this.current = this.second;
        } else {
            this.current = this.first;
        }
    }
}
