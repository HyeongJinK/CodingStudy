package khj.study;


import java.util.Arrays;
import java.util.Comparator;

class Interval{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end =0;
    }
    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }
}

public class MeetingRoom {
    public static void main(String[] args) {
        MeetingRoom a = new MeetingRoom();

        Interval in1 = new Interval(15,20);
        Interval in2 = new Interval(5,10);
        Interval in3 = new Interval(0,30);

        Interval[] intervals = {in1, in2,in3};
        System.out.println(a.solve(intervals));
    }

    public boolean solve(Interval[] intervals) {
        if (intervals == null) {
            return false;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a.start));

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start > intervals[i - 1].end) {
                return false;
            }
        }

        return true;
    }
}
