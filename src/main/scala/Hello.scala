import stainless.lang._

object Hello {
  def factorial(n: BigInt): BigInt = {
    require(n >= 0)
    if (n == 0) {
      BigInt(1)
    } else {
      n * factorial(n - 1)
    }
  }.ensuring(res => res > n)
}
