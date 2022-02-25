package Programming2;

public class removespace {

    public static void main(String[] args)
    {
        String str = "  when    for    when";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}
