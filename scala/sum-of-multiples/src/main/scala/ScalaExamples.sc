// Scala examples

// class instantiation and objects
class Cat(val name: String, val color: String, val food: String)

object ChipShop {
  def willServe(kitty: Cat): Boolean =
    if(kitty.food == "Chips") true else false
}

val oswald = new Cat("Oswald", "Black", "Milk")
val henderson = new Cat("Henderson", "Ginger", "Chips")

ChipShop.willServe(oswald)
ChipShop.willServe(henderson)
//-----------------------------------------

// infix notation, and the special "apply" method to make objects behave like functions
class Adder(val i: Int) {
  def apply(in: Int): Int = i + in
  def !(in: Int): Int = (i + in) * 10
}

val add5 = new Adder(5)

add5(4)
add5.apply(4)
add5 apply 4
add5 ! 4
//-------------------------------------------
