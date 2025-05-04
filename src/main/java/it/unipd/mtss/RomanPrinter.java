////////////////////////////////////////////////////////////////////
// Valerio Solito 2113178
// Bilal Sabic 2111022
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
    
        // Definisci la rappresentazione ASCII art orizzontale per ogni lettera romana
        String[][] asciiLetters = {
            {//Riga1
                "  __  __ ", // M
                "  _____  ",  // D
                "   _____ ",  // C
                "  _      ",  // L
                " __   __",  // X
                " __      __",  // V
                "  _____ " // I
            },

            {//Riga2
                " |  \\/  |", // M
                " |  __ \\ ",  // D
                "  / ____|",  // C
                " | |     ",  // L
                " \\ \\ / /",  // X
                " \\ \\    / /",  // V
                " |_   _|" // I
            },

            {//Riga3
                " | \\  / |", // M
                " | |  | |",  // D
                " | |     ",  // C
                " | |     ",  // L
                "  \\ V / ",  // X
                "  \\ \\  / / ",  // V
                "   | |  " // I
            },

            {//Riga4
                " | |\\/| |", // M
                " | |  | |", // D
                " | |     ", // C
                " | |     ", // L
                "   > <  ", // X
                "   \\ \\/ /  ", // V
                "   | |  " // I
            },
                
            {//Riga5
                " | |  | |", // M
                " | |__| |", // D
                " | |____ ", // C
                " | |____ ", // L
                "  / . \\ ", // X
                "    \\  /   ", // V
                "  _| |_ " // I
            },
                
            {//Riga6
                " |_|  |_|", // M
                " |_____/ ", // D
                "  \\_____|", // C
                " |______|", // L
                " /_/ \\_\\", // X
                "     \\/    ", // V
                " |_____|" // I
            },
        };
        
        for( int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                // Aggiungi la rappresentazione ASCII art orizzontale della lettera corrente
                asciiArt.append(asciiLetters[z]["MDCLXVI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}
