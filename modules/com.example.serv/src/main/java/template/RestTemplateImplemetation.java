package template;

import java.lang.reflect.Type;
import java.util.Map;

import org.apache.commons.httpclient.HttpException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.internal.Primitives;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class RestTemplateImplemetation implements IRestTemplate{
  private Gson gson = new Gson();

  private static final Log log = LogFactoryUtil.getLog(RestTemplateImplemetation.class);

  @Override
  public <T> T serviceInvocation(String url, Class<T> classOfT, Map<String, String> parameters, HttpMethod method) {
    try {
      HttpHeaders requestHeader  = new HttpHeaders();
      requestHeader.setContentType(MediaType.APPLICATION_JSON);
      
  
      RestTemplate restTemplate = new RestTemplate();
  
      ResponseEntity<String> responseEntity = restTemplate
        .exchange(
          url,
          method,
          new HttpEntity<String>(requestHeader),
          String.class
        );
  
      HttpStatus statusCode = responseEntity.getStatusCode();
  
      if(statusCode == HttpStatus.OK){
        JSONObject respJsonObject =  JSONFactoryUtil
        .createJSONObject(responseEntity.getBody());
        
        Object pojo = gson.fromJson(respJsonObject.toString(), (Type) classOfT);

        return Primitives.wrap(classOfT).cast(pojo);
  
      }

      throw new HttpException("Bad response, status code " + statusCode);
    } catch (Exception e) {
      log.error(e);

      return null;
    }
   

//https://mocki.io/v1/b167617f-f587-4756-8e65-16efbd8843b3

  }
  
}
