public static void main(String[] args) {
    Map<String, ArrayList> abon = new HashMap<>() {
        {
            put("Витальевич", new ArrayList<Integer>() {
                {
                    add(795034554);
                    add(234576);
                    add(791361423);
                }
            });
            put("Персиков", new ArrayList<Integer>() {
                {
                    add(555464);
                }
            });
            put("Петров", new ArrayList<Integer>() {
                {
                    add(234774);
                    add(238765);

                }
            });
            put("Иванов", new ArrayList<Integer>() {
                {
                    add(654722);
                    add(141844);
                    add(224657);
                    add(951654);
                }
            });
        }
    };
    System.out.println();
    System.out.println("Исходные данные: ");
    sortedPrint(abon);

    
    Scanner scan = new Scanner(System.in, "cp866");
    Boolean getOut = false;
    String st;
    while (!getOut) {
        System.out.println("Введите номер действия (1 - добавить абонента, 9 - выйти из программы):");
        st = scan.nextLine();
        String name = "";
        String phString;
        switch (st) {
            case "1": {
                System.out.println("Введите фамилию абонента:");
                name = scan.nextLine();
                if (abon.containsKey(name)) {
                    System.out.println("Такая фамилия уже есть. Больше фантазии!");
                    System.out.println();
                    break;
                } else {
                    System.out.println("Введите номера телефонов через запятую: ");
                    phString = scan.nextLine();
                    String[] arr = phString.split(",");
                    ArrayList<Integer> arrInt = new ArrayList<>();
                    for (String item: arr) {
                        arrInt.add(Integer.parseInt(item.trim())) ;
                    }
                    abon.put(name, arrInt);
                    System.out.println();
                    sortedPrint(abon);
                    break;
                }
            }
            case "9": {
                getOut = true;
                System.out.println();
                System.out.println("До свидания!");
                System.out.println();
                break;
            }   
                
           
        }
    }
}

}