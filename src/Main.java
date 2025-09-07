//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Задание №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Задание №2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Задание №3
        dog =dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Задание №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        System.out.println();

        //Задание №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        //Задание №6
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        var sumWeight = firstWeight + secondWeight;
        System.out.println("Общая масса обоих боксеров равна " + sumWeight + " кг");
        var diffWeight = firstWeight - secondWeight;
        System.out.println("Разница между массами бойцов равна " + diffWeight + " кг");
        System.out.println();

        //Задание №7
        var remainderWeight = secondWeight%firstWeight;
        System.out.println("Остаток от деления равен " + remainderWeight + " кг");
        System.out.println();

        //Задание№8
        var totalWorkingHours = 640;
        var workingHoursPerOneEmployee = 8;
        var numberOfEmployees = totalWorkingHours/workingHoursPerOneEmployee;
        System.out.println("Всего работников в компании " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        var newTotalWorkingHours = 94*8;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + newTotalWorkingHours + " часов работы может быть поделено между сотрудниками");

    }
}