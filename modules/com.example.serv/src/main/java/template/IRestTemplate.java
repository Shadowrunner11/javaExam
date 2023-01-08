package template;

import java.util.Map;
import org.springframework.http.HttpMethod;

public interface IRestTemplate {
  public <T> T serviceInvocation(String url, Class<T> classOfT, Map<String, String> parameters, HttpMethod method);
}
