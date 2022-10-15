public class Main extends Teacher{
    protected Main() {
        super("A","B","C");
    }
    public static void main(String[] args) {
        Teacher obj = new Teacher("Teacher","CET","Programming");
        College codybuilding = new College();


        System.out.println(obj.collegeName);
        System.out.println(obj.getDesignation());
        System.out.println(obj.getSubjectName());

        obj.setDesignation("Lecturer");
        System.out.println(obj.getDesignation());
        codybuilding.USLS();
        codybuilding.BSIT2A();

        System.out.println(obj.getSubjectName());

        obj.does();



    }
}