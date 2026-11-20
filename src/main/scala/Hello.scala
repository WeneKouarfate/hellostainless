import stainless.lang._

object Hello {
  def factorial(n: BigInt): BigInt = {
    require(n >= 0)
    if (n == 0) {
      BigInt(1)
    } else {
      n * factorial(n - 1)
    }
  }.ensuring(res => res >= n)
  
  def factorialStep(n: BigInt): Boolean = {
    require(n >= 0)
    factorial(n + 1) == (n + 1) * factorial(n)
  }.holds
}
