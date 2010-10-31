package com.tw.gae.ixpense.domain;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;
import com.google.appengine.api.xmpp.JID;

import javax.jdo.annotations.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
public class Question {

  @PrimaryKey
  @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
  private Key key;

  @Persistent(defaultFetchGroup = "true")
  private Text question;

  @Persistent
  private String asker;

  @Persistent
  private Date asked;

  @Persistent(defaultFetchGroup = "true")
  private Text answer;

  @Persistent
  private String answerer;

  @Persistent
  private Date answered;

  @Persistent(defaultFetchGroup = "true")
  private List<String> assignees;

  @Persistent
  private Date lastAssigned;

  public Key getKey() {
    return key;
  }

  public String getQuestion() {
    if (question == null) {
      return "";
    }

    return question.getValue();
  }

  public String getAsker() {
    return asker;
  }

  public Date getAsked() {
    return asked;
  }

  public String getAnswer() {
    if (answer == null) {
      return "";
    }

    return answer.getValue();
  }

  public String getAnswerer() {
    return answerer;
  }

  public Date getAnswered() {
    return answered;
  }

  public List<String> getAssignees() {
    if (assignees == null) {
      assignees = new ArrayList<String>();
    }

    return assignees;
  }

  public Date getLastAssigned() {
    return lastAssigned;
  }

  public void setQuestion(String question) {
    this.question = new Text(question);
  }

  public void setAsker(JID asker) {
    this.asker = asker.getId();
  }

  public void setAsked(Date asked) {
    this.asked = asked;
  }

  public void setAnswer(String answer) {
    this.answer = new Text(answer);
  }

  public void setAnswerer(JID answerer) {
    this.answerer = answerer.getId();
  }

  public void setAnswered(Date answered) {
    this.answered = answered;
  }

  public void setLastAssigned(Date lastAssigned) {
    this.lastAssigned = lastAssigned;
  }
}


