public class Exam_controller {
    Exam_view exam_view = new Exam_view();
    Exam_model exam_model = new Exam_model();

    public Exam_controller(){

    }

    public void start(){
        
        exam_model.addInfo(exam_view.enterField());
    }
    
}