package Lvl1_Singleton;

import java.util.Stack;

public class Undo {
    private static final Undo INSTANCE = new Undo();
    private final Stack<String> history = new Stack<>();

    private Undo() {}

    public static Undo getInstance() {
        return INSTANCE;
    }

    public void addCommand(String command) {
        history.push(command);
    }

    public String undoCommand() {
        if (history.isEmpty()) return "Empty History";
        return history.pop();
    }

    public void showHistory() {
        System.out.println("History: " + history);
    }
}