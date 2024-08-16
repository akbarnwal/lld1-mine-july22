package in.anilbarnwal.lld1minejuly22.lld3.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {
    private List<List<Cell>> board = new ArrayList<>();
    private int dimension;

    public Board(int dimension){
        this.dimension = dimension;

        //Create Board (for example 3 X 3)
        for(int i = 0 ; i < dimension ; i++){
            List<Cell> row = new ArrayList<>();
            for(int j = 0; j < dimension; j++ ){
                row.add(new Cell(i, j));
            }
            board.add(row);
        }

    }
}
