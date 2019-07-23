public class AddString {

   /* Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

    Note:

    The length of both num1 and num2 is < 5100.
    Both num1 and num2 contains only digits 0-9.
    Both num1 and num2 does not contain any leading zero.
    You must not use any built-in BigInteger library or convert the inputs to integer directly.*/

    public static void main(String[] args){
        System.out.print("result="+addStrings("123","456"));
    }

    public static String addStrings(String num1, String num2) {
       int i=num1.length();
       int j=num2.length();
       int carry=0;
       StringBuilder stringBuilder=new StringBuilder(Math.max(num1.length(),num2.length()));
       while (i>0 || j>0){
           if (i>0) {
               //carry+=Integer.valueOf(num1.charAt(i-1));
               carry+=num1.charAt(i-1)-'0';
               System.out.print("num1="+Integer.valueOf(num1.charAt(i-1))+",,"+num1.charAt(i-1)+"\n");
           }
           if (j>0) {
               //carry+=Integer.valueOf(num2.charAt(j-1));
               carry+=num2.charAt(j-1)-'0';
               System.out.print("num2="+Integer.valueOf(num2.charAt(j-1))+"\n");
           }
           stringBuilder.append(carry%10);
           //System.out.print("carry="+carry+",,"+(carry%10)+",,"+(carry/10)+",,"+stringBuilder.toString()+"\n");
           carry=carry/10;
           i--;
           j--;
       }
        if (carry==1) {
            stringBuilder.append(1);
        }

       return stringBuilder.reverse().toString();
    }
}
