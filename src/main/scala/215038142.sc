
////1
//val a=10
////
////
//val b=20
////
//
//assert(a>=b)
//

////2


//}

//def getSquare(i: Int): Int =i*i
//
//val a = getSquare(3)
//print(a)
//
//
//
//val b = getSquare(6)
//print(b)
//
//val c =getSquare(5)
//print(c)
//

//// 3

  def getSquare(l: Double): Double = l * l

  val sd1 = getSquare(1.44)
  print(sd1)
  //assert(1.44==sd1," ")
  val sd2 = getSquare(5.7)
  print(sd2)
  //assert(32.49==sd2,"")

///////4
//a match {
//  case 10 => println("ten")
//  case x if x > 10 => println("greater than ten")
//  case _ => println("less than ten")
//}




//def isArg1GreaterThanArg2(d: Double,b:Double): Double
//
//val t1 =isArg1GreaterThanArg2(4.1,4.12)
//print(t1)
////assert("")
//
//val t2 =isArg1GreaterThanArg2(2.1,1.2)
//print(t2)

//assert()

/////5
def getMe(str: String) :String = str.toLowerCase()
val g1 =getMe("abraCaDabra")
//assert("abracadabra"==g1,"")
print(g1)

val g2 = getMe("zyxwVUT")
//assert("zyxwvut"==g2,"")
print(g2)

//////6
def addString(str: String, str1: String): String = str + str1
val s1 = addString("abc","def")
//assert()
print("abc"+s1)

val s2 = addString("zyx","abc")
//assert()
print(s2)

//////7
def manyTimesString(str: String, i: Int): String = str *2 +i


val m1 =manyTimesString("abc",3)
//assert("abcabcabc"==m1,"")
print(m1)

val m2 =manyTimesString("123",2)
//assert("123123"==m2,"")
print(m2)
/////8
////less than 18.5 between 18.5 -24.9 is normal weight bmi <25 over weight

def bmiStatus(i: Int, i1: Int): Int

val normal =bmiStatus(160,68)
//assert("Normal weight" ==normal,"Expected Normal weight,Got "+normal)

val overweight= bmiStatus(180,60)
//assert("Overweight"==overweight,"expre")






//def value(a:Int,b:Int) = (a>b)
//{
//
//  print("This is equal to a")
//
//}
//print("this is equal to b")


//////10 create a list
//var s=""
//val v = List(1,5,7,8)
//
// v.foreach(s=>s*7)
//


/////11 repeat

//var s=""
//val v=List(1,5,7,8)
//v.foreach(s=>s*7)

////////  15

//var s=""
//val words =List("word","cat","animal")
//words.foreach(s=>s*50)

/////////14






/////////// 13
//var s=""
//val numbers =List(1,2,5,3,7)
//numbers.map(s=>s*2)



