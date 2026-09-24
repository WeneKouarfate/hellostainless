//> using scala 3.7.2
//> using dep ch.epfl.lara::stainless-library:0.9.9.2
//> using plugin ch.epfl.lara:::stainless-dotty-plugin:0.9.9.2
//> using options -Xplugin-require:stainless -P:stainless:verify:true -P:stainless:ghost-elim:true

import stainless.lang._

object Hello {
  def factorial(n: BigInt): BigInt = {
    require(n >= 0)
    if (n == 0) {
      BigInt(1)
    } else {
      n * factorial(n - 1)
    }
  }.ensuring(res => res > n)   // deliberately invalid at n = 1
}
