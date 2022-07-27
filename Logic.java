package Tetris;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Logic extends JFrame {

    private JLabel stats;

    public Logic() {

        initUI();
    }

    private void initUI() {

        stats = new JLabel(" 0");
        add(stats, BorderLayout.SOUTH);

        var board = new Board(this);
        add(board);
        board.start();

        setTitle("Tetris");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    JLabel getStatusBar() {

        return stats;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var game = new Logic();
            game.setVisible(true);
        });
    }
}