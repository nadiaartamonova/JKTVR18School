/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Outcome {
    private Long id;
    private Person personPupil;
    private Person personTeacher;
    private Topic TopicName;
    private int Grade;

    public Outcome() {
    }

    public Outcome(Long id, Person personPupil, Person personTeacher, Topic TopicName, int Grade) {
        this.id = id;
        this.personPupil = personPupil;
        this.personTeacher = personTeacher;
        this.TopicName = TopicName;
        this.Grade = Grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPersonPupil() {
        return personPupil;
    }

    public void setPersonPupil(Person personPupil) {
        this.personPupil = personPupil;
    }

    public Person getPersonTeacher() {
        return personTeacher;
    }

    public void setPersonTeacher(Person personTeacher) {
        this.personTeacher = personTeacher;
    }

    public Topic getTopicName() {
        return TopicName;
    }

    public void setTopicName(Topic TopicName) {
        this.TopicName = TopicName;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int Grade) {
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "Outcome{" 
                + "id=" + id 
                + ", personPupil=" + personPupil 
                + ", personTeacher=" + personTeacher 
                + ", TopicName=" + TopicName 
                + ", Grade=" + Grade 
                + '}';
    }
    

    public enum enumGrade{
            FAIL,
            CouldBeBetter,
            OK,
            YouAreGod;
        }    
    
}
