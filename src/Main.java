import Classes.FamilyTree;
import Classes.Human;

import static Classes.Gender.female;
import static Classes.Gender.male;

public class Main {
    public static void main(String[] args){

        FamilyTree tree =new FamilyTree();
        Human as=new Human(1,"Пушкин","","Александр","Сергеевич",male, "2nd October 2007","1837- 01 -26",null,null);
        //Human nn=new Human(2,"Пушкина","Гончарова","Наталья","Николаевна",female,8-9-1812,8-12-1863);

        tree.add(as);
    }



}
