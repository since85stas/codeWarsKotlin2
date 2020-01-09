import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class BiblioticTest {

    @Test
    fun test01() {
        var b = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
        var c = arrayOf("A", "B", "C", "D")
        var res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
        assertEquals( Bibliotic().stockSummary(b,c),res )
    }
}