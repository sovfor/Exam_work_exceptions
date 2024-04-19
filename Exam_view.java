import java.util.Scanner;
class Exam_view{
    Scanner scanner = new Scanner(System.in);
    private String[] field;

    public Exam_view(){

    }
    
    public String[] enterField(){
        String[] inField;
        String str;
        while (true) {
            System.out.println("Введите данные о ФИО, даты рождения(дд:мм:гггг), номера телефона(без знаков, 11 цифр) и пола(в формате f или m) через пробел без раздилителей:");
            str = scanner.nextLine();
            inField = str.split(" ");
         
            if(inField.length != 6){
            System.err.println("Данные введены в неполном или переполненном количестве \n");
            }
            else{
                break;
         }
        }
        

            boolean completed = false;
            try{
                Date date = new Date(inField[3]);
                completed = true;
                
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            if(!completed){
                while (true) {
                    try{
                        Date date = new Date(scanner.nextLine());
                        inField[3] = date.toString();
                        break;
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    
                }
            }
        
            completed = false;
            

            try{
                Long num = Long.parseLong(inField[4]);
                
                if(inField[4].length() != 11){
                    throw new IllegalArgumentException();
                }

                completed = true;
                
            }
            catch(IllegalArgumentException e){
                System.err.println("Неправильно введён номер телефона \n Введите снова:");
            }
            

            if(!completed){
                while (true) {

                    try{
                        Long num = Long.parseLong(scanner.nextLine());
                        if(num.toString().length() != 11){
                            throw new IllegalArgumentException();
                        }
                        inField[4] = num.toString();
                        break;
                    
                    }
                    catch(IllegalArgumentException e){

                        System.err.println("Неправильно введён номер телефона \n Введите снова:");
                    }
                
                }
            }



        String gender;
        Character pol;
        if(inField[5].length() != 1){
            while(true){
                System.out.println("Пол введён неправильно \n Введите снова:");
                gender = scanner.nextLine();
                if(gender.length() == 1){
                    pol = gender.charAt(0);
                    if(pol == 'M' || pol == 'F' || pol == 'm' || pol == 'f'){
                        inField[5] = pol.toString();
                        break;
                    } 
                    
                }
            }
            
        }
        else{
            while(true){
                pol = str.charAt(str.length() - 1);
                if(pol == 'M' || pol == 'F' || pol == 'm' || pol == 'f'){
                    inField[5] = pol.toString();
                    break;
                } 
                else{
                    System.out.println("Пол введён неправильно \n Введите снова:");
                    gender = scanner.nextLine();
                    if(gender.length() == 1){
                        pol = gender.charAt(0);
                        if(pol == 'M' || pol == 'F' || pol == 'm' || pol == 'f'){
                            inField[5] = pol.toString();
                            break;
                        } 
                        
                    } 
                }
            }
            
        }
        
        return inField;
        
    }
    
    
}