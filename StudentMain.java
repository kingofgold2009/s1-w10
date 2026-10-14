public class StudentMain{
    public static void main(String[] args) {
        Student p = new Student("UN", "Alvin");
        Student d = new Student("UN", "Grant");

        String a = p.getName();
        System.out.println(p.isSameClub(d));
    }
}