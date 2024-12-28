public class Strings {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "World";
    System.out.println(s1 + " " + s2);
    System.out.println(s1.concat(s1.concat(s2)));
    System.out.println(s1.length());
    System.out.println(s1.charAt(0));
    System.out.println(s1.indexOf("l"));
    System.out.println(s1.indexOf("l", 2));
    System.out.println(s1.substring(2));
    System.out.println(s1.substring(2, 4));
    System.out.println(s1.replace("l", "L"));
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println(s1.trim());
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));
    System.out.println(s1.contains("l"));
    System.out.println(s1.startsWith("H"));
    System.out.println(s1.endsWith("l"));
    System.out.println(s1.isEmpty());
    System.out.println(s1.isBlank());
    System.out.println(s1.hashCode());
    System.out.println(s1);
    System.out.println(s1.trim());
    System.out.println(s1.trim().length());

  }

}
