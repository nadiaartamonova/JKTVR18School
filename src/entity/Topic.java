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
public class Topic {
    private Long id;
    private String TopicName;
    private Person person;
    private String Description;

    public Topic() {
    }

    public Topic(Long id, String TopicName, Person person, String Description) {
        this.id = id;
        this.TopicName = TopicName;
        this.person = person;
        this.Description = Description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicName() {
        return TopicName;
    }

    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Topic{" 
                + "id=" + id 
                + ", TopicName=" + TopicName 
                + ", person=" + person 
                + ", Description=" + Description 
                + '}';
    }

    
    
    
    
    
    
}
