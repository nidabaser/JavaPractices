//Metotların Kapsamı (Scope) Nedir?

//Java'da bir değişkenin veya metotun kapsamı, o değişkenin veya metotun hangi bölümlerden erişilebilir olduğunu belirler.
//Kapsam, genellikle değişkenin veya metotun bildirildiği yerden başlar ve sona erdiği blok sonuna kadar devam eder.

//Örnek 1: Yerel Değişkenler
public class Main {    
    public static void main(String[] args) {        
        int x = 10;        
        System.out.println(x);  // Output: 10    
    }   
 
    public static void someMethod() {        
        System.out.println(x);  // Hata: x değişkeni erişilebilir değil    
    }
}
//Bu örnekte, x değişkeni main metodu içinde bir yerel değişkendir ve yalnızca bu metodun içinde erişilebilir.
//someMethod içinden x'e erişmeye çalışmak bir hata verecektir.

//Örnek 2: Metot Parametreleri
public class Main {    
    public static void main(String[] args) {        
        int y = 20;        
        printNumber(y);  // Output: 20    
    }    

    public static void printNumber(int num) {        
        System.out.println(num);    
    }
}
//Bu örnekte, num değişkeni printNumber metodu için bir parametredir ve yalnızca bu metodun içinde erişilebilir.

//Örnek 3: Sınıf Değişkenleri
public class Main {    
    static int z = 30;    

    public static void main(String[] args) {        
        System.out.println(z);  // Output: 30    
    }    

    public static void printZ() {        
        System.out.println(z);  // Output: 30    
    }
}
//Bu örnekte, z bir sınıf değişkenidir ve bu sınıfın tüm metotlarından erişilebilir.

//Örnek 4: Yerel Değişkenlerin Kapsamı
public class Main {    
    public static void main(String[] args) {        
        int a = 10;  
     
        if(a > 5) {            
            int b = 20;            
            System.out.println(b);  // Output: 20        
        }        

        System.out.println(b);  // Hata: b değişkeni erişilebilir değil    
     }
}
//Bu örnekte, b değişkeni yalnızca if bloğunun içinde erişilebilir. Bu blok dışından b'ye erişmeye çalışmak bir hata verecektir.

//Örnek 5: Yerel Değişkenler ve Parametreler
public class Main {    
    public static void main(String[] args) {        
        int a = 10;        
        modifyNumber(a);        
        System.out.println(a);  // Output: 10    
     }    

      public static void modifyNumber(int a) {        
            a = a * 2;        
            System.out.println(a);  // Output: 20    
       }
}
//Bu örnekte, her iki a değişkeni de kendi kapsamlarında erişilebilir.
//modifyNumber metodu içinde a değişkenini değiştirmek, main metodu içindeki a değişkenini etkilemez.

//Örnek 6: Metotlarda Kapsam
public class Main {    
    public static void main(String[] args) {        
        int a = 10;        
        someMethod();        
        System.out.println(a);  // Output: 10    
    }    
    
    public static void someMethod() {        
        int a = 20;        
        System.out.println(a);  // Output: 20    
    }
}
//Bu örnekte, her iki a değişkeni de kendi metotlarının içinde erişilebilir.
//Her biri farklı bir kapsamda olduğu için, birbirlerini etkilemezler.
