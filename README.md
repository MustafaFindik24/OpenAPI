# OpenAPI Nedir?

Open API, kod tarafında oluşturduğumuz metotları çalıştırabildiğimiz, tek bir arayüzde dökümantasyonunu kolayca listeleyebildiğimiz bir API'dır. Yazılımcı veya uygulama destek ekibi arka planda oluşturulan metotları bilmesine gerek kalmadan kullanabilmesi işleri kolaylaştırır. Bu şekilde son kullanıcıların uygulama içi yaşadıkları sorunlar yazılım ekibine ulaşmadan Level 1 düzeyinde çözülmüş olur.

![API-1-1-1024x377](https://user-images.githubusercontent.com/91599453/219013362-1180af61-83b5-470a-a5f8-e01c3013a60d.png)

Open API açık kaynak desteği sağladığı için dışarıdan kullanıcılar erişim sağlayabilir. Bu yazılımın evrenselliğini sağlar ve projelerin daha hızlı test edilmesi, projenin geliştirilmesi konularında kolaylık getirir. Daha az kodlama yapılarak oluşturulan yazılımın entegrasyonu kolaylaştırılmış olur.

# Spring boot projesinde Swagger kullanımı

İşe alınacak adayların bilgilerini yönetmek amacıyla oluşturulan bir projedir. Swagger UI kullanılarak http metotlarının dökümantasyonu sağlanmıştır.

Spring boot projesindeki pom.xml dosyasındaki dependency kısmı aşağıdaki şekildedir.

![image](https://user-images.githubusercontent.com/91599453/219016542-6c033aa3-2cf4-4360-a235-0208ed181c8c.png)

Daha sonra MVC yapısıyla oluşturulan projenin paketlemesi bu şekildedir.

![image](https://user-images.githubusercontent.com/91599453/219017141-958f6524-99a9-49f8-8507-c2cc4750267a.png)

application.properties dosyasında Postgresql DB bağlantısı ve Swagger UI propertyleri oluşturuldu.

![image](https://user-images.githubusercontent.com/91599453/219017613-2a3f90ad-9654-4751-9b0f-7442a9b32405.png)


