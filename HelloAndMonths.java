public class HelloAndMonths {
    public static void main(String[] args){
        System.out.println("Hello user!");

        String[] months = {"Styczen", "Luty", "Marzec", "Kwiecien", "Maj", "Czerwiec", "Lipiec", "Sierpien", "Wrzesien", "Pazdziernik", "Listopad", "Grudzien"};
        int index = 0;
        System.out.println("Miesiace w roku:");
        while (index < months.length){
            System.out.println(months[index]);
            index++;
        }
        System.out.println("Miesiace w roku, ktorych nazwy maja wiecej lub rowno cztery litery:");
        for(String month : months){
            if(month.length() >= 4){
                System.out.println(month);
            }
        }
    }
}
