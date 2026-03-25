import Lvl1_Singleton.Undo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UndoTest {

    @org.testng.annotations.Test
    void testEsLaMismaInstancia() {
        Undo instancia1 = Undo.getInstance();
        Undo instancia2 = Undo.getInstance();


        assertSame(instancia1, instancia2, "Deberían ser la misma instancia");
    }

    @Test
    void testHistorialCompartido() {
        Undo u1 = Undo.getInstance();
        Undo u2 = Undo.getInstance();

        u1.addCommand("git add .");


        assertEquals("git add .", u2.undoCommand());
    }
}