package stringBuffer;

public class MyStringBuffer {

    public static void main(String[] args)
    {
        StringBuilder stbu = new StringBuilder();  // StringBuilder usage
        System.out.println(stbu.capacity());  // Initial object size

        // Using StringBuffer (correct class now)
        StringBuffer stbr = new StringBuffer("InterviewBit");
        System.out.println(stbr);

        stbr.append(" Articles");  // String update
        System.out.println(stbr);

        stbr = new StringBuffer("Scaler");
        System.out.println(stbr);
    }

}
