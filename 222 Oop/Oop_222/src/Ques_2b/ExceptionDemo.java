package Ques_2b;

public class ExceptionDemo {
    void UserCheck(int age, int work_experience) throws InvaliedUserException{
        if (age < 50) throw new InvaliedUserException("Ineligible for Elderly pension because of age");
        if (work_experience < 20) throw new InvaliedUserException("Ineligible for Elderly pension because of work experience");
    }
}
