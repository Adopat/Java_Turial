package chapter16;



import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.baidu.com/s?ie=UTF-8&wd=11");
        System.out.println("获取主机名: "+url.getHost());
        System.out.println("获取协议: +"+url.getProtocol());
        System.out.println("获取端口号 :"+url.getPort());
        System.out.println("获取路径 ："+url.getPath());
        System.out.println("获取路径1 ："+url.getFile());
        System.out.println("获取查询参数 :"+url.getQuery());
        // 返回URLConnection 子类对象指向父类,获取请求
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("==============");
        if(responseCode>=200 && responseCode<=299){
            try(InputStream in =httpURLConnection.getInputStream();
                BufferedReader bur = new BufferedReader(new InputStreamReader(in));
            ){
                StringBuilder response = new StringBuilder();
                String currentLine;
                while( (currentLine = bur.readLine())!=null){
                    response.append(currentLine);
                }
                System.out.println(response.toString());

            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
