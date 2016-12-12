/**
 * Created by e165737 on 2016/12/12.
 */
public class main {
    public static void main(String[] args){
        String str = "3.14";

        try {
            System.out.println("文字列の長さ:"+str.length());
            Double.parseDouble(str);
        }
        catch (NullPointerException e) {
            System.out.println("エラー:" + e.toString() + "が発生プログラムを終了。");
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("エラー:" + e.toString() +"が発生プログラムを終了。" );
            e.printStackTrace();
        }
    }

}

