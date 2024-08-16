package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(String name, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Cell makeMove(Board board) {
        //Take input Row and Column that client wanted to set new value

        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        do{
            //Row
            do {
                System.out.println(this.name +"("+ this.symbol.getSymbol() + "), please enter Row number: ");
                row = scanner.nextInt();
                if(row < 0 || row > board.getDimension()){
                    System.out.println(this.name +"("+ this.symbol.getSymbol() + "), please enter valid row number");
                }
            }while (row < 0 || row > board.getDimension());

            //Column
            do {
                System.out.println(this.name+"("+ this.symbol.getSymbol() + "), please enter Column number");
                col = scanner.nextInt();
                if(col < 0 || col > board.getDimension()){
                    System.out.println(this.name +"("+ this.symbol.getSymbol() + "), please enter valid column number");
                }
            }while (col < 0 || col > board.getDimension());

        }while (board.getBoard().get(row).get(col).getState() != CellState.EMPTY);

        return new Cell(row, col);  //Empty cell
    }
}
