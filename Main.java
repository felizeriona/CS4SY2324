class Main {
  public static void main(String[] args) {
    
    String name1 = "Megumi Acorda";
    String name2 = "Cage the Elephant";
    String name3 = "The Strokes";

    String genre1 = "Dream Pop";
    String genre2 = "Indie Rock";
    String genre3 = "Indie Rock";
      
    int albums1 = 2;
    int albums2 = 6;
    int albums3 = 6;

    System.out.println("Artist 1");
    System.out.println("Name: " + name1);
    System.out.println("Genre: " + genre1);
    System.out.println("Albums: " + albums1);
    
    System.out.println("\n" + "Artist 2");
    System.out.println("Name: " + name2);
    System.out.println("Genre: " + genre2);
    System.out.println("Albums: " + albums2);
    
    System.out.println("\n" + "Artist 3");
    System.out.println("Name: " + name3);
    System.out.println("Genre: " + genre3);
    System.out.println("Albums: " + albums3);

    System.out.println("\n" + "Total albums: " + (albums1 + albums2 + albums3));
    System.out.println("Megumi Acorda released the least albums: " + ((albums1 < albums2) && (albums1 < albums3)));
    System.out.println("Atleast two of the artists share the same genre: " + ((genre1 == genre2) || (genre1 == genre3) || (genre2 == genre3)));
  }
}