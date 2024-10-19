public class p1BP {
    public static void main(String[] args) {
        int num = 255;
        String s = Integer.toBinaryString(num);
        int i=0;
        int j=s.length()-1;
        int noteq=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                noteq+=1;
                break;
            }
            i++;
            j--;
        }
        if(noteq!=0){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
        
    }
}
