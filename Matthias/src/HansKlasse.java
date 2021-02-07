import java.util.ArrayList;

public class HansKlasse {
    private String problemBeskrivelse = "ArrayListSkriv en metodemed navnet doesArraylistContainString, dermodtager 2parametrer: enarraylisteog enstreng.Metoden returnerer en boolean:•Hvis strengen ikke findes iarraylistenindsættes strengen i listen og metoden returnerer false•Hvis strengen findes i arraylisten returnerer metodentrue og printer ”The String has been found”";

    private ArrayList<String> ALString = new ArrayList<>();
    public HansKlasse(){
        ALString.add("kanon");
        ALString.add("vaporwave");
        ALString.add("synths er ikke mennesker, men måske ved de ikke det.");
    }

    public void printProblemDescription(){
        System.out.println(problemBeskrivelse);
    }

    public boolean doesArraylistContainString(ArrayList<String> ALString, String IAmLookingFor){
        for (String str :
                ALString) {
            if (str.equals(IAmLookingFor)) {
                System.out.println("True! Stringen matcher.");
            return true;}
            else {ALStringMethodAdd(IAmLookingFor);
            System.out.println("Innge mathc, string tilføjet til AL.");
            return false;}

    } return false;
}

    public boolean doesArraylistContainString2(String IAmLookingFor){ //testmetode uden parameter-arraylist
        for (String str :
                ALString) {
            if (str.equals(IAmLookingFor)) {
                System.out.println("True! Stringen matcher.");
            return true;}
            else {ALStringMethodAdd(IAmLookingFor);
            System.out.println("Innge mathc, string tilføjet til AL.");
            return false;}

    } return false;
}

    public void ALStringMethodAdd(String textAdd){
        System.out.println("Dette er tilføjermetoden.");
        ALString.add(textAdd);
    }

}
