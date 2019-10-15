class toDoList{
    private String name;
    private String task;
    private String dueDate;
    private String status;
    toDoList(){
        this.name="";
        this.task="";
        this.dueDate="";
        this.status="";
    }
    toDoList(String n,String t, String d,String s){
        this.name=n;
        this.task=t;
        this.dueDate=d;
        this.status=s;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getTask(){
        return this.task;
    }
    public void setTask(String bt){
        this.task = bt;
    }
    public String getDueDate(){
        return this.dueDate;
    }
    public void setTitle(String dd){
        this.dueDate = dd;
    }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String state){
        this.status = state;
    }
    public String toString(){
        return ("Name = "+this.name+", task is = "+this.task+", duedate = "+this.dueDate+" Status is "+this.status);
    }

}
class Main{
    public static void main(String []args){
        listManager td = new listManager();
        td.addTask(new toDoList("Sleep", "Manage it", "26/09/2019", "Incomplete"));
        td.addTask(new toDoList("Eat", "Never Miss", "27/09/2019", "In process"));
        td.addTask(new toDoList("Travel", "Most Excited", "24/11/2019", "Complete"));
        td.addTask(new toDoList("Travel", "Explore Buddy", "29/09/2019", "Incomplete"));

        System.out.println("Displaying All pending tasks");
        td.printPending();

        System.out.println("Displaying all tasks for due date");
        td.printByDate("27/09/2019");

        System.out.println("Displaying all tasks by Task name");
        td.searchName("Travel");

        System.out.println("Displaying all tasks");
        td.printlist();

        System.out.println("Displaying all tasks that are over due");
        td.overDue();
    }
}