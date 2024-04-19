public class Date {

    private String date;

    public Date(String date) throws IllegalArgumentException{

        if(date.length() != 10 || date.charAt(2) != ':' || date.charAt(5) != ':'){
            throw new IllegalArgumentException("Неправильно введена дата. Она должна быть типа: \n дд:мм:гггг \n Введите снова:");

        }
        else{
            
            String[] dateArr = date.split(":");
            

            try{
                int day = Integer.parseInt(dateArr[0]);
                int month = Integer.parseInt(dateArr[1]);
                int year = Integer.parseInt(dateArr[0]);

                if(day > 31 || day < 1 ){
                    throw new IllegalArgumentException("Неверно введён день \n Введите дату снова:");
                }
                else if( month > 12 || month < 1 ){
                    throw new IllegalArgumentException("Неверно введён месяц \n Введите дату снова:");
                }
                else if( year > 9999 || year < 0){
                    throw new IllegalArgumentException("Неверно введён год \n Введите дату снова:");
                }
                else{
                    this.date = date;
                }
            }
            catch(IllegalArgumentException e){
                throw new IllegalArgumentException("Некорректно введена дата \n Введите снова:");
            }
            
            
        }
        
    

    }

    public String toString(){
        return date;
    }
    
}
