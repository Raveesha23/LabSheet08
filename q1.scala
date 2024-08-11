object CaesarCipher {
    def encrypt(text: String, shift: Int): String = {
        text.map { char =>
            if (char.isLetter) {
                val base = if (char.isUpper) 'A' else 'a'
                ((char - base + shift) % 26 + base).toChar
            } else {
                char
            }
        }
    }

    def decrypt(text: String, shift: Int): String = {
        encrypt(text, 26 - shift)
    }

    def cipher(text: String, shift: Int, func: (String, Int) => String): String = {
        func(text, shift)
    }

    def main(args: Array[String]): Unit = {
        val text = "Hello, World!"
        val shift = 3

        val encryptedText = cipher(text, shift, encrypt)
        println(s"Encrypted: $encryptedText")

        val decryptedText = cipher(encryptedText, shift, decrypt)
        println(s"Decrypted: $decryptedText")
    }
}
