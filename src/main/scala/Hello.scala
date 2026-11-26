import stainless.lang._

object Hello {
  def factorial(n: BigInt): BigInt = {
    require(n >= 0)
    if (n == 0) {
      BigInt(1)
    } else {
      n * factorial(n - 1)
    }
  }.ensuring(res => res >  n)
  
  def factorialStep(n: BigInt): Boolean = {
    require(n >= 0)
    factorial(n + 1) == (n + 1) * factorial(n)
  }.holds

  sealed abstract class Tree12[A]
  final case class Leaf[A]() extends Tree12[A]
  final case class One[A](a: A, t: Tree12[A]) extends Tree12[A]
  final case class Two[A](a: A, t1: Tree12[A], t2: Tree12[A]) extends Tree12[A]

  def foldTree12(tree: Tree12[BigInt]): BigInt = {
    tree match {
      case Leaf() => BigInt(1)
      case One(a, t) => a + foldTree12(t)
      case Two(a, t1, t2) => a * (foldTree12(t1) + foldTree12(t2))
    }
  }.ensuring(res => res > 0)
}
