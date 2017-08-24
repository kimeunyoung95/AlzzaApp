package org.sopt.alzza.tableview;

import org.sopt.alzza.model.Timetable;

/**
 * Created by jeonyongjin on 16. 7. 7..
 */
public class SetSubjectinfo {
    long id;

    String subject_number;
    String professor;
    String classroom;
    String subject_type;
    String subject_name;
    int day1;
    int day2;
    int start_time1;
    int start_time2;
    int end_time1;
    int end_time2;
    Timetable timetable;

    public SetSubjectinfo(){

    }


//    public SetSubjectinfo SetSubjectinfo(Timetable t){
//        this.id = t.getId();
//        this.subject_number = t.getSubject_number();
//        this.professor = t.getProfessor();
//        this.classroom = t.getClassroom();
//        this.subject_name = t.getSubject_name();
//        this.day1 = t.getDay1();
//        this.day2 = t.getDay2();
//        this.start_time1 = t.getStart_period1();
//        this.start_time2 = t.getStart_period2();
//        this.end_time1 = t.getEnd_period1();
//        this.end_time2 = t.getEnd_period2();
//        return this;
//    }

    public String[] Remodel_time1() {
        int gap_time = end_time1 - start_time1;
        int index = 0;
        String[] remodel_time = new String[gap_time + 1];
        if (gap_time > 1) {
            for (int i = this.start_time1; i <= i + gap_time; i++) {
                remodel_time[index] = String.valueOf(day1 + 1) + String.valueOf(i+1);
                index++;
            }
        } else if (gap_time == 1) {
            for (int i = this.start_time1; i <= i + gap_time; i++) {
                remodel_time[index] = String.valueOf(day1 + 1) + String.valueOf(i+1);
                index++;
            }
        } else {
            remodel_time[index] = String.valueOf(day1 + 1) + String.valueOf(start_time1+1);
        }
        return remodel_time;
    }
    public String[] Remodel_time2(){
        int gap_time = end_time2 - start_time2;
        int index = 0;
        String[] remodel_time = new String[gap_time + 1];
        if (gap_time > 1) {
            for (int i = this.start_time2; i <= i + gap_time; i++) {
                remodel_time[index] = String.valueOf(day2 + 1) + String.valueOf(i+1);
                index++;
            }
        } else if (gap_time == 1) {
            for (int i = this.start_time2; i <= i + gap_time; i++) {
                remodel_time[index] = String.valueOf(day2 + 1) + String.valueOf(i+1);
                index++;
            }
        } else {
            remodel_time[index] = String.valueOf(day2 + 1) + String.valueOf(start_time2+1);
        }
        return remodel_time;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
        this.id = timetable.getId();
        this.subject_number = timetable.getSubject_number();
        this.professor = timetable.getProfessor();
        this.classroom = timetable.getClassroom();
        this.subject_name = timetable.getSubject_name();
        this.day1 = timetable.getDay1();
        this.day2 = timetable.getDay2();
        this.start_time1 = timetable.getStart_period1();
        this.start_time2 = timetable.getStart_period2();
        this.end_time1 = timetable.getEnd_period1();
        this.end_time2 = timetable.getEnd_period2();
    }
}