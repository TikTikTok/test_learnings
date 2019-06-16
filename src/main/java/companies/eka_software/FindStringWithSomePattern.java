package companies.eka_software;

public class FindStringWithSomePattern {

    public static void main(String[] args) {
        String string[] = {"Chandan Singh", "Singing","Sig","Singer","Chandan"};

        for (String str: string) {
            String lower = str.toLowerCase();
            if(lower.contains("sing"))
            {
                System.out.println(" Pring: "+str);
            }
        }
    }
}
