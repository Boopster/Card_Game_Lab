import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Game game = new Game();

        System.out.println("---------");
        System.out.println("Blackjack");
        System.out.println("---------");
        System.out.println("Please enter your name: ");

        String playerName = scanner.next();

        Player player1 = new Player(playerName);
        Player player2 = new Player("Dealer");

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addCardToHand();
        game.addCardToHand();

        for (int i = 0; i < player1.countNoCardsPlayerHand(); i++) {
            System.out.println(player1.showCard(i));
        }
        System.out.println(String.format("%s's Total: %s", player1.getName(), player1.getTotalPlayerHand()));
        System.out.println(String.format("%s, would you like to twist? (y/n)", player1.getName()));

        String twist = scanner.next();

//        int total = player.getTotalPlayerHand();
//        if (total < 21 && twist.equals("y")) {

        game.playerTwist(twist, player1, player2);

        if (twist.equals("y")) {
            for (int i = 0; i < player1.countNoCardsPlayerHand(); i++) {
                System.out.println(player1.showCard(i));

            }
        } else {
            for (int i = 0; i < player2.countNoCardsPlayerHand(); i++) {
                System.out.println(player2.showCard(i));
            }
            System.out.println(String.format("%s's Total: %s", player1.getName(), player1.getTotalPlayerHand()));
            System.out.println(String.format("The Dealer's Total: %s", player2.getTotalPlayerHand()));


//        System.out.println(String.format("%s, would you like to twist? (y/n)", player1.getName()));
//
//        twist = scanner.next();
//        game.playerTwist(twist, player1);
//
//        for(int i = 0; i < player1.countNoCardsPlayerHand(); i ++){
//            System.out.println(player1.showCard(i));
//        }
//        System.out.println(String.format("%s's Total: %s", player1.getName(), player1.getTotalPlayerHand()));
//
//        for(int i = 0; i < player2.countNoCardsPlayerHand(); i ++){
//            System.out.println(player2.showCard(i));
//        }
//        System.out.println(String.format("The Dealer's Total: %s", player2.getTotalPlayerHand()));

//        System.out.println(player2.getCardsPlayerHand());
//        System.out.println(player1.getName() + "'s hand: " + player1.getPlayerHand().getValueFromEnum());
//        System.out.println("The dealer's hand: " + player2.getPlayerHand().getValueFromEnum());
//        System.out.println(game.getResult(player1,player2));

        }
    }
}



