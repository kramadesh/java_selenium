package SeleniumPrograms;

public class UsingAdvancedLocators {
    public static void main(String[] args) {
        System.out.println("Showing different types of locators\n");
        System.out.println("Various Ways to locate elements: \n" +
                "-Class name \n"+
                "-Name \n"+
                "-CSS Selector \n"+
                "-ID  \n"+
                "-Link Text \n"+
                "-Tag name \n"+
                "-XPath \n"+
                "----------------------------------------- " );
        System.out.println("Best locators are:\n" +
                "-Unique \n"+
                "-Descriptive \n"+
                "-Static \n"+
                "----------------------------------------- ");
        System.out.println("Following are best avoided:\n" +
                "-Link Text - This works as long as links are unique on a page \n"+
                "-Tag Name - usually not unique or descriptive\n"+
                "-XPath - not descriptive \n"+
                "----------------------------------------- ");
        System.out.println("Preferred Locators:\n" +
                "-ID \n"+
                "-Class\n"+
                "-Name \n"+
                "-CSS selector \n"+
                "----------------------------------------- ");

        System.out.println("CSS Selector is very powerful:\n" +
                "-ID \n"+
                "-Class\n"+
                "-Name \n"+
                "-CSS selector \n"+
                "----------------------------------------- ");
    }
}
