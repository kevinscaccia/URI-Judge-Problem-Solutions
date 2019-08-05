import java.util.*

fun main(args: Array<String>) {

 var scanner = Scanner(System.`in`)
	var a = scanner.next().toFloat()
	var b = scanner.next().toFloat()
	var media = ((a*3.5)+(b*7.5))/11
	var str = "MEDIA = %.5f\n".format(media)
	str = str.replace(',','.')
    print(str)
	
}