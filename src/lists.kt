import javax.management.MBeanRegistration

fun main(){
println(peopleNames(listOf("Grace", "Jezebel", "Nancy", "Joseph","Janet", "Caroline", "Daisi", "Sophie", "Joyce", "William")))
println(averageHeight(listOf(3.5,3.2,1.5,4.8,2.8) as MutableList<Double>))
  attributes()
  addPeople()

 var Golf= listOf(
  Car("KBR102A", 120),
 Car("KDA783B", 180),

 )
 println(averageMilieage(listOf(120,180)))
 }

fun peopleNames(name:List<String>): List<String>{
 val names= mutableListOf<String>()
 for (b in name){
      if (name.indexOf(b) % 2==0) {
           names.add(b)
      }
 }
 return  names
}

 fun averageHeight(heights:MutableList<Double>): Double{
  var average=heights.average()
  var total=heights.sum()
  println(total)
  return average
 }

 data class Person(var name: String, var age: Int,var height: Double, var weight:Double)

 fun attributes(){
var Person = listOf(
 Person("Beth",20,1.6, 5.2),
 Person("Daisi",19,4.8, 40.8),
 Person("Jane",30,2.6, 30.9),
 Person("Joseph",70,5.7, 60.1)
 )
  var sortedAge=Person.sortedByDescending { Person->Person.age }
  println(sortedAge)

 }

 data class People(var name: String, var age: Int,var height: Double, var weight:Double)

 fun addPeople(){
  var human= mutableListOf(
   People("George",20,1.6, 5.2),
   People("Daisi",19,4.8, 40.8),
   People("Jane",30,2.6, 30.9),
   People("Joseph",70,5.7, 60.1),
  )
  human.addAll(listOf(
   People("James", 26, 3.2, 63.4),
  People("Albert",55, 5.0,4.6),


  ))
  println(human)

 }

data class Car(var registration: String, var mileage: Int)

fun averageMilieage(mileage:List<Int>): Int{
 var a = mileage.average().toInt()
 return a
}

