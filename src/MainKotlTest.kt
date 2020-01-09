import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class MainKotlTest{

    @Test
    fun test01 () {
        val m = SpinWords();
        assertEquals( m.spinWords2("Hey fellow warriors"),"Hey wollef sroirraw" )
    }

    @Test
    fun test02 () {
        val m = SpinWords();
        assertEquals( m.spinWords2("This is a test"),"This is a test" )
    }

    @Test
    fun test03 () {
        val m = SpinWords();
        assertEquals( m.spinWords2("This is another test"),"This is rehtona test" )
    }
}