public class Student 
{
    private String firstName;
    private String lastName;
    private String regNo;
    private Module module;
    private Assignment assignment = new Assignment();
    private Project project = new Project();
    private FinalExam exam = new FinalExam();

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getRegNo()
    {
        return this.regNo;
    }

    public Module getModule()
    {
        return module;
    }

    public String getModuleName()
    {
        return module.getName();
    }

    public int getAssignmentOneMarks()
    {
        return assignment.getAssignmentOneMarks();
    }

    public int getAssignmentTwoMarks()
    {
        return assignment.getAssignmentTwoMarks();
    }

    public int getDesignMarks()
    {
        return project.getDesignMarks();
    }

    public int getImplementationMarks()
    {
        return project.getImplementationMarks();
    }

    public int getFinalExamMarks()
    {
        return exam.getFinalExamMarks();
    }

    public void setFirstName(String firstName)
    {
        this.firstName =firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName =lastName;
    }

    public void setRegNo(String regNo)
    {
        this.regNo =regNo;
    }
    public void setModule(Module module)
    {
        this.module =module;
    }

    public void setAssignmentOneMarks(int markOne)
    {
        assignment.setAssignmentOneMarks(markOne);
    }

    public void setAssignmentTwoMarks(int marksTwo)
    {
        assignment.setAssignmentTwoMarks(marksTwo);
    }

    public void SetDesignMarks(int designMark)
    {
        project.SetDesignMarks(designMark);
    }

    public void setImplementationMarks(int implementationMark)
    {
        project.setImplementationMarks(implementationMark);
    }

    public void setFinalExamMark(int finalExamMark)
    {
        exam.setFinalExamMark(finalExamMark);
    }
}
