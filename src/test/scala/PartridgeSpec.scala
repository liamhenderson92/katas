import org.scalatest.{MustMatchers, WordSpec}

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" must {

    "part is called" when {

      "return 'Lynn, I've pierced my foot on a spike!!' if empty args" in {
        Partridge.part(Array("")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }

      "return 'Lynn, I've pierced my foot on a spike!!' if no matches found" in {
        Partridge.part(Array("Sausage", "Pie")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }

      "return win phrase with one exclamation point when given one match for terms" in {
        Partridge.part(Array("Grouse", "Partridge", "Pheasant")) mustEqual "Mine's a Pint!"
      }


      "return win phrase with three exclamation points when three matches for terms " in {
        Partridge.part(Array("PearTree","Chat","Dan","Bob", "Jones")) mustEqual "Mine's a Pint!!!"
      }


      "return win phrase with eight exclamation points when given exact match for terms " in {
        Partridge.part(Array("PearTree","Chat","Dan","Toblerone","Lynn","AlphaPapa","Nomad","Partridge")) mustEqual "Mine's a Pint!!!!!!!!"
      }

    }

  }

}
