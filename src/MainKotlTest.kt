import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class MainKotlTest{

    @Test
    fun test01 () {
        val m = SpinWords();
        assertEquals( m.spinWord("Hey fellow warriors"),"Hey wollef sroirraw" )
    }

    @Test
    fun test02 () {
        val m = SpinWords();
        assertEquals( m.spinWord("This is a test"),"This is a test" )
    }

    @Test
    fun test03 () {
        val m = SpinWords();
        assertEquals( m.spinWord("This is another test"),"This is rehtona test" )
    }
}