object Caesar_Cipher {

    def main(args: Array[String]): Unit = {
      val plaintext = scala.io.StdIn.readLine("Enter the text -: ")
      val shift = scala.io.StdIn.readLine("Enter the number of shifts -: ").toInt

      println()
      println("1 - Encrypt the Text")
      println("2 - Decrypt the Text")
      println()
      val choice = scala.io.StdIn.readLine("Enter your choice - ").toInt

      println(selectChoice(choice, plaintext, shift))
    }

    def selectChoice(choice: Int, text: String, shift: Int): String = {
      choice match {
        case 1 => "Encrypted -: " + caesarCipher(text, shift, caesarEncrypt)
        case 2 => "Decrypted -: " + caesarCipher(text, shift, caesarDecrypt)
        case _ => "You made an Invalid choice"
      }
    }


    def caesarEncrypt(plainText: String, shift: Int): String = {
      val alphabetSize = 26

      plainText.map { char_Input =>
        if (char_Input.isLetter) {
          val isUpperCase = char_Input.isUpper
          val base = if (isUpperCase) 'A' else 'a'
          val shiftedChar = ((char_Input - base + shift + alphabetSize) % alphabetSize + base).toChar

          if (isUpperCase) shiftedChar
          else shiftedChar.toLower
        }
        else {
          char_Input
        }
      }
    }


    def caesarDecrypt(cipherText: String, shift: Int): String = {
      caesarEncrypt(cipherText, -shift)
    }


    def caesarCipher(text: String, shift: Int, func: (String, Int) => String): String = {
      func(text, shift)
    }
  }
