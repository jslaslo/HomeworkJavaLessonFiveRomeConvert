import java.util.Map;

public class RomeConvert {
    static Map<Integer,String> dictionary = Map.of(
            1,"I",
            5,"V",
            10,"X",
            50,"L",
            100,"C",
            500,"D",
            1000,"M"
    );
    public static void main(String[] args) {
        String a  = convert(1111);
        System.out.println(a);
    }
    static String convert(int value){
        String romeValue = "";
        int result = value;
        while (result > 0){
            if(result >= 1000 ){
                romeValue = romeValue + dictionary.get(1000);
                result -= 1000;
            } else if (result >= 500) {
                romeValue = romeValue + dictionary.get(500);
                result -= 500;
            } else if (result >= 100) {
                romeValue = romeValue + dictionary.get(100);
                result -= 100;
            }else if (result >= 50) {
                romeValue = romeValue + dictionary.get(50);
                result -= 50;
            }else if (result >= 10) {
                romeValue = romeValue + dictionary.get(10);
                result -= 10;
            }else if (result >= 5) {
                romeValue = romeValue + dictionary.get(5);
                result -= 5;
            }else if (result >= 1) {
                romeValue = romeValue + dictionary.get(1);
                result -= 1;
            }
        }

        return romeValue;
    }
}
