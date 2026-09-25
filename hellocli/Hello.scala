//> using scalaOrganization ch.epfl.lara
//> using repository ivy2Local
//> using repository m2Local
//> using scala 3.10.1-RC1-bin-20260903-e1f9361-NIGHTLY
//> using dep ch.epfl.lara::stainless-library:0.10.2-9-g399c34a
//> using plugin ch.epfl.lara:::stainless-dotty-plugin:0.10.2-9-g399c34a
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
