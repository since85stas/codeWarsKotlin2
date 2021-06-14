import java.io.*

class Tekkery {

    fun main(args: Array<String>) {


//        prepareText();
//        long start = System.currentTimeMillis();
//
//        long end = System.currentTimeMillis();
//        System.out.println("read in " + (end - start));
//        long start = System.currentTimeMillis();
////        sortText(mass);
//        sortTenTimes();
//        long end = System.currentTimeMillis();
//        System.out.println("sort in " + (end-start)/10);
        val massFull: Array<String?> = readPrepText("prep_text.txt")
        val start = System.currentTimeMillis()
        val dict: HashMap<String, Int?> = countWords(massFull)
        outDict(dict)
        val end = System.currentTimeMillis()
        println("count in " + (end - start))
    }

    @Throws(IOException::class)
    private fun readPrepText(path: String): Array<String?> {
        val reader = BufferedReader(InputStreamReader(FileInputStream(File(path))))
        val size = reader.readLine()
        val count = size.toInt()
        val text = arrayOfNulls<String>(count)
        for (i in 0 until count) {
            text[i] = reader.readLine()
        }
        return text
    }

    private fun sortText(text: Array<String>) {
        for (i in 0 until text.size - 1) {
            for (j in i + 1 until text.size) {
                if (text[i].compareTo(text[j]) > 0) {
                    val tmp = text[i]
                    text[i] = text[j]
                    text[j] = tmp
                }
            }
        }
        println("")
    }

    private fun countWords(text: Array<String?>): HashMap<String, Int?> {
        val dict = HashMap<String, Int?>()
        for (s in text) {
            if (dict.containsKey(s)) {
                dict[s!!] = dict[s]!! + 1
            } else {
                dict[s!!] = 1
            }
        }
        return dict
    }

    private fun outDict(dic: HashMap<String, Int?>) {
        val words = dic.keys.toTypedArray()
        val numb = dic.values.toTypedArray()
        for (i in 0 until numb.size - 1) {
            for (j in i + 1 until numb.size) {
                if (numb[j]!! > numb[i]!!) {
                    val tmp = words[i]
                    words[i] = words[j]
                    words[j] = tmp
                    val tmpi = numb[i]
                    numb[i] = numb[j]
                    numb[j] = tmpi
                }
            }
        }
    }

}