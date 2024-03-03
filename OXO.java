public class Main {
  final static String GAMENAME = "OXO GAME";

  public static void main(String[] args) {
    //SETUP
    printWelcomeMessage();
    String setup = getSetup(args);



    char[][] oxo = transformSetupToArray(setup);

    drawOXO(oxo);

    //FIND WINNER (APPLY RULES)
    char winner = ' ';
    String winningMethod = "";

    for (int i = 0; i < oxo.length; i++) {
      if (oxo[i][0] == oxo[i][1] && oxo[i][1] == oxo[i][2]) {
        winner = oxo[i][0];
        winningMethod = "row " + i;

      }
      if (oxo[0][i] == oxo[1][i] && oxo[1][i] == oxo[2][i]) {
        winner = oxo[0][i];
        winningMethod = "column " + i;
      }
    }

    int j = 1;

    if ((oxo[j - 1][j - 1] == oxo[j][j] && oxo[j][j] == oxo[j + 1][j + 1]) ||
            (oxo[j - 1][j + 1] == oxo[j][j] && oxo[j][j] == oxo[j + 1][j - 1])) {
      winner = oxo[j][j];
      winningMethod = "diagonal";
    }

    //PRINT WINNER
    printWinner(winner, winningMethod);
  }


  public static void printWelcomeMessage() {
    System.out.println("Welcome to the " + GAMENAME + "!!");
    System.out.println("Enter the setup of the OXO game: ");
  }

  public static String getSetup(String[] args) {
    String setupEntry = args[0].toString(); //debido a que args detecta un espacio como posicion diferente y que  el formato esta en comillas, pues lo que se hace es siempre llamar a la primera posicion de array
    return setupEntry;
  }

  public static char[][] transformSetupToArray(String setupText) {
    char[] patters = setupText.toCharArray();
    int width = 0, height = 1;
    for(int c = 0; c < patters.length; c++){
      if(patters[c] == '#'){
        height++;
      }else if(patters[c] == ' ' || patters[c] == 'x' || patters[c] == 'o'){
        width++;
      }
    }
    width = width / height;
    char [][] oxo = new char[height][width];
    int change_of_lines = 0;
    int control_of_columns = 0;

    for (int i = 0; i < setupText.length(); i++) {
      if (patters[i] == 'o') {
        oxo[change_of_lines][control_of_columns] = 'o';
      } else if (patters[i] == 'x') {
        oxo[change_of_lines][control_of_columns] = 'x';
      } else if (patters[i] == ' ') {
        oxo[change_of_lines][control_of_columns] = ' ';
      }
      control_of_columns++;
      if (patters[i] == '#') {
        change_of_lines++;
        control_of_columns = 0;
      }
    }
    return oxo;
  }

  public static void drawOXO(char[][] oxo) {
    for (int i = 0; i < oxo.length; i++) {
      for (int j = 0; j < oxo.length; j++){
        System.out.print(oxo[i][j]);
      }
      System.out.print('\n');
    }
  }

  public static void printWinner(char winner, String winningMethod) {
    if (winner != ' ') {
      System.out.println("The winner is: " + winner);
      System.out.println("winning method: " + winningMethod);
    } else {
      System.out.println("It is a tie!!");
    }
  }

}