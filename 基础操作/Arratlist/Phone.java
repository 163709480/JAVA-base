package sort;

public class Phone {

    private String board;
    private int  price;

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(String board, int price) {
        this.board = board;
        this.price = price;
    }

    public Phone() {
    }
}
