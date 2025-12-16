package OOPs;

public class Main {



    public static void main(String[] args) {
        Student[] student = new Student[5];

        Student kunal = new Student();
        System.out.println(kunal.naam);
        kunal.greetings();
        Student nup = new Student(15,"nuoiie",25.0f);

        System.out.println(nup.marks);
    }

    static class Student {
        int rol;
        String naam;
        float marks;

        public Student(int rol, String naam, float marks) {
            this.rol = rol;
            this.naam = naam;
            this.marks = marks;
        }

        void greetings() {
            System.out.println("hello " + this.naam);
        }
        Student() {
            this.naam = "nupoor";
            this.rol =54;
            this.marks = 45.8f;
        }

    }
}
