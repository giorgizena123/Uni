public class University {
    private String name;
    private boolean isPublicUniversity;
    private int facultyCount;


    public University(String name, boolean isPublicUniversity, int facultyCount) {
        this.name = name;
        this.isPublicUniversity = isPublicUniversity;
        this.facultyCount = facultyCount;
    }


    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String personalId;
        private double averageGrade;
        private int year;


        public Student(String firstName, String lastName, int age, String personalId, double averageGrade, int year) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personalId = personalId;
            this.averageGrade = averageGrade;
            this.year = year;
        }


        public void printInfo() {
            System.out.println("Student: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Personal ID: " + personalId);
            System.out.println("Average Grade: " + averageGrade);
            System.out.println("Year: " + year);
        }
    }


    public void printInfo() {
        System.out.println("University: " + name);
        System.out.println("Public University: " + (isPublicUniversity ? "Yes" : "No"));
        System.out.println("Number of Faculties: " + facultyCount);
    }


    }
