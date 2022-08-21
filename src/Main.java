public class Main {
    public static void main(String[] args) {
        // Task1
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.printf("ФИО сотрудника — %s", fullName);

            //Task 2
            System.out.println();
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        }

        // Task 3.1
        {
            System.out.println();
            String fullName = "Иванов Семён Семёнович";
            String full = fullName.replaceAll("ё", "е");
            System.out.println("Данные ФИО сотрудника — " + full);
        }
        //Task 3.2
        System.out.println();
        {
            String fullName = "Иванов Семён Семёнович";
            String[] parts = fullName.split(" ");
            String result = " ";
            for (String part : parts) {
                if (part.contains("ё")) {
                    String yo = part.replace("ё", "е");
                    result = result + yo;
                } else {
                    result = result + part;
                }
                result += " ";
            }
            System.out.printf("Данные ФИО сотрудника — %s ", result);
        }
    }
}
