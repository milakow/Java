package org.advancedPart.anonymousClasses.lambdaExpression;

/**
 * Create TextConverter interface with proper abstract method and use it to
 * create lambda expressions that take text fragment and count and return
 * as int how many dots symbols (“.”) were used in the text
 */
public class TextConverterDemo {
    public static void main(String[] args) {
        String text1 = "Lorem Ipsum jest tekstem stosowanym jako przykładowy wypełniacz w przemyśle poligraficznym. " +
                "Został po raz pierwszy użyty w XV w. przez nieznanego drukarza do wypełnienia tekstem próbnej książki. " +
                "Pięć wieków później zaczął być używany przemyśle elektronicznym, pozostając praktycznie niezmienionym. " +
                "Spopularyzował się w latach 60. XX w. wraz z publikacją arkuszy Letrasetu, zawierających fragmenty Lorem Ipsum," +
                " a ostatnio z zawierającym różne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druków na komputerach osobistych, jak Aldus PageMaker";
        TextConverter textConverter = text -> {
          int dotCounter = 0;
          String[] signs = text.split("");
          for (String sign : signs) {
              if (sign.equals(".")) {
                  dotCounter += 1;
                  }
              } return dotCounter;
        };
        System.out.println(textConverter.countDots(text1));
    }
}


interface TextConverter{
    int countDots(String s);

}
