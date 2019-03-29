package com.stackroute;

public class Student {
    int avg;
    int min,max;
    @Override
    public boolean equals(Object o) {
        return (this == o);
    }
    public Student(int av, int mi, int ma) {
        avg = av;
        min = mi;
        max = ma;
    }


}
