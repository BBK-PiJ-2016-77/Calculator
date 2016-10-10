print "Please give me a number : "
String str1 = System.console().readLine()
double num1 = Double.parseDouble (str1)
print "Please give me another number : "
String str2 = System.console().readLine()
double num2 = Double.parseDouble (str2)
println "What do u want to do next?"
println "Press 1 for +, 2 for -, 3 for /, 4 for * and 5 for %"
String str3 = System.console().readLine()
int i = Integer.parseInt(str3)
if(i<1 || i>5) {
  println "Please enter an Integer between 1 and 5"
} else {
  if(i==1) {
     println num1 + num2
  }
  if(i==2) {
    println num1 - num2
  }
  if(i==3) {
    println num1 / num2
  }
  if(i==4) {
    println num1 * num2
  }
  if(i==5) {
    println num1%num2
  }
}
