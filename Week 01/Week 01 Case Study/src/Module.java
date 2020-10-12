public class Module
{
    private String moduleName;

    public String getName()
    {
        return this.moduleName;
    }

    public void setName(String name)
    {
        this.moduleName =name;
    }

    public Module(String name)
    {
        setName(name);
    }

    public Module()
    {
        this.moduleName="";
    }
}

class Assignment
{
    private int assignmentOne;
    private int assignmentTwo;

    public Assignment(int markOne, int markTwo)
    {
        this.assignmentOne =markOne;
        this.assignmentTwo =markTwo;
    }

    public int getAssignmentOneMarks()
    {
        return assignmentOne;
    }

    public int getAssignmentTwoMarks()
    {
        return assignmentTwo;
    }

    public void setAssignmentOneMarks(int marks)
    {
        this.assignmentOne =marks;
    }

    public void setAssignmentTwoMarks(int marks)
    {
        this.assignmentTwo =marks;
    }

    public void setAssignmentMarks(int markOne,int markTwo)
    {
        this.assignmentOne =markOne;
        this.assignmentTwo =markTwo;
    }

    public Assignment()
    {
        this.assignmentOne =0;
        this.assignmentTwo =0;
    }
}

class Project
{
    private int design;
    private int implementation;

    public Project(int designMark,int implementation)
    {
        
        this.design =designMark;
        this.implementation=implementation;
    }

    public Project()
    {
        this.design =0;
        this.implementation=0;
    }

    public void SetDesignMarks(int marks)
    {
        this.design =marks;
    }

    public void setImplementationMarks(int marks)
    {
        this.implementation =marks;
    }

    public int getDesignMarks()
    {
        return this.design;
    }

    public int getImplementationMarks()
    {
        return this.implementation;
    }

}

class FinalExam
{
    private int finalExamMarks;

    public FinalExam(int examMarks)
    {
        this.finalExamMarks=examMarks;
    }

    public FinalExam()
    {
        this.finalExamMarks=0;
    }

    public void setFinalExamMark(int examMarks)
    {
        this.finalExamMarks =examMarks;
    }

    public int getFinalExamMarks()
    {
        return this.finalExamMarks;
    }
}