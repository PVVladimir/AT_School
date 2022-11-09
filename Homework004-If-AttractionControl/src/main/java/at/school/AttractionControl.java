package at.school;

public class AttractionControl {
    public static void main(String[] args) {
        final int childHeight = 160;
        final boolean childWithParent = false;
        if (childHeight >= 160 || childWithParent) {
            System.out.println("Можно на аттракцион.");
        } else {
            System.out.println("Нельзя на аттракцион.");
        }
    }
}
