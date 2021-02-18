package game;

import java.util.Arrays;

// Chessboard 用来实例化对象
// 棋盘对象
// 1. 落子
// 2. 判断棋盘状态
public class Chessboard {
    private static final int 空白 = 0;
    private static final int 画圈 = 1;
    private static final int 画叉 = 2;
    private final int[][] array = {
            {空白, 空白, 空白},
            {空白, 空白, 空白},
            {空白, 空白, 空白},
    };

    public boolean moveCircleAt(int row, int column) {
        if (array[row][column] != 空白) {
            return false;
        }
        array[row][column] = 画圈;
        return true;
    }

    public boolean moveCrossAt(int row, int column) {
        if (array[row][column] != 空白) {
            return false;
        }
        array[row][column] = 画叉;
        return true;
    }

    public static final int CIRCLE_WIN = 0;     // 圈赢
    public static final int CROSS_WIN = 1;      // 叉赢
    public static final int DRAW = 2;           // 平局
    public static final int CONTINUE = 3;       // 游戏继续
    public int getState() {
        return CONTINUE;
    }

    private static String 显示(int i) {
        switch (i) {
            case 空白: return " ";
            case 画圈: return "@";
            case 画叉: return "*";
            default: return " ";
        }
    }

    @Override
    public String toString() {
        String s = "+-+-+-+\n";
        for (int i = 0; i < 2; i++) {
            s += String.format("|%s|%s|%s|\n", 显示(array[i][0]), 显示(array[i][1]), 显示(array[i][2]));
            s += "+-+-+-+\n";
        }
        s += String.format("|%s|%s|%s|\n", 显示(array[2][0]), 显示(array[2][1]), 显示(array[2][2]));
        s += "+-+-+-+";

        return s;
    }
}
