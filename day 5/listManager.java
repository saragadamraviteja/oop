import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.time.format.DateTimeFormatter;
class listManager{
    toDoList [] list = new toDoList [10];
    int list_cnt=0;
    public void addTask(toDoList lst) {
        list[list_cnt] = lst;
        list_cnt+=1;
    }
    public String deleteTask(String searchName) {
        //  Your code goes here....
        for (int i=0; i<list_cnt; i++){
            if (list[i].getName()==searchName){
                for(int j = i; j < list_cnt -1; j++){
                    list[i] = list[i + 1];
                }
                list[list_cnt]=null;
                list_cnt-=1;
                return "Deleted";
            }
        }
        return "Not found";
    }
    public void updateStatus(String name,String state){
        for (int i=0; i<list_cnt; i++){
            if (list[i].getName()==name){
                list[i].setStatus(state);
           }
        }
    }
    public void printPending(){
        for (int i=0; i<list_cnt; i++){
            if (list[i].getStatus().compareTo("pending")==0 || list[i].getStatus().compareTo("incomplete")==0){
                System.out.println(list[i].toString());
           }
        }
    }
    public void printByDate(String date){
        for (int i=0; i<list_cnt; i++){
            if (list[i].getDueDate().compareTo(date)==0 ){
                System.out.println(list[i].toString());
           }
        }
    }
    public void printlist(){
        for(int i = 0; i < list_cnt;i++){
            System.out.println(list[i].toString());
        }
    }
    public toDoList searchName(String searchName) {
        //  Your code goes here....
        for (int i=0; i<list_cnt; i++){
            if (list[i].getName()==searchName){
                System.out.println(list[i].toString());
            }
        }
        return null;
    }
    public void overDue(){
        try{
            for (int i=0;i<list_cnt;i++){
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
                String dateString = format.format( new Date()   );
                Date date = format.parse( list[i].getDueDate() );
                if (date.before(new Date())){
                    System.out.println(list[i].toString());
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        } 
    }
}