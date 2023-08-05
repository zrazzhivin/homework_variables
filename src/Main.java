public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Task 1");
        double dog1 = 8.0;
        var cat1 = 3.6;
        int paper1 = 763789;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        // task 2
        System.out.println("Task 2");
        var dog2 = dog1 - 4;
        var cat2 = cat1 - 4;
        var paper2 = paper1 - 4;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        // task 3
        System.out.println("Task 3");
        var dog3 = dog2 - 3.5;
        var cat3 = cat2 - 1.6;
        var paper3 = paper2 - 7639;
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);

        // task 4
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // task 5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // task 6
        System.out.println("Task 6");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var sum = weight1 + weight2;
        var diff = weight1 - weight2;
        System.out.println("Sum of weights: " + sum);
        System.out.println("Diff of weights: " + diff);

        // task 7
        System.out.println("Task 7");
        var diff1 = weight2 - weight1;
        var diff2 = weight2 % weight1;
        System.out.println("Diff1: " + diff1);
        System.out.println("Diff2: " + diff2);

        // task 8
        System.out.println("Task 8");
        var hours = 640;
        var hoursPerEmployee = 8;
        var numberOfEmployees = hours / hoursPerEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");

        numberOfEmployees = numberOfEmployees + 94;
        hours = numberOfEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");
    }
}