public class Lowercasetheletter {
    public static void main(String args[]) {
        // problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);
        // problem 2.
        String text = "To Letter Case";
        text = text.replace(" ", "_");
        System.out.println(text);// we can also used stringbuilder with setcharAt,to relace

        String letter = "Dear<|name|>,thanks alot";
        letter = letter.replace("<|name|>", "Shuja");
        System.out.println(letter);

        // to detect double and triple space in a string .
        // useing indexOf
        String mystring = "this string contain  double and   triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf(" "));
        // format the letter using escape sequence
        String leeter = "Dear  Harry,\n\tThis java course is nice \n\tThanks ";
        System.out.println(leeter);

    }
}
