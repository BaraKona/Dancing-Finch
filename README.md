### `About`
# Dancing-Finch
This Java project was assigned to me during my first year of university.
It involved coding a finch robot supplied to us with its basic functions.
My task in particular was the Dancing Finch Task. This involved coding an algorithm that would convert a Hexadecimal number into its binary, octal and decimal equivalents.

### `How`
User would be prompted to enter a single , or double digit hexadecimal number(Hex.num), or choose to run the program using a randomly.generated Hex.num.
Then, having converted the number, the program would instruct the finch robot to run.

The Decimal.num would be used to generate RGB values which in turn would change the colour of the finch lights.
Red, would be the Decimal.num, Green = (Red%80) multiplied by 3. If Green > Red, then Blue = Green; Meanwhile, if Red => Green, Blue = Red;

The Octal.num would be assigned to the speed value (spd) of the finch. This would only occur if spd > 60. If not, spd = spd + 50;
The Hex.length(length of the hexadecimal number) would determine the duration of movement.
If Hex.length = 2, it would rotate(move) for 1000 miliseconds, otherwise, if Hex.length =1, it would move for 500 miliseconds.

The Binary.num would determine the direction of the movement. If Binary.num (charAt(x)) = 1, the finch would move forwards, rotating wheels according to spd.
Likewise, if Binary.num (charAt(x)) = 0, it would backwards -spd for a duration of time specified by Hex.length.

Finally, the user would be prompted to either restart the program selecting a new Hex.num, quit the program.
The program is repeatable potentially infinite times. Adding the Hex.num to a text.file after each turn. This way, you can view all the numbers that have been input so far.

