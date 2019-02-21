package game.chessman;

import game.field.Cell;
import game.player.Color;
import game.player.Player;

public abstract class Chessman {
    protected String id;
    protected Cell cell;
    protected Player owner;

    protected char picture ;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Color getColor() {
        return owner.getColor();
    }

    @Override
    public String toString() {
        return id + "\\" +  getColor();
    }

//    public Chessman(String id, Player player) {
//        owner = player;
//        this.id = id;
//    }

    public Chessman(String id, Player player, char picture) {
        owner = player;
        this.id = id;
        this.picture = picture;
    }

    public char getPicture(){
        return picture;
    }

}
