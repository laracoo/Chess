package game.chessman;

import game.field.Cell;
import game.player.Color;
import game.player.Player;

public abstract class Chessman {
    protected String id;
    protected Cell cell;
    protected Player owner;

    protected char picture ;

    /**
     * Возращает id игрока
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * присвоевает id игроку
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * передвижение фигур, метод определяет можно ли передвинуть фигуру на клетку Cell
     *
     * @param cell
     * @return
     */
    public abstract boolean canMove(Cell cell);

    /**
     *  передвижение фигур, метод определяет можно ли есть фигуру на клетке Cell
     * @param cell
     * @return
     */
    public abstract boolean canEat(Cell cell);

    /**
     * Возращает клетку на которой стоит фигура
     * @return
     */
    public Cell getCell() {
        return cell;
    }

    /**
     * Присваивает клетку CEll
     * @param cell
     */
    public void setCell(Cell cell) {
        this.cell = cell;
    }

    /**
     * Определяет игрока(хозяйна фигуры)
     * @return
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Присваивает owner  игроку
     * @param owner
     */
    public void setOwner(Player owner) {
        this.owner = owner;
    }

    /**
     * Присваеваем цвет игроку( Чёрный или Белый)
     * @return
     */
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

    /**
     * Добавляем в Chessman игрока, цвет игрока и картинку фигуры
     * @param id
     * @param player
     * @param picture
     */
    public Chessman(String id, Player player, char picture) {
        owner = player;
        this.id = id;
        this.picture = picture;
    }

    /**
     * Привает картинку определенной фигуре
     * @return
     */
    public char getPicture(){
        return picture;
    }

}
