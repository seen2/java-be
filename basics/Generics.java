public class Generics {

  public static void main(String[] args) {
    RestClient<StringBuffer> stringRestClient = new RestClient<>();
    try {
      System.out.println(stringRestClient.call("https://example.com"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}

interface NetworkCall<T> {
  T call(String uri);
}

class RestClient<T> implements NetworkCall<T> {

  @SuppressWarnings({"unchecked", "RedundantStringConstructorCall"})
  @Override
  public T call(String uri) {
    if (uri == null || uri.isEmpty()) {
      throw new IllegalArgumentException("URI cannot be null or empty");
    }
    try {
      // Assuming T has a constructor that accepts a String
      return (T) new String(uri); // Replace this with actual logic to create a T instance
    } catch (Exception e) {
      throw new RuntimeException("Failed to fetch data", e);
    }
  }
}


