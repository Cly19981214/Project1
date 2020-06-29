package cn.java.array;

import com.java.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/*
    1.idea中模板所处位置 settings-Editor-Live Templates/Postfix Completion
    2.常用模板如下
 */
public class TemplatesTest {
    //模板六  prsf 可以生成 private static final
    private static final Customer cust=new Customer();
    //模板七 psf/psfi/psfs
    public static final int NUM=1;
    public static final int num=2;
    public static final String s="a";

    //1.psvm
    public static void main(String[] args) {

        //2.sout
        System.out.println();
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));//soutp 输出形参
        System.out.println("TemplatesTest.main");//soutm 输出当前方法
        int num=10;
        System.out.println("num = " + num);//soutv 测试变量是多少
        //xxx.sout     相当于System.out.println(xxx);

        //模板三 fori
        String[] arr=new String[] {"李磊","王五"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四 list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形 list.fori 从头开始遍历
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr 从末尾开始遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
}
