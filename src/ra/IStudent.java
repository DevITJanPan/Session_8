package ra;

import ra.impl.Student;

import java.util.Scanner;

public interface  IStudent {
    public static final float MARK_PASS=5f;
    public abstract void inputData(Scanner scanner, Student[] arrStudent, int numberStudent);

    void inputData();

    public abstract void displayData();
    public abstract void calAvgMark();
}
