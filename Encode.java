import java.io.*;
public class Encode{
    public static void print2DArray(char arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf(arr[j][i]+"");
            }
        }
        System.out.printf("\n");
    }
    public static int countWords(String str){
        int count = 1;
        for (int i=0;i<=str.length()-1;i++){
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static int lenghtLongstWord(String str){
        int maxL=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
            if(count>maxL){
                maxL=count;
            }
            if(str.charAt(i)==' '){
                count=0;
            }
        }
        return maxL;
    }
      public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string to be coded.");
        String tmp=br.readLine();
        int length=tmp.length();
        char c[]= new char[length];
        tmp.getChars(0,length,c,0);
        int col=countWords(tmp)+1;
        int row=lenghtLongstWord(tmp)+1;
        System.out.println("The number of rows is "+row+" and the number of columns is "+col);
        char array[][]=new char[col][row];
        int i=0,j=0;
        for(int p=0;p<length;p++){                        //Start giving values of the 2D array
            if(c[p]!=' '){
                array[j][i]=c[p];
                i++;
            }
            else{
                array[j][i]='*';
                j++;
                i=0;
            }
        }
        array[j][i]='*';
        for(i=0;i<row;i++){
            array[col-1][i]='$';
        }                                                //Finished giving values of the 2D array
        print2DArray(array,row,col);
    }
}
