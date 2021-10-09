class Student {
    int roll;
    String name;

    void get_info(int a, String str) {
        roll = a;
        name = str;
    }

    void show_info() {
        System.out.println("Roll=" + roll);
        System.out.println("Student name=" + name);
    }
}

class Test extends Student {
    float part1, part2;

    void get_marks(float p1, float p2) {
        part1 = p1;
        part2 = p2;
    }

    void show_marks() {
        System.out.println("Part1 marks=" + part1 + "\tPart2 marks=" + part2);
    }
}

class Result extends Test {
    float total;

    void show_result() {
        total = part1 + part2;
        show_info();
        System.out.println("Marks of student");
        show_marks();
        total = part1 + part2;
        System.out.println("Result of student");
        System.out.println("Total marks=" + total);
    }
}

class multilevel {
    public static void main(String arg[]) {
        Result R = new Result();
        R.get_info(15, "Amar Nath");

        R.get_marks(234.35F, 231.78F);

        R.show_result();
    }
}
