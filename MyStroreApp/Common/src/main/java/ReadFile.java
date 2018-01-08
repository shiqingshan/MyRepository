import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    /* 读入TXT文件 */
    public static void main(String [] args) {
        String pathname = "D:\\input.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
        File filename = new File(pathname); // 要读取以上路径的input。txt文件
        InputStreamReader reader = null; // 建立一个输入流对象reader
        try {
            reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line = "";
            String ssss="";
            int row = 0;
            List list = new ArrayList();
            while((line =br.readLine()) !=null)

            {
                String[] str = line.split("\\|");
                ssss = str[0].toString();
                if(row > 1000){
                    List list1=new ArrayList();
                    if(row%1000==0){
                        list1.add(ssss);
                        ctl.save(list1);
                        list1.clear();
                    }else{
                        list1.add(ssss);
                    }
                }else{
                    list.add(ssss);
                }
                row++;
            }
           // ctl.save(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
