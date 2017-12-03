/**
 * Created by temchannat on 12/3/17.
 */
public class Main {


    private Name name = new Name();
    private Cake cake = new Cake();
    BirthdayWishes birthdayWishes = new BirthdayWishes();

    void startToWish() {
        System.out.println(birthdayWishes.getHappyBirthday());
        System.out.println(birthdayWishes.getDate() + "\n\n\n");
        System.out.println(name.getFullName());
        System.out.println(cake.getCake());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startToWish();
    }
}
