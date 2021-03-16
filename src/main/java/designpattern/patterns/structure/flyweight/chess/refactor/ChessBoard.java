package designpattern.patterns.structure.flyweight.chess.refactor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */

public class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPieceUnit(1), 0, 0));
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPieceUnit(2), 1, 0));
        // ...省略摆放其他棋子的代码...
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        // ...省略...
    }
}